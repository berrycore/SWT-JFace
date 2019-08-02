
package ch09_TablesAndMenus;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import ch03_Widgets_part1.Ch3_Composite;

public class WidgetWindow extends ApplicationWindow {

	public WidgetWindow() {
		super(null);
	}

	@Override
	protected Control createContents(Composite parent) {
		
		// chapter 3 
		TabFolder tf = new TabFolder(parent, SWT.NONE);
		TabItem chap3 = new TabItem(tf, SWT.NONE);
		chap3.setText("Chapter 3");
		//chap3.setControl(new Ch3_Composite(tf, SWT.NONE));
		chap3.setControl(new Ch9TableEditorComposite(tf));
		
		
		
		getShell().setText("Widget Window");
		parent.setSize(new Point(400, 250));
		return parent;
	}

	public static void main(String[] args) {
		WidgetWindow wwin = new WidgetWindow();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();
	}

}
