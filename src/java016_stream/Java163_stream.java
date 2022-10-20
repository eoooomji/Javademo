package java016_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java163_stream {

	public static void main(String[] args) {
		// 바이트 스트림 연결
		InputStream is = System.in;

		// 바이트 스트림과 문자 스트림 연결
		InputStreamReader ir = new InputStreamReader(is);

		// 문자 스트림. 2바이트를 읽을 수 있다.
		BufferedReader br = new BufferedReader(ir);

		System.out.print("데이터 입력: ");

		try {
			// int data = br.read();
			// System.out.println(data);
			// System.out.println((char)data);
			
			// int data;
			// while ((data = br.read()) != 13)
			//   System.out.print((char) data);
			
			String line = br.readLine(); // 한 라인 전부를 읽는다.
			System.out.println(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end class
