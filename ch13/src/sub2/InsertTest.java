package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025.01.23
 * 이름 : 곽혜수	
 * 내용 : JAVA JDBC CRUD 실습하기
 *
 * JDBC - Java DataBase Connection **
 * 		- Java 기술로 DB를 연결하기 위한 기술 표준
 * CRUD - Create, Read, Use, Delete
 */

public class InsertTest {
	public static void main(String[] args) {
		
		// DB 정보 **
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			//step 1. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2. DB 접속
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			
			//step 3. SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//step 4. SQL 실행
			String sql = "INSERT INTO `User1` VALUES ('j104', '김유신', '010-1234-1001', 23)";
			stmt.executeUpdate(sql);
			
			//step 5. ResultSet 결과처리 (Select)
			
			
			//step 6. DB 종료
			stmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
