package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2025.01.23
 * 이름 : 곽혜수	
 * 내용 : JAVA JDBC CRUD 실습하기
 *
 * JDBC - Java DataBase Connection **
 * 		- Java 기술로 DB를 연결하기 위한 기술 표준
 * CRUD - Create(insert) , Read(select) , Update(update) , Delete(delete)
 */

public class PreparedSelectTest {
	public static void main(String[] args) {
		
		List<User1> users = new ArrayList<>();
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			//1.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//3.
			String sql = "SELECT * FROM `User1`";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			System.out.println(psmt);
			
			//4.
			
			ResultSet rs = psmt.executeQuery(sql);
			
			//5.
			while(rs.next()) {
				
				User1 user1 = new User1();
				
				user1.setUid(rs.getString(1));
				user1.setName(rs.getString(2));
				user1.setHp(rs.getString(3));
				user1.setAge(rs.getInt(4));
				
				users.add(user1);
			}
			
			//6.
			psmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		for(User1 user1 : users) {
			System.out.println(user1);
		}
		
	}
}
