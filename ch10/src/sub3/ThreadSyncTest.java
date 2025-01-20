package sub3;


/*
 * 날짜 : 2025.01.20
 * 이름 : 곽혜수
 * 내용 : JAVA Thread 동기화 실습하기
 */

public class ThreadSyncTest {
	public static void main(String[] args) {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		System.out.println("Count 결과 : "+ count.getNum());
		
	}
	
}
