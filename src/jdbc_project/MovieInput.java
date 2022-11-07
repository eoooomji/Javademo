package jdbc_project;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MovieInput {
	private static Scanner sc = new Scanner(System.in);

	// 영화 조회
	public static void searchMovie(MovieController mController) {
		List<MovieDTO> mList = mController.listProcess();
		System.out.print("| 영화 제목 (전제 조회를 원하시면 Enter키를 누르세요) : ");
		String movie = sc.nextLine();
		boolean noneResult = false;
		for (MovieDTO dto : mList) {
			if (movie.equals(dto.getTitle())) {
				System.out.printf("| 제목 : %s | 감독 : %s | 개봉일 : %s | 장르 : %s |\n", dto.getTitle(), dto.getProducer(),
						dto.getOpenning(), dto.getGenre());
				System.out.printf("| 메타크리틱 : %s | 로튼토마토 : %s | 네이버 : %s | 다음 : %s |\n", dto.getMetacritic(),
						dto.getRottentomato(), dto.getNaver(), dto.getDaum());
				System.out.printf("| 리뷰 : %s\n", dto.getReview());
				noneResult = true;
				break;
			}
		}

		// 전제 조회
		if (movie.matches("")) {
			noneResult = true;
			System.out.println("|***************** 영화 리스트 ******************|");
			for (int i = 0; i < mList.size(); i++) {
				System.out.printf("| %d. 제목 : %s , 감독 : %s \n", i + 1, mList.get(i).getTitle(),
						mList.get(i).getProducer());
			}
		}

		// 영화 데이터 없을 시
		if (!noneResult) {
			System.out.println("|****************** 아직 등록되지 않은 영화입니다. ******************|");
			System.out.println("|********************** 다시 검색해 주세요. *********************|");
		}

	} // end searchMovie()

	// 영화 추가
	public static void addMovie(MovieController mController) {
		System.out.print("|영화 제목 : ");
		String title = sc.nextLine();
		System.out.print("|감독 : ");
		String producer = sc.nextLine();
		System.out.print("|개봉일 : ");
		String openning = sc.nextLine();
		System.out.print("|장르 : ");
		String genre = sc.next();
		sc.nextLine();
		MovieDTO dto = new MovieDTO(title, producer, openning, genre);
		int chk = mController.insertMovieProcess(dto);
		if (chk > 0)
			System.out.printf("%d개 삽입\n", chk);
		else
			System.out.println("삽입 실패");
	} // end addMovie()

	// 영화 삭제
	public static void deleteMovie(MovieController mController) {
		System.out.print("|영화 제목 : ");
		String movie = sc.nextLine();
		int chk = mController.deleteMovieProcess(movie);
		if (chk >= 0)
			System.out.printf("%d개 삭제\n", chk);
		else
			System.out.println("삭제 실패");

	} // end deletMovie()

	// 평점 입력
	public static void addScoreMovie(MovieController mController, Scanner sc) {
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		System.out.print("|영화 제목 : ");
		hmap.put("title", sc.nextLine());
		System.out.print("|메타크리틱 : ");
		hmap.put("metacritic", sc.nextLine());
		System.out.print("|로튼토마토 : ");
		hmap.put("rottentomato", sc.nextLine());
		System.out.print("|네이버 : ");
		hmap.put("naver", sc.nextLine());
		System.out.print("|다음 : ");
		hmap.put("daum", sc.nextLine());
		int chk = mController.updateScoreProcess(hmap);
		if (chk >= 0)
			System.out.println("|********************** 평점이 입력되었습니다. **********************|");
	} // end addScoreMovie()
	
	// 리뷰 입력
	public static void addReviewMovie(MovieController mController, Scanner sc) {
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		System.out.print("|영화 제목 : ");
		hmap.put("title", sc.nextLine());
		System.out.print("|리뷰 입력 : ");
		hmap.put("review", sc.nextLine());
		int chk = mController.updateReviewProcess(hmap);
		if(chk >= 0)
			System.out.println("|********************** 리뷰가 입력되었습니다. **********************|");
	} // end addReviewMovie()

}
