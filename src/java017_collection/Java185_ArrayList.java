package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);
	} // end main()

	public static void prnDisplay(ArrayList<String> aList) {
		// aList매개변수의 요소에서 'J'나 'j'가 포함되어 있는 요소만 출력하는 프로그램을 구현하세요.
		for (String sn : aList) {
			if (sn.toLowerCase().contains("j")) // contains() : 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수(true or false, 대소문자 구분)
				// aList가 문자열 배열이고 개선된 for문을 통하여 String문자로 나눠준다. 그리고 소문자로 바꾸어 준뒤 'j'가 포함 되어 있는지
				// 함수를 사용하여 출력한다.
				System.out.println(sn);
		}
	} // end prnDisplay()

	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp"));
	} // end process()

} // end class
