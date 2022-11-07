package jdbc_project;

import java.util.HashMap;
import java.util.List;

public class MovieController {
	private MovieDAO dao;
	
	public MovieController() {
		dao = MovieDAO.getInstance();
	}
	
	public List<MovieDTO> listProcess(){
		return dao.listMethod();
	}
	
	public int insertMovieProcess(MovieDTO dto) {
		return dao.insertMovieMethod(dto);
	}
	
	public int deleteMovieProcess(String title) {
		return dao.deleteMovieMethod(title);
	}
	
	public int updateScoreProcess(HashMap<String, Object> hmap) {
		return dao.updateScoreMethod(hmap);
	}
	
	public int updateReviewProcess(HashMap<String, Object> hmap) {
		return dao.updateReviewMethod(hmap);
	}
}
