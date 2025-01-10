package sub7;
/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : JAVA 추상클래스 실습하기
 */
/*
 * 추상 method 또는 완성된 method 둘 다 가질 수 있음
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		
		//추상 클래스는 객체 생성 X
		//Animal animal = new Animal();
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
	}

}
