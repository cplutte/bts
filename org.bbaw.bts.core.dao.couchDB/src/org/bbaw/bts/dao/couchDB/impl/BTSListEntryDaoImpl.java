package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSListEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;

import com.google.gson.JsonObject;

@Creatable
public class BTSListEntryDaoImpl extends CouchDBDao<BTSListEntry, String> implements BTSListEntryDao
{

	@Override
	public boolean removeBTSListEntry(BTSListEntry listEntry, String path)
	{
		// TODO Auto-generated method stub
		super.remove(listEntry, path);
		return true;
	}

	@Override
	public List<BTSListEntry> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSLISTENTRIES;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSLISTENTRIES;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSLISTENTRIES;
		}
		List<JsonObject> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path)
.view(viewId)
				.includeDocs(true).query(JsonObject.class);
		ArrayList<BTSListEntry> results = new ArrayList<BTSListEntry>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
			if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(getLocalDBURL() + path + jo.get(DaoConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				BTSListEntry en = (BTSListEntry) resource.getContents().get(0);
				checkForConflicts(en, path);
				results.add(en);
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}
}
