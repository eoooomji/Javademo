package java018_collection;

import java.util.Comparator;

public class Ascending implements Comparator<Integer> {
	
	// sort() 정렬 메서드에 상속되어 있는 Comparator<> 클래스를 사용할 클래스에 상속시켜줘야 한다.
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// return o2 > o1 ? -1 : o2 < o1 ? 1 : 0; // 오름차순 정렬식
		return o1.compareTo(o2); // 오름차순. compareTo() : 오름차순,내림차순 정렬 메서드
	}

}
