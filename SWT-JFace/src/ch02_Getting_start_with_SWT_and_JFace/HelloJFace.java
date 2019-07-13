package ch02_Getting_start_with_SWT_and_JFace;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class HelloJFace extends ApplicationWindow {

	public HelloJFace() {
		super(null);
	}

	@Override
	protected Control createContents(Composite parent) {
		Text text = new Text(parent, SWT.CENTER);
		text.setText("Hello JFace");
		parent.pack();
		return parent;
	}

	public static void main(String[] args) {
		HelloJFace awindow = new HelloJFace();
		awindow.setBlockOnOpen(true);
		awindow.open();
		Display.getCurrent().dispose();
		
	}

}
