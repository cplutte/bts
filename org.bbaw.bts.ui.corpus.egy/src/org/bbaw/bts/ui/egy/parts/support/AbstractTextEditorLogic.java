package org.bbaw.bts.ui.egy.parts.support;

import java.util.Map;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.ui.commons.corpus.text.BTSAnnotationAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSCommentAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.BTSTextXtextEditedResourceProvider;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.RubrumDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextdrawingStrategy;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.validation.Issue;

public abstract class AbstractTextEditorLogic {
	
	


	@SuppressWarnings("restriction")
	protected void configureEditorDrawingStrategies(AnnotationPainter painter) {
		IAnnotationAccess annotationAccess = new IAnnotationAccess() {
			public Object getType(Annotation annotation) {
				return annotation.getType();
			}

			public boolean isMultiLine(Annotation annotation) {
				return true;
			}

			public boolean isTemporary(Annotation annotation) {
				return true;
			}
		};

		

		// Lemma
		ITextStyleStrategy strategy = new org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy();
		painter.addTextStyleStrategy(BTSLemmaAnnotation.TYPE, strategy);
		painter.setAnnotationTypeColor(BTSLemmaAnnotation.TYPE,
				BTSUIConstants.COLOR_LEMMA);
		painter.addAnnotationType(BTSLemmaAnnotation.TYPE, BTSLemmaAnnotation.TYPE);

		// comment
		CommentDrawingStrategy commentStrategy = new CommentDrawingStrategy();
		painter.addDrawingStrategy(BTSCommentAnnotation.TYPE, commentStrategy);
		painter.setAnnotationTypeColor(BTSCommentAnnotation.TYPE,
				BTSUIConstants.COLOR_COMMENT);
		painter.addAnnotationType(BTSCommentAnnotation.TYPE,
				BTSCommentAnnotation.TYPE);

		// comment highlighted
		CommentHighlightedDrawingStrategy commenthighStrategy = new CommentHighlightedDrawingStrategy();
		painter.addDrawingStrategy(BTSCommentAnnotation.TYPE_HIGHLIGHTED,
				commenthighStrategy);
		painter.setAnnotationTypeColor(BTSCommentAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_COMMENT);
		painter.addAnnotationType(BTSCommentAnnotation.TYPE_HIGHLIGHTED,
				BTSCommentAnnotation.TYPE_HIGHLIGHTED);

		// subtext
		SubtextdrawingStrategy subtextStrategy = new SubtextdrawingStrategy();
		painter.addDrawingStrategy(BTSSubtextAnnotation.TYPE, subtextStrategy);
		painter.setAnnotationTypeColor(BTSSubtextAnnotation.TYPE,
				BTSUIConstants.COLOR_SUBTEXT);
		painter.addAnnotationType(BTSSubtextAnnotation.TYPE,
				BTSSubtextAnnotation.TYPE);

		// subtext
		SubtextHighlightedDrawingStrategy subtexthighStrategy = new SubtextHighlightedDrawingStrategy();
		painter.addDrawingStrategy(BTSSubtextAnnotation.TYPE_HIGHLIGHTED,
				subtexthighStrategy);
		painter.setAnnotationTypeColor(BTSSubtextAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_SUBTEXT);
		painter.addAnnotationType(BTSSubtextAnnotation.TYPE_HIGHLIGHTED,
				BTSSubtextAnnotation.TYPE_HIGHLIGHTED);

		// Annotation
		AnnotationDrawingStrategy annotationStrategy = new AnnotationDrawingStrategy();
		painter.addDrawingStrategy(BTSAnnotationAnnotation.TYPE,
				annotationStrategy);
		painter.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE,
				BTSUIConstants.COLOR_ANNOTATTION);
		painter.addAnnotationType(BTSAnnotationAnnotation.TYPE,
				BTSAnnotationAnnotation.TYPE);

		// Annotation highlighted
		AnnotationHighlightedDrawingStrategy annotationHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
		painter.addDrawingStrategy(BTSAnnotationAnnotation.TYPE_HIGHLIGHTED,
				annotationHighlightedStrategy);
		painter.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_ANNOTATTION);
		painter.addAnnotationType(BTSAnnotationAnnotation.TYPE_HIGHLIGHTED,
				BTSAnnotationAnnotation.TYPE_HIGHLIGHTED);

		// Annotation rumbrum
		RubrumDrawingStrategy rubrumStrategy = new RubrumDrawingStrategy();
		painter.addTextStyleStrategy(BTSAnnotationAnnotation.TYPE_RUBRUM,
				rubrumStrategy);
		painter.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE_RUBRUM,
				BTSUIConstants.COLOR_RUBRUM);
		painter.addAnnotationType(BTSAnnotationAnnotation.TYPE_RUBRUM,
				BTSAnnotationAnnotation.TYPE_RUBRUM);
		
		// Annotation rumbrum highlighted
		AnnotationHighlightedDrawingStrategy rubrumHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
		painter.addDrawingStrategy(BTSAnnotationAnnotation.TYPE_RUBRUM_HIGHLIGHTED,
				rubrumHighlightedStrategy);
		painter.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE_RUBRUM_HIGHLIGHTED,
				BTSUIConstants.COLOR_RUBRUM);
		painter.addAnnotationType(BTSAnnotationAnnotation.TYPE_RUBRUM_HIGHLIGHTED,
				BTSAnnotationAnnotation.TYPE_RUBRUM_HIGHLIGHTED);
		


	}
	
	

}