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

public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			
			String sql = "UPDATE `User1` SET `name`=? ,`hp`=? , `age`=?";
				   sql += " WHERE `uid`=?";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "김유신");
			psmt.setString(2, "010-1234-1022");
			psmt.setInt(3, 25);
			psmt.setString(4, "j101");
			
			System.out.println(psmt);
			
			psmt.executeUpdate();
			
			conn.close();
			psmt.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
		
	}
}
