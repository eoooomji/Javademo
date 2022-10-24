package java018_collection;

import java.util.HashSet;

// HashSet : 순서 상관 없이, 중복허용은 안되게끔 한다.
public class Java193_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));

		for (Integer it : set)
			System.out.println(it);
	} // end main()

} // end class
