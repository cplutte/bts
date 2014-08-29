package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSThsEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSThsEntryServiceImpl extends
		GenericObjectServiceImpl<BTSThsEntry, String> implements
		BTSThsEntryService, BTSObjectSearchService {

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_CORPORA, nodePath = "org.bbaw.bts.app")
	private String active_corpora;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_corpus_key;
	@Inject
	private BTSThsEntryDao thsEntryDao;

	@Override
	public List<BTSThsEntry> list(String dbPath, String queryId,
			String objectState) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BTSThsEntry createNew() {
		BTSThsEntry entry = BtsCorpusModelFactory.eINSTANCE.createBTSThsEntry();
		super.setId(entry);
		super.setRevision(entry);
		entry.setCorpusPrefix(main_corpus_key);
		return entry;
	}

	@Override
	public boolean save(BTSThsEntry entity) {
		super.addRevisionStatement(entity);
		thsEntryDao.add(entity, entity.getProject() + BTSCorpusConstants.THS);
		return true;
	}

	@Override
	public void update(BTSThsEntry entity) {
		thsEntryDao.update(entity, entity.getProject() + BTSCorpusConstants.THS);

	}

	@Override
	public void remove(BTSThsEntry entity) {
		thsEntryDao.remove(entity, entity.getProject() + BTSCorpusConstants.THS);

	}

	@Override
	public BTSThsEntry find(String key) {
		BTSThsEntry entry = null;
		entry = thsEntryDao.find(key, main_project + BTSCorpusConstants.THS);
		if (entry != null) {
			return entry;
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			entry = thsEntryDao.find(key, p + BTSCorpusConstants.THS);
			if (entry != null) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSThsEntry> list(String objectState) {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			entries.addAll(thsEntryDao.list(p + BTSCorpusConstants.THS,
					objectState));
		}
		return filter(entries);
	}

	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState,
			boolean registerQuery) {
		List<BTSThsEntry> objects = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {

			objects.addAll(thsEntryDao.query(query, p + BTSCorpusConstants.THS, p
					+ BTSCorpusConstants.THS, objectState, registerQuery));

		}
		return filter(objects);
	}
	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSThsEntry> listRootEntries() {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			entries.addAll(thsEntryDao.list(p + BTSCorpusConstants.THS,
					DaoConstants.VIEW_THS_ROOT_ENTRIES));
		}
		return filter(entries);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSThsEntry";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSThsEntry.class;
	}
}
