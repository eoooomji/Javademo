package java014_api.prob;

/*
 * javac Prob001_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) {
		String src = "";
		String cvt = "";
		int count = 0;

		for (int i = 0; i < args.length; i++) {
			src += args[i];
			cvt += convert(args[i]) + " ";
			count += args[i].length();
		}

		System.out.println("source :" + src);
		System.out.println("convert :" + cvt);
		System.out.println("length :" + (count + args.length - 1));
		StringBuffer sb = new StringBuffer(src.trim());
		StringBuffer rvs = sb.reverse();
		System.out.println("revers :" + rvs);

		System.out.println(args[0]);
		System.out.println(args[1]);

	} // end main()

	public static String convert(String data) {
		String arr = "";
		for (int i = 0; i < data.length(); i++) {
			if (Character.isUpperCase(data.charAt(i)))
				arr += Character.toLowerCase(data.charAt(i));
			else
				arr += Character.toUpperCase(data.charAt(i));
		}
		return arr;
	} // end convert()

}// end class
