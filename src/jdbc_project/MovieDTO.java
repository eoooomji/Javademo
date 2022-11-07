package jdbc_project;

public class MovieDTO {
	private String title; // 영화 제목
	private String metacritic; // 메타크리틱 점수
	private String rottentomato; // 로튼토마토 점수
	private String naver; // 네이버 점수
	private String daum; // 다음 점수
	private String review; // 리뷰
	private String producer; // 감독
	private String openning; // 개봉일
	private String genre; // 장르

	public MovieDTO() {

	}

	public MovieDTO(String title, String producer, String openning, String genre) {
		this.title = title;
		this.producer = producer;
		this.openning = openning;
		this.genre = genre;
	}

	

	public MovieDTO(String title, String metacritic, String rottentomato, String naver, String daum, String review,
			String producer, String openning, String genre) {
		this.title = title;
		this.metacritic = metacritic;
		this.rottentomato = rottentomato;
		this.naver = naver;
		this.daum = daum;
		this.review = review;
		this.producer = producer;
		this.openning = openning;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetacritic() {
		return metacritic;
	}

	public void setMetacritic(String metacritic) {
		this.metacritic = metacritic;
	}

	public String getRottentomato() {
		return rottentomato;
	}

	public void setRottentomato(String rottentomato) {
		this.rottentomato = rottentomato;
	}

	public String getNaver() {
		return naver;
	}

	public void setNaver(String naver) {
		this.naver = naver;
	}

	public String getDaum() {
		return daum;
	}

	public void setDaum(String daum) {
		this.daum = daum;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getOpenning() {
		return openning;
	}

	public void setOpenning(String openning) {
		this.openning = openning;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
