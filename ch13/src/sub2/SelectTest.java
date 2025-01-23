package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sub3.User1;


/*
 * 날짜 : 2025.01.23
 * 이름 : 곽혜수	
 * 내용 : JAVA JDBC CRUD 실습하기
 *
 * JDBC - Java DataBase Connection **
 * 		- Java 기술로 DB를 연결하기 위한 기술 표준
 * CRUD - Create(insert) , Read(select) , Update(update) , Delete(delete)
 */

public class SelectTest {
	public static void main(String[] args) {
		// DB 정보 **
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		// 결과셋 저장 리스트 생성
		List<User1> users = new ArrayList<>();
				
		try {
			//step 1 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 DB 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//step 3 SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			//step 4 SQL 실행
			String sql = "SELECT * FROM `User1`";
			ResultSet rs = stmt.executeQuery(sql);
			
			//***step 5 RESULT SET 결과처리***
			while(rs.next()) {
				
				//ResultSet 커서를 데이터 갯수만큼 next() 시켜 각 컬럼별 데이터 추출
				
				String 	uid = rs.getString(1);
				String 	name = rs.getString(2);
				String 	hp = rs.getString(3);
				int 	age = rs.getInt(4);
				
				//추출된 데이터를 가지고 User1 Entity 객체 생성
				User1 user1 = new User1();
				user1.setUid(uid);
				user1.setName(name);
				user1.setHp(hp);
				user1.setAge(age);
				
				users.add(user1);
				
			}
			
			//step 6 DB종료
			
			rs.close();
			stmt.close();
			conn.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(User1 user1 : users) {
			System.out.println(user1);
		}
		
		System.out.println("업데이트 완료...");
	}

}
