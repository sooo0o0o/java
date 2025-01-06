package ch04.sec03;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시간 : " + time + "시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default: 
				System.out.println("외근을 나갑니다.");	//break 가 없기때문에, 랜덤으로 나온 case 부터 끝까지 실행
		}
	}
}
