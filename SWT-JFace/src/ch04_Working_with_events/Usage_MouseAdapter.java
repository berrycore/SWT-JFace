package ch04_Working_with_events;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Usage_MouseAdapter {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		Button btn = new Button(shell, SWT.CENTER);
		btn.setText("Hello SWT");
		btn.pack();
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				System.out.println("mouseDoubleClicked : " + e.toString());
			}
			
		});
		
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
