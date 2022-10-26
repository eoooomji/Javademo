package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Frame 창을 만들게끔 하는 클래스
public class Win_1 extends Frame {
	public Win_1() { // 기본적으로 안보인다.
		setSize(500, 500); // 창의 사이즈
		setVisible(true); // 창의 입력
		// WindowExit exit = new WindowExit();
		// addWindowListener(exit);
		addWindowListener(new WindowExit());
	}

	class WindowExit implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			// x창을 누르면 시스템을 종료 시켜라 라는 뜻.

		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
