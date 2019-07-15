package ch04_Working_with_events;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

public class Ch4_MouseKey extends Composite {
	
	private Label output;

	public Ch4_MouseKey(Composite parent, int style) {
		super(parent, style);
		
		Button typed = new Button(this, SWT.PUSH);
		typed.setText("Typed");
		typed.setLocation(2, 10);
		typed.pack();
		
		typed.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				keyHandler();
			}
			
		});
		
		Button untyped = new Button(this, SWT.PUSH);
		untyped.setText("Untyped");
		untyped.setLocation(80,10);
		untyped.pack();
		untyped.addListener(SWT.MouseEnter, UntypedListener);
		untyped.addListener(SWT.MouseExit, UntypedListener);
		
		output = new Label(this, SWT.SHADOW_OUT);
		output.setBounds(40, 70, 90, 40);
		output.setText("No Event");
		pack();
	}
	
	Listener UntypedListener = new Listener() {

		@Override
		public void handleEvent(Event event) {
			switch (event.type) {
			case SWT.MouseEnter:
				output.setText("Mouse Enter");
				break;
			case SWT.MouseExit:
				output.setText("Mouse Exit");
				break;
			}
		}
		
	};

	void keyHandler() {
		output.setText("Key Event");
	}
}
