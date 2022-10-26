package java019_inner.part02;

public class OuterStatic {
	private int x;
	static private int y;

	static void call() {
		// x = 30;
		y = 9;
		System.out.println(y);
	} // end call()

	static class InnerStatic {
		int z;

		void prn() {
			// 비 static 외부 자원을 static내부 클래스에서 참조할 수 없다.
			// x = 50; // 불가능
			y = 20; // static내부 클래스에서 static 선언된 외부 자원은 가져올 수 있다.
			z = 40;
			System.out.printf("y=%d, z=%d\n", y, z);
		} // end prn()
	} // end InnerStatic
	
} // end OuterStatic
