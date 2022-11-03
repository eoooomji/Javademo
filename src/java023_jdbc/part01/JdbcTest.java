package java023_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public JdbcTest() {

	}

	public void process() {
		try {
			// 1. 드라이버 로딩
			/*
			 * 드라이버 오류시 1. 클래스 명 확인 2. 라이브러리 확인
			 */
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. 서버 연결
			/*
			 * 서버 연결 오류시 1. 연결한 변수 문장 확인 2. 매개변수 확인 3. 매개변수 값 확인
			 */
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);

			// System.out.println(conn);

			conn.setAutoCommit(false); // 자동 오토 커밋 (true로 되어 있으면 실행할 때 마다 커밋이 된다. false인지 항상 확인한다.)

			// 3. 쿼리문을 실행하귀 위한 statement타입의 객체를 가져옴
			stmt = conn.createStatement();

			// 4. 쿼리문을 실행 : SELECT - executeQuery( ) / INSERT, UPDATE, DELETE -
			// executeUpdate()
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			// System.out.println(rs);

			// 5. 쿼리문의 결과 출력
			while (rs.next()) {
				int departmentId = rs.getInt("department_id");
				String departName = rs.getString("department_name");
				int managerId = rs.getInt("manager_id");
				int locationId = rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", departmentId, departName, managerId, locationId);
			}

			conn.commit();

		} catch (ClassNotFoundException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			// 6. JDBC 연결 종료 (연결을 종료하지 않을 시 트래픽이 줄지 않고 서버에 누적되어 다운이 될 수 있다.)
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	} // end process()

} // end class
