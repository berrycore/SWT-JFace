package ch04_Working_with_events;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.resource.ImageDescriptor;

public class Ch4_StatusAction extends Action {

	StatusLineManager statman;
	short triggercount = 0;
	
	public Ch4_StatusAction(StatusLineManager statman) {
		super("&Trigger@Ctrl+T", AS_PUSH_BUTTON);
		this.statman = statman;
		setToolTipText("Trigger the Action");
		setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(), "eclipse.png"));
		
	}

	// handle event
	@Override
	public void run() {
		triggercount++;
		statman.setMessage("The status action has fired. Count : " + triggercount);
	}
	
	
}
