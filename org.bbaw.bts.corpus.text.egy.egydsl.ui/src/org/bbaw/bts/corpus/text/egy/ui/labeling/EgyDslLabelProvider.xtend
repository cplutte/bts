/*
* generated by Xtext
*/
package org.bbaw.bts.corpus.text.egy.ui.labeling

import com.google.inject.Inject
import org.bbaw.bts.corpus.text.egy.egyDsl.Word
import org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle
import org.bbaw.bts.corpus.text.egy.egyDsl.WordPart
import org.bbaw.bts.corpus.text.egy.egyDsl.Chars

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class EgyDslLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	def text(Word w) {
		w.WChar
	}
	def text(Chars w) {
		w.name
	}

//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
