package org.bbaw.bts.core.remote.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.remote.dao.RemoteDBConnectionProvider;
import org.bbaw.bts.core.remote.dao.RemoteGenericDao;
import org.bbaw.bts.core.remote.dao.util.RemoteDaoConstants;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.search.SearchHit;
import org.lightcouch.CouchDbClient;
import org.lightcouch.DesignDocument;
import org.lightcouch.NoDocumentException;
import org.lightcouch.Params;
import org.lightcouch.View;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@Creatable
public abstract class RemoteCouchDBDao<E extends BTSDBBaseObject, K extends Serializable> implements
		RemoteGenericDao<E, K>
{

	protected Class<? extends BTSDBBaseObject> daoType;

	@Inject
	protected RemoteDBConnectionProvider connectionProvider;

	@Inject
	private IEclipseContext context;

	protected String protocol;
	protected String host;
	protected int port;

	private Pattern idPattern = Pattern.compile(RemoteDaoConstants.ID_PATTERN);

	@SuppressWarnings("unchecked")
	public RemoteCouchDBDao()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}

	@Override
	public void add(E entity, String path)
	{

		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING); // set
																			// encoding
		
		// to
		// UTF-8
		Resource resource = entity.eResource();
		if (resource == null)
		{
			URI uri = URI.createURI(getRemoteDBURL() + "/" + path + "/" + entity.get_id());
			resource = connectionProvider.getEmfResourceSet().createResource(uri);
			resource.getContents().add(entity);
		}
		try
		{
			resource.save(options);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public void update(E entity, String path)
	{
		// FIXME implement Update
		URI uri = URI.createURI(getRemoteDBURL() + "/" +  path + "/" +  entity.get_id());
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
		resource.getContents().add(entity);

		try
		{
			resource.save(null);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public void remove(E entity, String path)
	{
		if (entity == null) return;
		URI uri = URI.createURI(getRemoteDBURL() + "/" +  path + "/" +  entity.get_id());
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
		resource.getContents().add(entity);

		if (resource != null) {
			try {
				resource.delete(null);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Delete Resource failed");
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public E find(K key, String path)
	{
		URI uri = URI.createURI(getRemoteDBURL() + "/" + path + "/" + key.toString());
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		if (resource.getContents().size() > 0)
		{
			Object o = resource.getContents().get(0);
			if (o instanceof BTSDBBaseObject)
			{
				return (E) o;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E find(K key, String path, String revision)
	{
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		InputStream is = dbClient.find((String)key, revision);
		final JSONLoad loader = new JSONLoad(is, new HashMap<Object, Object>());
		Collection<EObject> objects = loader.loadObjects(connectionProvider.getEmfResourceSet());
		if (!objects.isEmpty())
		{
			Object o =  objects.iterator().next();
			if (o instanceof BTSDBBaseObject)
			{
				return (E)o;
			}
		}
		return null;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> list(String path)
	{
		List<JsonObject> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path)
				.view(RemoteDaoConstants.VIEW_ALL_DOCS).includeDocs(true).query(JsonObject.class);
		ArrayList<BTSDBBaseObject> results = new ArrayList<BTSDBBaseObject>();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		connectionProvider.getEmfResourceSet().getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(RemoteDaoConstants.ID_STRING).getAsString());
			if (!jo.get(RemoteDaoConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(getRemoteDBURL() + "/" +  path + "/" +  jo.get(RemoteDaoConstants.ID_STRING).getAsString());
				Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSDBBaseObject) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(RemoteDaoConstants.VIEW_ALL_DOCS, path);
		}
		return (List<E>) results;
	}

	@Override
	public E reload(K key, String path)
	{
		URI uri = URI.createURI(getRemoteDBURL() + "/" + path + "/" + key.toString());
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		EObject eObject = resource.getContents().get(0);
		Copier copier = new Copier();
		EClass eClass = eObject.eClass();

		if (resource.getContents().size() > 0)
		{
			ResourceSet tempResourceSet = new ResourceSetImpl();
			tempResourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());

			Resource tempResource = tempResourceSet.getResource(uri, true);
			EObject copyEObject = tempResource.getContents().get(0);
			if (copyEObject instanceof BTSDBBaseObject)
			{

				eObject = EmfModelHelper.mergeChanges(eObject, copyEObject);
				return (E) eObject;
			}
		}
		return null;
	}

	public void createView(String path, String sourcePath, String viewName)
	{
		System.out.println("path " + path + " viewName " + viewName);
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		// design documents stored on local .js files

		DesignDocument designDoc = dbClient.design().getFromDesk(sourcePath);
		// designDoc.new DesignDocument();//
		dbClient.design().synchronizeWithDb(designDoc); // sync with db
		// dbClient.syncDesignDocsWithDb(); // sync all
	}

	public String extractIdFromObjectString(String objectString)
	{

		Matcher m = idPattern.matcher(objectString);

		if (m.find())
		{
			System.out.println(m.group(2));
		}
		return m.group(2);
	}

	@Override
	public List<E> query(BTSQueryRequest query, String indexName, String indexType)
	{

		SearchResponse response = connectionProvider.getSearchClient(Client.class).prepareSearch(indexName)
				.setTypes(indexType).setSearchType(SearchType.DFS_QUERY_THEN_FETCH).setQuery(query.getQueryBuilder()) // Query
				// .setFilter(FilterBuilders.rangeFilter("age").from(12).to(18))
				// // Filter
				.setFrom(0).setSize(60).setExplain(true).execute().actionGet();
		List<E> result = new Vector<E>();
		for (SearchHit hit : response.getHits())
		{
			try
			{
				result.add(loadObjectFromHit(hit, indexName));
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		if (!result.isEmpty())
		{
			registerQueryWithPercolator(query, indexName, indexType);
		}

		return result;
	}

	protected void registerQueryWithPercolator(BTSQueryRequest query, String indexName, String indexType)
	{
		// register query with percolator
		// Index the query = register it in the percolator
		try
		{
			connectionProvider
					.getSearchClient(Client.class)
					.prepareIndex("_percolator", indexName, query.getQueryId())
					.setSource(
							XContentFactory.jsonBuilder().startObject().field("query", query.getQueryBuilder())
									.endObject()).setRefresh(true).execute().actionGet();
		} catch (ElasticsearchException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void registerQueryIdWithInternalRegistry(String queryId, String path)
	{
		Map<String, List<String>> map = (Map<String, List<String>>) context.get(RemoteDaoConstants.QUERY_ID_REGISTRY);
		List<String> ids = null;
		if (map == null)
		{
			map = new HashMap<String, List<String>>(5);
			context.set(RemoteDaoConstants.QUERY_ID_REGISTRY, map);
		}
		if (map.containsKey(path))
		{
			ids = map.get(path);
		} else
		{
			ids = new Vector<String>(1);
		}
		ids.add(queryId);
		map.put(path, ids);
	}

	private E loadObjectFromHit(SearchHit hit, String indexName)
	{
		if (hit.getSource() != null)
		{
			return loadResourceFromString(hit.getId(), hit.getSourceAsString(), indexName);
		}
		return null;
	}

	private E loadResourceFromString(String id, String sourceAsString, String indexName)
	{
		URI uri = URI.createURI(getRemoteDBURL() + "/" + indexName + "/" + id);
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		System.out.println(sourceAsString);
		InputStream inputStream;
		try
		{
			inputStream = new ByteArrayInputStream(sourceAsString.getBytes(BTSConstants.ENCODING));
			final JSONLoad loader = new JSONLoad(inputStream, new HashMap<Object, Object>());
			loader.fillResource(resource);
			return ((E) resource.getContents().get(0));
		} catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		return find((K) id, "/" + indexName + "/");
	}

	@Override
	public boolean objectIsLoaded(String dbPath, String objectId)
	{
		URI uri = URI.createURI(getRemoteDBURL() + "/" + dbPath + "/" + objectId);
		Map map = ((ResourceSetImpl) connectionProvider.getEmfResourceSet()).getURIResourceMap();
		if (map == null)
		{
			return false;
		}
		return map.containsKey(uri);

	}

	@Override
	public List<E> findByQueryId(String searchId, String path)
	{
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{
			view = client.view(searchId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			createView(path, path, searchId);
			view = client.view(searchId);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<E> results = new ArrayList<E>();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		connectionProvider.getEmfResourceSet().getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getRemoteDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
				Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((E) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(searchId, path);
		}
		return results;
	}

	protected String getRemoteDBURL()
	{
		return connectionProvider.getRemoteDBURL();
	}

	public boolean isAuthorizedUser(String userName, String passWord)
	{
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, RemoteDaoConstants.ADMIN, userName,
				passWord);
		client.find("test");

		return false;

	}
	
	public void setDeleted(E entity, String path, boolean deleted) {
		if (entity == null)
			return;
		entity.set_deleted(deleted);
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING); // set
																			// encoding
																			// to
		// UTF-8
		Resource resource = entity.eResource();
		if (resource == null)
		{
			URI uri = URI.createURI(getRemoteDBURL() + "/" + path + "/" + entity.get_id());
			resource = connectionProvider.getEmfResourceSet().createResource(uri);
			resource.getContents().add(entity);
		}
		try
		{
			resource.save(options);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}
	
	@Override
	public List<DBRevision> listAvailableRevisions(K key, String path) {
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		Params params = new Params();
		params.addParam("revs_info", "true");
		List<DBRevision> revisions = new Vector<DBRevision>();
		JsonObject jsonObject = dbClient.find(JsonObject.class, (String) key,
				params);
		for (JsonElement rev : jsonObject.getAsJsonArray("_revs_info")) {
			JsonElement rev_info = rev.getAsJsonObject().get("rev");
			String docRev = rev_info.getAsString();
			JsonElement rev_av = rev.getAsJsonObject().get("status");
			String rev_av_str = rev_av.getAsString();
			DBRevision r = new DBRevision();
			r.setRevision(docRev);
			if ("available".equals(rev_av_str))
			{
				r.setLocation(DBRevision.REMOTE);
			}
			else
			{
				r.setLocation(DBRevision.NOT_AVAILABLE);
			}
			revisions.add(r);
		}
		return revisions;
	}

}