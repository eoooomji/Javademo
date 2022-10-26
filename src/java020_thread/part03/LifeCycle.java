package java020_thread.part03;

/*
 * 스레드 생명주기(Thread LifeCycle)
 * start() - 실행준비상태(RUNNABLE) - run()초기할당상태/실행상태 - TERMINATED(dead)
 * 							  {sleep(시간), wait() - 대기상태(WAITING)}
 * 
 */
public class LifeCycle extends Thread{
	public LifeCycle() {
		
	} // end LifeCycle()
	
	@Override
	public void run() {
		System.out.println(getState());
		// getState() : 현재 스레드의 상태 메서드
	}
} // end class
