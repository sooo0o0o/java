package sub2;


/*
 * 날짜 : 2025.01.20
 * 이름 : 곽혜수
 * 내용 : JAVA Thread Interrupt 실습하기
 */

class SubThread extends Thread {
	
	@Override
	public void run() {
		
		int i = 1;
		
		try {
			
		
			while(true) {
				System.out.println("SubThread 실행... " + i);
				i++;
				
				Thread.sleep(1000);
			
			}
		
		}catch (InterruptedException e) {
			e.printStackTrace();
		
		}
		
		System.out.println("SubThread 종료...");
	}
	
}

public class ThreadInterruptTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		sub.start();
		
		try {
			Thread.sleep(1000 * 10);	//10초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		//서브 스레드 일시 정지 상태에서 죵로상태로 전환
		sub.interrupt();
		
		System.out.println("메인 스레드 종료...");
	}
}
