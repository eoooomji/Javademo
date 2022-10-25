package ncs.test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// 명시한 사용 데이터를 list에 기록한다.
		Integer[] num = new Integer[10];
		Random ran = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = ran.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}
			}
		}
		System.out.print("정렬전 :");
		for (int before : num)
			System.out.print(before + " ");
		list = Arrays.asList(num);
		// list의 데이터를 내림차순 정렬한다.
		list.sort(new Decending());
		// display() 메소드를 호출한다.
		System.out.println();
		display(list);
	} // end main()

	// display() 메소드를 구현한다.
	public static void display(List list) {
		System.out.print("정렬후 :");
		Consumer<Integer> con = x -> System.out.print(x + " ");
		list.forEach(con);
	} // end display()

} // end class
