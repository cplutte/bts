package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;

import com.google.gson.JsonObject;

public class CorpusObjectDaoImpl extends CouchDBDao<BTSCorpusObject, String> implements CorpusObjectDao
{

	@Override
	public List<BTSCorpusObject> getRootBTSCorpusObjects()
	{
		List<JsonObject> allDocs = dbClient.view(CouchDBConstants.VIEW_ALL_DOCS).includeDocs(true)
				.query(JsonObject.class);
		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(CouchDBConstants.ID_STRING).getAsString());
			if (!jo.get(CouchDBConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB
						+ jo.get(CouchDBConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				Object o = resource.getContents().get(0);
				if (o instanceof BTSCorpusObject)
				{
					results.add((BTSCorpusObject) o);
				}
			}
		}
		return results;
	}

	@Override
	public List<BTSCorpusObject> list()
	{
		List<JsonObject> allDocs = dbClient.view(CouchDBConstants.VIEW_ALL_CORPUS_OBJECTS).includeDocs(true)
				.query(JsonObject.class);
		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(CouchDBConstants.ID_STRING).getAsString());
			if (!jo.get(CouchDBConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB
						+ jo.get(CouchDBConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSCorpusObject) resource.getContents().get(0));
			}
		}
		return results;
	}
}
