package java018_collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 메서드 이름중 아랫값이 들어가게 되면 의미가 이러하다.
 * set : 중복 허용 안됨.
 * tree : 정렬
 * 
 * TreeSet : 오름차순 정렬, 중복 안함
 */
public class Java192_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();

		Integer it1 = new Integer(10);
		Integer it2 = new Integer(40);
		Integer it3 = new Integer(20);
		Integer it4 = new Integer(30);
		Integer it5 = new Integer(20);

		tree.add(it1);
		tree.add(it2);
		tree.add(it3);
		tree.add(it4);
		tree.add(it5);
		// 중복된 값은 내부에서 처리된다.

//		tree.add(new Integer(10));
//		tree.add(new Integer(40));
//		tree.add(new Integer(20));
//		tree.add(new Integer(30));
//		tree.add(new Integer(20)); 

		System.out.println("=== 오름차순 ===");
		// System.out.println(tree.size()); // 4
		int cnt = tree.size();

//		for (int i = 0; i < cnt; i++) {
//			int value = tree.pollFirst();
//			System.out.println(value == it5);
//			System.out.printf("tree[%d]=%d\n", i, value);
//		}

		for (Integer it : tree)
			System.out.println(it);

		Iterator<Integer> ita = tree.iterator();
		while (ita.hasNext())
			System.out.println(ita.next());

		System.out.println("=== 내림차순 ===");

		Iterator<Integer> ite = tree.descendingIterator(); // 내림차순 메서드
		while (ite.hasNext())
			System.out.println(ite.next());

	} // end main()

} // end class
