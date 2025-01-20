package sub4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 날짜 : 2025.01.20
 * 이름 : 곽혜수
 * 내용 : Java 스레드풀 실습하기
 */

class Task implements Runnable {
	
	private String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" - "+name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}


public class ThreadPoolTest {
	public static void main(String[] args) {	
		
		//스레드 실행
		/*스레드 갯수에 따라 처리 시간이 달라짐 
		 -> 작업량 10개, 스레드 5개 : 2초
		 -> 작업량 10개, 스레드 2개 : 5초*/
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//작업을 thread-pool 에 제출
		for(int i = 1; i <= 10; i++) {
			executor.submit(new Task("Task " + i));
			
			
			
		}
		
		//스레드풀 종료
		executor.shutdown();
		
		System.out.println("프로그램 종료");
		
		
	}
	
}
