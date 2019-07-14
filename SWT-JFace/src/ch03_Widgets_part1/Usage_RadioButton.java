package ch03_Widgets_part1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Usage_RadioButton {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);

		Button[] radios = new Button[3];
		radios[0] = new Button(shell, SWT.RADIO);
		radios[0].setSelection(true);
		radios[0].setText("Choice 1");
		radios[0].setLocation(10, 5);
		radios[0].pack();

		radios[1] = new Button(shell, SWT.RADIO);
		radios[1].setText("Choice 2");
		radios[1].setLocation(10, 30);
		radios[1].pack();

		radios[2] = new Button(shell, SWT.RADIO);
		radios[2].setText("Choice 3");
		radios[2].setLocation(10, 55);
		radios[2].pack();

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}

}
