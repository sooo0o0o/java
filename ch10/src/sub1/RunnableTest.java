package sub1;

/*
 * 날짜 : 2025.01.20
 * 이름 : 곽혜수
 * 내용 : JAVA Runnable 실습하기
 */

//스레드 작업을 위한 Runnable 구현체 정의
class RunnableImpl implements Runnable {
	
	private String name;
	
	public RunnableImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10 ; i ++) {
			System.out.println(name + "스레드 실행 중...");
			
			try {
				Thread.sleep(1000);							//1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(name + "스레드 종료...");			//프로그램 종료
		
	}
	
}



public class RunnableTest {
	public static void main(String[] args) {
		
		//Runnable 객체 생성
		RunnableImpl run1 = new RunnableImpl("작업 1");
		RunnableImpl run2 = new RunnableImpl("작업 2");
		
		//Thread 생성
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		
		//스레드 실행 		
		t1.start();	//Thread 클래스의 start()  메서드로 작업스레드 실행
		t2.start();
			
				
				
		//메인 스레드 작업 실행
			for(int i = 0; i < 10 ; i ++) {
				System.out.println("메인 스레드 실행 중...");
					
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
					
		}
		System.out.println("메인 스레드 종료...");			//프로그램 종료
				
	}
}
