package sub2;

/*
 * 날짜 : 2025.01.20
 * 이름 : 곽혜수
 * 내용 : JAVA Thread Join 실습하기
 */
class WorkThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 0; i <10; i++) {
			System.out.println("WorkThread..."+ i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("WorkThread 종료....");
	}
	
	
}



public class ThreadJoinTest {
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		
		//스레드 실행
		work.start();
		
		
		//스레드 종료 대기 -> main thread 가  work thread 종료를 기다림, 종료 후 합류(join)
		try {
			work.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("메인 스레드 종료...");		//프로그램 종료
			
		
	}
}
