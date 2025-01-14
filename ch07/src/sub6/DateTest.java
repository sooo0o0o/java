package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2025.01.14
 * 이름 : 곽혜수
 * 내용 JAVA Date, Calendar 클래스 실습하기
 */

public class DateTest {
	public static void main(String[] args) {
		
		//Date 클래스
		Date date = new Date();
		System.out.println(date);		//간접적으로 toString 호출 = date.toString()
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String result = sdf.format(date);
		System.out.println("result : "+result );
		
		//Calendar 클래스 ( 싱글톤 객체 )
		Calendar cal = Calendar.getInstance();		
		//Calendar 객체 = Singleton 이므로, new Calendar 불가능 ** 
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;	//Jan = '0'
		int dt = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%d %d:%d:%d", year, month, dt, hour, min, sec);
		
		// %(공백에 넣을 글자?)(표현된 값의 갯수)(자료형태) -> %02d : 빈자리는 0으로 채우는 2자리의 정수
		
		
	}
}
