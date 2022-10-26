package java019_inner.part04;

public class OuterAnonymous {
	private int x;

	// 익명 클래스 : 동시에 클래스 선언 및 객체 생성
	InnerAnonymous ta = new InnerAnonymous() {
		@Override
		void prn() {
			System.out.println("prn");
		};
	};

	public void display() {
		ta.prn();

		new InnerAnonymous() {
			@Override
			void prn() {
				System.out.println("prn2");
			}
		}.prn();

	} // end display()

} // end class
