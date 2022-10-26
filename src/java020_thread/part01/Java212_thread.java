package java020_thread.part01;

/*
동기화			비동기화
StringBuilder	StringBuffer
Vector			ArrayList
Hashtable		HashMap

파일 : Ms-word프로그램
프로세스 : 메모리에 실행중인 프로그램
게임프로그램(프로세스) - 게임(스레드) + 음악(스레드) + 채팅(스레드)
스레드(thread) : 프로세스에서 독립적으로 실행되는 단위이다.

자바에서 스레드 생성을 위해 제공해주는 2가지 방법
1. java.lang.Thread 클래스
2. java.lang.Runnable 인터페이스

스케줄링
: 스레드가 생성되어 실행될 때 시스템의 여러 자원을 해당 스레드에게 할당하는 작업

1. 선점형 스케줄링
: 하나의 스레드가 cpu를 할당받아 실행하고 있을 때 우
  선순위가 높은 다른 스레드가 cpu를 강제로 빼앗아가 사용할 수 있는 스케줄링 기법
: 확률은 높지만 언제나 먼저 처리가 되지는 않다.(블럭상태에 빠질 수도 있다.)
 */
public class Java212_thread {

	public static void main(String[] args) {
		User us = new User();
		// us.run(); // run을 직접적으로 호출하면 스레드로 호출되지 않는다. 메서드로 호출된 것.
		us.start(); // 스레드 호출

		for (int j = 0; j <= 5; j++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(), j);
		}

	} // end main()

} // end class
