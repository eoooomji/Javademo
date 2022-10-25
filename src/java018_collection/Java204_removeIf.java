package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Java204_removeIf {

	public static void main(String[] args) {
		Integer[] it = new Integer[] { 3, 5, 2, 4, 7 };
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList.toString());

		// Predicate : 매개변수O, 반환값O. argument를 받아 boolean 값을 반환하는 함수형 인터페이스
		
		// argument를 받아 true값으로 반환되는 요소만 삭제
		// Predicate<Integer> p = x -> x % 2 == 0; // 람다식(Lambda)
		// aList.removeIf(p); // 인자로 전달된 조건으로 리스트의 아이템들을 삭제합니다. 조건에 부합하는 것은 삭제되고, 그렇지 않는 것은 리스트에 남게 됩니다.

		aList.removeIf(x -> x % 2 == 0);

		System.out.println(aList.toString());

	} // end main()

} // end class
