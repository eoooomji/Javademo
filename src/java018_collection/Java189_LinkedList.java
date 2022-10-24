package java018_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * list 처리
 * List, LinkedList, ArrayList, LIFO(last input first-output)...
 */
public class Java189_LinkedList {

	public static void main(String[] args) {
		System.out.println("=== ArrayList ===");
		ArrayList<String> aList = new ArrayList<String>();
		// append
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));

		ListIterator<String> ank = aList.listIterator();
		System.out.println("앞->뒤");
		while (ank.hasNext())
			System.out.println(ank.next());

		System.out.println("뒤->앞");
		while (ank.hasPrevious())
			System.out.println(ank.previous());

		System.out.println("=== LinkedList ===");
		LinkedList<String> aNode = new LinkedList<String>();
		// append
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));

		ListIterator<String> ite = aNode.listIterator();

		System.out.println("뒤->앞");
		while (ite.hasPrevious())
			System.out.println(ite.previous());
		// 포인터를 기준으로 next와 previous값울 가져온다.
		// 현재 포인터는 0인덱스를 기준으로 앞에는 아무것도 없기에 previous를 해도 리턴값이 없다.

		System.out.println("앞->뒤");
		while (ite.hasNext())
			System.out.println(ite.next());

	} // end main()

} // end class
