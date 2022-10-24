package java018_collection;

import java.util.LinkedList;

/*
 * Queue(큐)
 * 1. FIFO(First In First Out) : 제일 먼저 저장한 요소를 제일 먼저 꺼내준다.
 * 2. 최근사용문서, 인쇄 작업 대기 목록, 버퍼
 */
public class Java191_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();

		// append
		// offer() : Queue사용을 하기위한 저장 메서드.
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		// poll() : 저장한 순서대로 꺼내주는 메서드이다. 완전히 꺼내온다.
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
	} // end main()

} // end class
