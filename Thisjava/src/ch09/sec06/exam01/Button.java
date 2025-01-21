package ch09.sec06.exam01;

public class Button /* =객체, Button */ {
	/*
	 * 현재 클래스 블록에 적혀있는 코드 -> **중첩 인터페이스 선언**
	 * 외부에서 접근이 가능하도록 public 이면서, Button 객체 없이 사용이 가능한 static ClickListener 선언
	 * + 추상 메소드인 onClick() -> 버튼이 클릭되었을 때 호출 될 메소드임
	 */
	
	//정적 중첩 인터페이스
	public static interface ClickListener {
		
		//추상 메소드
		void onClick();
		
	}
}
