package ch03_Widgets_part1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Usage_Label {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Label Example");
		shell.setSize(new Point(400, 300));
		
		Label shadow_in = new Label(shell, SWT.CENTER);
		shadow_in.setText("SWT.SHADOW_IN");
		shadow_in.setBounds(new Rectangle(30, 25, 110, 15));
		
		Label shadow_sep_in = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_IN);
		shadow_sep_in.setBounds(30, 45, 110, 10);
		
		Label shadow_out = new Label(shell, SWT.CENTER);
		shadow_out.setText("SWT.SHADOW_OUT");
		shadow_out.setBounds(new Rectangle(30, 60, 110, 15));
		
		Label shadow_sep_out = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_OUT | SWT.VERTICAL);
		shadow_sep_out.setBounds(new Rectangle(30, 85, 110, 10));
		
		Label shadow_none = new Label(shell, SWT.CENTER);
		shadow_none.setText("SWT.SHADOW_NONE");
		shadow_none.setBounds(new Rectangle(30, 110, 130, 15));
		
		Label shadow_sep_hori = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		shadow_sep_hori.setBounds(new Rectangle(40, 125, 110, 15));
		

		shell.open();
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
		
	}

}
