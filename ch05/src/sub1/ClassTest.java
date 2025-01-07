package sub1;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : Java 클래스 실습하기
 */

public class ClassTest {
	public static void main(String[] args) {
		
		//Car 객체 생성
		
		Car sonata = new Car();	//Car -> 사용자 정의 타입
		
		
		//객체 초기화
		
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 상호작용
		
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		//객체 선언
		
		Car avante;
		
		//객체 생성
		
		avante = new Car();
		
		//객체 초기화
		
		avante.name = "아반테";
		avante.color = "흰색";
		avante.speed = 10;
		
		//객체 상호작용
		
		avante.speedUp(70);
		avante.speedDown(20);
		avante.show();
		
	}

}