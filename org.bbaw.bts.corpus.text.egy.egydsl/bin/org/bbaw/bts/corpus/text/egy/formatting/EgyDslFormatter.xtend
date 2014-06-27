/*
 * generated by Xtext
 */
package org.bbaw.bts.corpus.text.egy.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
 import com.google.inject.Inject;
import org.bbaw.bts.corpus.text.egy.services.EgyDslGrammarAccess
import org.eclipse.xtext.Keyword

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class EgyDslFormatter extends AbstractDeclarativeFormatter {

	@Inject extension EgyDslGrammarAccess f
	
	override protected void configureFormatting(FormattingConfig c) {
		c.setAutoLinewrap(70);
		c.setNoSpace().getRight();
		c.setNoSpace().getSpace();
		c.setNoSpace().getLeft();
		c.setNoSpace().after(f.getEGYSTRINGRule());
		 c.setNoSpace().before(f.getEGYSTRINGRule());

		c.setNoSpace().around(f.getAbstractMarkerRule());
		// c.setNoSpace().after(f.getAbstractMarkerRule());

		c.setNoSpace().around(f.getAmbivalenceRule());
		// c.setNoSpace().after(f.getAmbivalenceRule());

		c.setNoSpace().around(f.getCaseRule());
		// c.setNoSpace().after(f.getCaseRule());

		c.setNoSpace().after(f.getBracketsRule());
		// c.setNoSpace().before(f.get);

		for (Keyword k : f.findKeywords("%", "#", "?")) {
			c.setNoSpace().around(k);
		}
		for (Keyword k : f.findKeywords("@", "§")) {
			c.setNoSpace().before(k);
		}
		for (Keyword k : f.findKeywords("(", "((", "{", "[", "<" , '\u2E22', "-", ".", ";", '\u2261','\u22ee', "case")) {
			c.setNoSpace().after(k);
		}
  }
}