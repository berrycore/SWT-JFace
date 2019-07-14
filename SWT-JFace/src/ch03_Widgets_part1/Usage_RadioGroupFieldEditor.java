package ch03_Widgets_part1;

import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Usage_RadioGroupFieldEditor {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);

		RadioGroupFieldEditor rgfe = new RadioGroupFieldEditor(
				"UserChoice", 
				"Choose an option:", 
				1, new String[][] {
					{"Choice1", "ch1"},
					{"Choice2", "ch2"},
					{"Choice3", "ch3"}}, 
				shell, 
				true);

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
