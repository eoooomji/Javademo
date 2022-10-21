package java016_stream;

import java.io.File;

public class Java171_stream {

	public static void main(String[] args) {
		// File file = new File("src/java016_stream/temp");
		File file = new File("src/java016_stream/a/b");
		// is나 has로 시작하는 클래스는 true or false를 리턴한다.
		// System.out.println(file.isDirectory()); // false : temp라는 폴더가 없기 때문에 false라고 뜬다.

		if (!file.isDirectory()) {
			// file.mkdir();
			file.mkdirs();
			System.out.println("폴더 생성");
		} else {
			System.out.println("폴더 존재");
		}

	} // end main()

} // end class
