package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/*
 * [프로그램 출력결과]
 * kim	56	78	12	146
 * hong	46	100	97	243
 * park	96	56	88	240
 */

public class Java183_Vector {

	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);

	} // end main()

	public static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후 리턴하는 프로그램을 구현하시오.
		Vector<Sawon> vt = new Vector<Sawon>();
		try (Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNextLine()) { // 라인글이 있다면 true
				// kim:56/78/12 | hong:46/100/97 | park:96/56/88
				String[] data = sc.nextLine().split("[:/]"); // nextLine : 한 라인을 다 가져오기
				// {"kim", "56", "78", "12"} | {"hong", "46", "100", "97"} | {"park", "96", "56", "88"}
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				// {"kim", 56, 78, 12} | {"hong", 46, 100, 97} | {"park", 96, 56, 88}
				vt.add(sn);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		return vt;
	} // end lines()

	public static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출렬결과와 같이 프로그램을 구현하시오.
		for (Sawon sn : vt) {
			System.out.println(sn.toString());
		}
	}

} // end class
