package ncs.test06;

public class Calculator {

	public double getSum(int data) {
		double res = 0.0;
		for (int i = 1; i < 6; i++) {
			if (!(data < 2 || data > 5)) {
				res += i;
			} else {
				throw new InvalidException("입력 값에 오류가 있습니다.");
			}
		}
		return res;
	}
}
