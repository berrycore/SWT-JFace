package ch03_Widgets_part1;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SashFromViewer extends ApplicationWindow {

	public SashFromViewer(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createContents(Composite parent) {
		Ch3_SashForm sashform = new Ch3_SashForm(parent);

		return parent;
	}

	public static void main(String[] args) {
		SashFromViewer sfv = new SashFromViewer(null);
		sfv.setBlockOnOpen(true);
		sfv.open();
		Display.getCurrent().dispose();
	}

}
