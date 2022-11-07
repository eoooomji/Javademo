package jdbc_project;

import java.util.Scanner;

public class MovieScore {

	public static void main(String[] args) {
		MovieController mController = new MovieController();
		Scanner scanner = new Scanner(System.in);
		MovieInput mi = new MovieInput();
		boolean run = true;
		// 환영 문구
		System.out.println("                         !!!WELCOME!!!                       ");
		while (run) {
			System.out.println(" ----------------------------------------------------------- ");
			System.out.println("| 1.영화조회 | 2.영화추가 | 3.영화삭제 | 4.평점입력 | 5.리뷰입력 | 6. 끝 |");
			System.out.println("|-----------------------------------------------------------|");
			System.out.println("|********************** 번호를 입력해주세요 **********************|");
			System.out.print("                             ");
			// 번호 입력. 입력은 숫자로만 가능하다.
			int selectNum = Integer.parseInt(scanner.nextLine());
			switch (selectNum) {
			case 1:
				mi.searchMovie(mController);
				break;
			case 2:
				mi.addMovie(mController);
				break;
			case 3:
				mi.deleteMovie(mController);
				break;
			case 4:
				mi.addScoreMovie(mController, scanner);
				break;
			case 5:
				mi.addReviewMovie(mController, scanner);
				break;
			// 종료
			case 6:
				run = false;
				System.out.println("|************************* 잘가요!! **************************|");
				break;
			// 재입력
			default:
				System.out.println("|********************** 잘못 입력하셨습니다. *********************|");
				System.out.println("|*********************** 다시 입력해주세요. *********************|");
				break;
			}

		}
		
	}

}
