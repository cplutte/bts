function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSTextCorpus' && doc.state == 'active'){
		emit(doc._id, {"name": doc.name, "eClass": doc.eClass, "type": doc.type, "subtype": doc.subtype, "sortKey" : doc.sortKey, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, 
		"revisionState": doc.revisionState, "corpusPrefix": doc.corpusPrefix, "relations": doc.relations});
		
	}
}