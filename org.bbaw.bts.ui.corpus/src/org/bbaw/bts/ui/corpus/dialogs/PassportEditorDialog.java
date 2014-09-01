package org.bbaw.bts.ui.corpus.dialogs;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.ui.corpus.parts.PassportEditorPart;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class PassportEditorDialog extends TitleAreaDialog {

	@Inject
	private IEclipseContext context;

	@Inject
	private BTSObject selectionObject;
	private Text text;

	@Inject
	private BTSResourceProvider resourceProvider;

	private PassportEditorPart editor;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	@Inject
	public PassportEditorDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);

		Composite composite = new Composite(area, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL,
				SWT.FILL,
				true, true, 1, 1));
		composite.setLayout(new GridLayout(1, true));
		composite.setBackground(composite.getBackground());
		((GridLayout) composite.getLayout()).marginWidth = 0;
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).horizontalSpacing = 0;
		((GridLayout) composite.getLayout()).verticalSpacing = 0;
		IEclipseContext child = context.createChild("passportEditorDialog");
		child.set(Composite.class, composite);
		child.set(IServiceConstants.ACTIVE_SELECTION, selectionObject);
		editor = ContextInjectionFactory.make(
				PassportEditorPart.class, child);
//		editor.setSelection(selectionObject);
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(650, 550);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}


	@Override
	protected void okPressed() {
			editor.save();
		super.okPressed();
	}

}