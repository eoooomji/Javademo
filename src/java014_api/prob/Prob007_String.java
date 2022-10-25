package java014_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {

		return data.toCharArray();
	}// end process()

	public static void display(char[] arr) {
		int A = 0;
		int a = 0;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				A++;
			} else if (Character.isLowerCase(arr[i])) {
				a++;
			} else
				num++;
		}
		System.out.printf("영어 소문자 갯수 : %d\n", a);
		System.out.printf("영어 대문자 갯수 : %d\n", A);
		System.out.printf("숫자 갯수 : %s\n", num);

	}// end display()

}// end class
