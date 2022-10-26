package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Win_2 extends Frame {
	public Win_2() {
		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WinExit());
	} // end Win_2()

	class WinExit extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	} // end WinExit class
} // end class
