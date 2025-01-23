package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/*
 * 날짜 : 2025.01.23
 * 이름 : 곽혜수	
 * 내용 : JAVA JDBC CRUD 실습하기
 *
 * JDBC - Java DataBase Connection **
 * 		- Java 기술로 DB를 연결하기 위한 기술 표준
 * CRUD - Create(insert) , Read(select) , Update(update) , Delete(delete)
 */

public class PreparedInsertTest {
	public static void main(String[] args) {
		//DB정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			//1 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. DB 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//3. SQL 실행객체 생성
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?)";	//QUERY 파라미터 ? 를 사용해 쿼리문 작성
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "j101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1234-1001");
			psmt.setInt(4, 23);
			
			System.out.println(psmt);
			
			//4. SQL 실행
			psmt.executeUpdate();
			
			//5. 조회결과 처리
			
			//6. DB 종료
			conn.close();
			psmt.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
		
		
	}
}
