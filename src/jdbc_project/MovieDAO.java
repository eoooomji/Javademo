package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static MovieDAO dao = new MovieDAO();

	public MovieDAO() {

	}

	public static MovieDAO getInstance() {
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	} // end init()

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	} // end exit()

	public List<MovieDTO> listMethod() {
		List<MovieDTO> mList = new ArrayList<MovieDTO>();
		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM movie ORDER BY title";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MovieDTO dto = new MovieDTO();
				dto.setTitle(rs.getString("title"));
				dto.setProducer(rs.getString("producer"));
				dto.setOpenning(rs.getString("openning"));
				dto.setGenre(rs.getString("genre"));
				dto.setReview(rs.getString("review"));
				dto.setMetacritic(rs.getString("metacritic"));
				dto.setRottentomato(rs.getString("rottentomato"));
				dto.setNaver(rs.getString("naver"));
				dto.setDaum(rs.getString("daum"));
				mList.add(dto);
			}
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mList;
	} // end listMethod()

	public int insertMovieMethod(MovieDTO dto) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			String sql = "INSERT INTO movie(title, producer, openning, genre)";
			sql += "VALUES(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getProducer());
			pstmt.setString(3, dto.getOpenning());
			pstmt.setString(4, dto.getGenre());
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	} // end insertMovieMethod()

	public int deleteMovieMethod(String title) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			String sql = "DELETE FROM movie WHERE title = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	} // end deleteMovieMethod()

	public int updateScoreMethod(HashMap<String, Object> hmap) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			String sql = "UPDATE movie ";
			sql += "SET metacritic = ?, rottentomato = ?,naver = ?,daum = ?";
			sql += "WHERE title = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) hmap.get("metacritic"));
			pstmt.setString(2, (String) hmap.get("rottentomato"));
			pstmt.setString(3, (String) hmap.get("naver"));
			pstmt.setString(4, (String) hmap.get("daum"));
			pstmt.setString(5, (String) hmap.get("title"));
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	} // end updateScoreMethod()

	public int updateReviewMethod(HashMap<String, Object> hmap) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			String sql = "UPDATE movie SET review = ? WHERE title = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) hmap.get("review"));
			pstmt.setString(2, (String) hmap.get("title"));
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	} // end updateReviewMethod()

} // end class
