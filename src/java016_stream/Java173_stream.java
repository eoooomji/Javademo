package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java173_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt");

		// exists() : 파일이 존재하면 true 아니면 false
		// creatNewFile() : 새로운 파일 생성
		if (!file.exists()) {
			try {
				file.createNewFile(); // 파일 생성
				System.out.println("파일 생성");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end class
