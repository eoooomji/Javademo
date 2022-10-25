package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("결과값 : " + cal.getSum(sc.nextInt()));

	} // end main()

} // end class
