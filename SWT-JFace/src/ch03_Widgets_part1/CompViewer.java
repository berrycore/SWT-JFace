package ch03_Widgets_part1;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CompViewer extends ApplicationWindow {

	public CompViewer() {
		super(null);
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Ch3_Group group = new Ch3_Group(parent, SWT.NONE);
		return parent;
	}

	public static void main(String[] args) {
		CompViewer cv = new CompViewer();
		cv.setBlockOnOpen(true);
		cv.open();
		Display.getCurrent().dispose();
	}

}
