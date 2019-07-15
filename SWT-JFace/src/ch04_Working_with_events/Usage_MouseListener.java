package ch04_Working_with_events;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Usage_MouseListener {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		Button tbn = new Button(shell, SWT.CENTER);
		tbn.setText("Hello SWT");
		tbn.pack();
		// event
		tbn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent arg0) {
				System.out.println("mouseUp : " + arg0.toString());
			}
			
			@Override
			public void mouseDown(MouseEvent arg0) {
				System.out.println("mouseDown : " + arg0.toString());
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				System.out.println("mouseDoubleClick : " + arg0.toString());
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
