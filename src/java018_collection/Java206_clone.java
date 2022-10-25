package java018_collection;

import java.awt.dnd.DragSourceListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Java206_clone {

	public static void main(String[] args) {
		Integer[] it = new Integer[] { 3, 5, 2, 4, 7 };
		ArrayList<Integer> sourceList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println("sourceList:" + sourceList.toString());

		// 기존의 깊은 복사
		
		// ArrayList<Integer> aList = new ArrayList<Integer>();
		// for (int i = 0; i < aList.size(); i++)
		// aList.add(sourceList.get(i));

		// clone()을 활용한 복사. 얕은 복사.
		// 단순히 인스턴스 변수의 값만 복사하기 때문에 참조타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다.
		ArrayList<Integer> destList = (ArrayList<Integer>) sourceList.clone(); // down-casting (clone()은 Object로 리턴된다.)
		System.out.println("destList" + destList.toString());

		sourceList.sort(new Ascending());
		System.out.println("sourceList:" + sourceList.toString());
		System.out.println("destList" + destList.toString());

	} // end main()

} // end class
