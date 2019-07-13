package ch03_Widgets_part1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Usage_Button {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Button Example");

		Button push_left = new Button(shell, SWT.PUSH | SWT.LEFT);
		push_left.setText("LEFT");
		push_left.setBounds(10, 10, 70, 20);

		Button push_center = new Button(shell, SWT.PUSH | SWT.CENTER);
		push_center.setText("CENTER");
		push_center.setBounds(90, 10, 70, 20);

		Button push_right = new Button(shell, SWT.PUSH | SWT.RIGHT);
		push_right.setText("RIGHT");
		push_right.setBounds(170, 10, 70, 20);

		Button flat = new Button(shell, SWT.FLAT);
		flat.setText("FLAT");
		flat.setBounds(250, 10, 70, 20);

		shell.setSize(370, 80);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
