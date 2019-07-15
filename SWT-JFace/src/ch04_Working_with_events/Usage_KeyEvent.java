package ch04_Working_with_events;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Usage_KeyEvent {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		Button btn = new Button(shell, SWT.CENTER);
		btn.setText("Hello SWT");
		btn.pack();
		btn.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				String string = "";
				if ((e.stateMask & SWT.ALT) != 0)
					string += "ALT-";
				if ((e.stateMask & SWT.CTRL) != 0)
					string += "CTRL-";
				if ((e.stateMask & SWT.COMMAND) != 0)
					string += "COMMAND-";
				if ((e.stateMask & SWT.SHIFT) != 0)
					string += "SHIFT-";

				switch (e.keyCode) {
				case SWT.BS: string += "BACKSPACE"; break;
				case SWT.CR: string += "CARRIAGE RETURN"; break;
				case SWT.DEL: string += "DELETE"; break;
				case SWT.ESC: string += "ESCAPE"; break;
				case SWT.LF: string += "LINE FEED"; break;
				case SWT.TAB: string += "TAB"; break;
				default: string += e.character; break;
				}
				System.out.println(string);
			}

		});

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
