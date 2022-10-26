package java020_thread.prob;

public class Prob002_thread {

	public static void main(String[] args) {
		EnglishLowerThread t1=new EnglishLowerThread();
		EnglishUpperThread t2=new EnglishUpperThread();
		KoreanThread t3=new KoreanThread();
		
		t1.start();
		t2.start();
		t3.start();

	}//end main()

}//end class
