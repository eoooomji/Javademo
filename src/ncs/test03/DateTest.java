package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar gre = new GregorianCalendar();

		int year = 1987;
		int month = 4;
		int day = 27;

		gre.set(GregorianCalendar.YEAR, year);
		gre.set(GregorianCalendar.MONTH, month);
		gre.set(GregorianCalendar.DAY_OF_MONTH, day);
		gre.get(GregorianCalendar.DAY_OF_WEEK);

		SimpleDateFormat fm1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String Date = fm1.format(gre.getTime());
		System.out.println("생일 : " + Date);

		GregorianCalendar nGre = new GregorianCalendar();

		int nYear = nGre.get(GregorianCalendar.YEAR);
		int nMonth = nGre.get(GregorianCalendar.MONTH) + 1;
		int nDay = nGre.get(GregorianCalendar.DAY_OF_MONTH);

		SimpleDateFormat fm2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String nDate = fm2.format(nGre.getTime());
		System.out.println("현재 : " + nDate);
		System.out.println("나이 : " + (nYear - year));

	} // end main()

} // end class
