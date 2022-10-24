package java018_collection;

import java.util.LinkedList;

/*
 * stack(스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 */
public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		
		// append
		// push : 입력한 순서대로 데이터가 쌓인다.
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		// pop : 마지막에 저장된 순서로 데이터를 꺼낸다.(포인터의 위치에 따라 꺼내온다.) 완전히 꺼내어 다 꺼내게 되면 텅 비게 된다.
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop()); // java.util.NoSuchElementException
		
		while(!nStack.isEmpty()) { // isEmpty() : 객체가 비어있는지 확인할 때 사용한다.
			System.out.println(nStack.pop());
			
		}
		
	} // end main()

} // end class
