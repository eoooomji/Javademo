package java020_thread.part02;

public class UserImp implements Runnable {

	public UserImp() {

	}

	// Runnable 인터페이스에는 run()메서드만 존재한다.
	// Thread 이름을 가져오기 위해서는 Thread클래스를 통해 가져와야 한다.
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(), i);
		}
	}

} // end class
