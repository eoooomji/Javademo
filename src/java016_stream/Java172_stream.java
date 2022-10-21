package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws IOException {
		// File file = new File("src/java016_stream/temp");
		// File file = new File("src/java016_stream/a/b");
		File file = new File("src/java016_stream/sample.txt");
		
		// deleteOnExit() : file객체를 현재 시스템이 종료가 될 때 파일을 삭제시켜라
		file.deleteOnExit();
		
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();
		// close()를 안해주면 Scanner가 계속 실행되기 때문에 deleteOnExit()이 작동하지 않아 파일이 삭제되지 않는다.
		
		// file.createTempFile("source", "test");
		// createTempFile() : 임시 파일 생성

		// if (file.isDirectory()) {
			// file.delete(); // 폴더 삭제
			// System.out.println("폴더 삭제");
		// } else {
			// System.out.println("폴더 없음");
		// }

	} // end main

} // end class
