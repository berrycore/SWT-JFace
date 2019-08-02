package tutorial_jface;

import java.util.Date;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILazyTreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Demonstrate model level sorting with SWT.Virtual + ILazyTreeContentProvider
 * After clicking the Tree Column, the viewer feels slow when scrolling up and
 * down.
 */
public class Snippet {

	boolean ascending = false;

	class Item {
		String thing;

		Item(String lo) {
			thing = lo;
		}

		public String toString() {
			return thing;
		}
	}

	private class MyContentProvider implements ILazyTreeContentProvider {
		private TreeViewer viewer;
		private Object root = new Date();
		private Object input;
		private Item[] children;

		public MyContentProvider(TreeViewer viewer) {
			this.viewer = viewer;
			children = new Item[3000];
			for (int i = 0; i < children.length; i++) {
				Item ele = new Item("ele" + i);
				children[i] = ele;
			}
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			input = newInput;
		}

		public Object getParent(Object element) {
			if (element instanceof Item) {
				return root;
			}
			return input;
		}

		public void updateChildCount(Object element, int currentChildCount) {

			int length = 0;
			if (element == root) {
				length = children.length;
			}
			if (element == input)
				length = 1;
			viewer.setChildCount(element, length);
		}

		@Override
		public void updateElement(Object parent, int index) {
			if (parent == input) {
				viewer.replace(parent, index, root);
				updateChildCount(root, -1);
			}
			if (parent == root) {
				Item element = null;
				if (ascending) {
					element = children[children.length - index - 1];
				} else {
					element = children[index];
				}
				viewer.replace(parent, index, element);
				updateChildCount(element, -1);
			}
		}
	}

	public Snippet(Shell shell) {
		final TreeViewer v = new TreeViewer(shell, SWT.VIRTUAL | SWT.FULL_SELECTION);

		TreeViewerColumn column = new TreeViewerColumn(v, SWT.NONE);
		column.getColumn().setWidth(200);
		column.getColumn().setMoveable(true);
		column.getColumn().setText("Click me to make the viewer slow down");
		column.setLabelProvider(new ColumnLabelProvider() {

			public String getText(Object element) {
				return element.toString();
			}

		});
		column.getColumn().addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				ascending = !ascending;
				v.refresh();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		v.setContentProvider(new MyContentProvider(v));
		v.getTree().setHeaderVisible(true);
		v.setLabelProvider(new LabelProvider());
		v.setUseHashlookup(true);
		v.setInput(new Object());
	}

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		new Snippet(shell);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}

		display.dispose();
	}
}