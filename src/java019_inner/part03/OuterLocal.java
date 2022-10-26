package java019_inner.part03;

public class OuterLocal {
	private int x;
	static int y;
	final private int z = 10;

	public void call(int a) {
		final int b = 20;
		int c = 30;
		// a = 300;
		// c = 500;
		System.out.printf("a=%d\n", a);

		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;
				// z = 20; // final상수라서 값 입력 안됨

				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("a=" + a); // 메소드의 매게변수나 로컬변수를 내부 클래스에서 사용할 경우 final이 붙어야 한다.
				System.out.println("b=" + b);
				System.out.println("c=" + c);
			} // end prn()
		}// end InnerLocal class
	} // end call()

} // end OuterLocal class
