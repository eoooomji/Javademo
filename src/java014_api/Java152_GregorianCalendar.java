package java014_api;

import java.util.GregorianCalendar;

public class Java152_GregorianCalendar {

	public static void main(String[] args) {
		int year = 2022;
		GregorianCalendar gre = new GregorianCalendar();
		System.out.println(gre.toString());

		// GregorianCalendar()의 isLeapYear()는 윤년과 평년값을 리턴하는 메서드이다.
		if (gre.isLeapYear(year))
			System.out.println(year + "년도는 윤년입니다.");
		else
			System.out.println(year + "년도는 평년입니다.");
	} // end main()

} // end class
