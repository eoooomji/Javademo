package java020_thread.part01;

public class User extends Thread {
	public User() {

	}

	@Override
	public void run() {
		// run() : Thread로 실행할 문장을 구현
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%s i=%d\n", getName(), i);
			// getName() : 스레드 메서드.현재 실행되는 스레드 이름.
		}
	}
} // end class
