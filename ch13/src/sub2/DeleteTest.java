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
 * CRUD - Create(insert) , Read(select) , Update(update) , Delete(delete)
 */

public class DeleteTest {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			Statement stmt = conn.createStatement();
			
			String sql = "DELETE FROM `User1` WHERE `uid`='j101'";
			
			stmt.executeUpdate(sql);
			
			
			stmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("업데이트 완료...");
		
		
	}

}
