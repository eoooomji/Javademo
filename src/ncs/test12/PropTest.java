package ncs.test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		// 명시한 사용 데이터를 prop에 기록한다.
		try {
			FileWriter file = new FileWriter("./src/ncs/test12/data.xml");

			prop.setProperty("1", "apple,1200,3");
			prop.setProperty("2", "banana,2500,2");
			prop.setProperty("3", "grape,4500,5");
			prop.setProperty("4", "orange,800,10");
			prop.setProperty("5", "melon,5000,2");

			prop.store(file, "end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop);
		// fileSave() 메서드를 호출한다.
		fileSave(prop);
		// fileOpen() 메서드를 호출한다.

	} // end main()

	// fileSave() 메서드를 구현한다.
	public static void fileSave(Properties p) {
		for(int i = 0 ; i < p.size();i++) {
		}
	} // end fileSave()

	// fileOpen() 메서드를 구현한다.
	public static void fileOpen(Properties p) {

	} // end fileOpen()

} // end class
