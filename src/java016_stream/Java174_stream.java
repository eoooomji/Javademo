package java016_stream;

import java.io.File;

public class Java174_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt");

		if (file.exists()) {
			file.delete();
			System.out.println("파일 삭제");
		}else {
			System.out.println("파일 없음");
		}
		
	} // end main()

} // end class


/*
 * java.awt.Frame;
 * java.awt.event.ActionListener;
 * 
 * import java.awt.*
 * import java.awt.event.*  
 * 위 두개는 다른 뜻을 지님. awt에 *값을 입력해도 event.ActionListener가 임포트 되지 않는다.
 * 
 */
