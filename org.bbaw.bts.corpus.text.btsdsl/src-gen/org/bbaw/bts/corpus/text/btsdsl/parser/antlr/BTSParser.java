/*
* generated by Xtext
*/
package org.bbaw.bts.corpus.text.btsdsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.bbaw.bts.corpus.text.btsdsl.services.BTSGrammarAccess;

public class BTSParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BTSGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.bbaw.bts.corpus.text.btsdsl.parser.antlr.internal.InternalBTSParser createParser(XtextTokenStream stream) {
		return new org.bbaw.bts.corpus.text.btsdsl.parser.antlr.internal.InternalBTSParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "BTSTextContent";
	}
	
	public BTSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BTSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}