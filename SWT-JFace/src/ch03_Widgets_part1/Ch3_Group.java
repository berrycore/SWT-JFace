package ch03_Widgets_part1;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class Ch3_Group extends Composite {

	public Ch3_Group(Composite parent, int style) {
		super(parent, style);
	
		Group group = new Group(this, SWT.SHADOW_ETCHED_IN);
		group.setText("Group Label");
		
		Label label = new Label(group, SWT.NONE);
		label.setText("Two buttons:");
		label.setLocation(20, 20);
		label.pack();
		
		Button button1 = new Button(group, SWT.PUSH);
		button1.setText("Push button");
		button1.setLocation(20, 45);
		button1.pack();
		
		Button button2 = new Button(group, SWT.CHECK);
		button2.setText("Check button");
		button2.setBounds(20, 75, 90, 30);
		
		group.pack();
	}

}
