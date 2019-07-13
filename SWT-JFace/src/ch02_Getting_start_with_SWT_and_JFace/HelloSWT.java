package ch02_Getting_start_with_SWT_and_JFace;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloSWT {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		Text text = new Text(shell, SWT.CENTER);
		text.setText("Hello SWT");
		text.pack();
		
		shell.pack();
		shell.open();
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
		
	}

}
