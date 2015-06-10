package org.bbaw.bts.core.services.corpus;

import java.util.List;

import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.eclipse.core.runtime.IProgressMonitor;

public interface BTSLemmaEntryService extends
GenericCorpusObjectService<BTSLemmaEntry, String> {

	List<BTSLemmaEntry> findLemmaProposals(BTSWord word, IProgressMonitor monitor);

	BTSAnnotation createNewAnnotationRelationPartOf(
			BTSCorpusObject annotatedObject);

	String processWordCharForLemmatizing(BTSWord word);

	String processWordCharForLemmatizing(String wordChars);

	
}
