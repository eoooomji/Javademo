package java023_debug;

/*
 * bug : 어떤 의도하지 않는 문제가 발생한 오류
 * debug : bug를찾아 수정하는 작업
 * debugging : bug를 원하는 대로 실행이 되도록 작업하는 과정
 * debugger : debugging을 할 때 사용하는 도구
 * 
 * 디버깅 종류
 * 1. 출력문을 이용한 디버깅
 * 2. 디버깅 툴을 이용한 디버깅 : 마우스 우클릭 > debug as
 * 
 * step over : 문장 실행
 * step into : 
 * 
 * break point set
 * - hit count : 반복 횟수
 * - conditional : 지정한 변수의 값이 참일 때
 * 
 * Debug Shell
 */

public class DebugTest01 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf("i=%d\n", i);
			sum = sum + count(i);
		}

		System.out.printf("sum=%d\n", sum);
	} // end main()

	public static int count(int index) {
		int[] num = new int[] { 1, 5, 2, 3, 4 };
		return num[index];
		
	} // end count()
	
} // end class
