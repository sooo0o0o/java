package ch04.sec03;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		
		switch(grade) {	
			case'A', 'a' -> {	//switch expression 을 이용하면 변수에 바로 스위치된 값 대입가능
								//default 값이 필수로 있어야한다.
				System.out.println("우수 회원입니다.");
			}
			case'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
				
			}
		}
		
		switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("손님입니다.");
			
		}	
	}
}
