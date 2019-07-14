package ch03_Widgets_part1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class Ch3_Composite extends Composite {

	public Ch3_Composite(Composite parent, int style) {
		super(parent, style);
		parent.getShell().setText("Chapter 3 : Composite");
		
		
		Ch3_Group cc1 = new Ch3_Group(this, SWT.NONE);
		cc1.setLocation(0, 0);
		cc1.pack();
		
		Ch3_SashForm cc2 = new Ch3_SashForm(this, SWT.NONE);
		cc2.setLocation(125, 25);
		cc2.pack();
		
		this.pack();
	}

}
