package sub5;

/*
 * 날짜 : 2025.01.09
 * 이름 : 곽혜수
 * 내용 : Java Overriding 실습하기	
 */

class AAA {										//AAA
	
	public void method1() {						//method 1
		System.out.println("AAA:method1...");	//method 2
	}											//method 3 *오버로드*
	public void method2() {
		System.out.println("AAA:method2...");
	}
	public void method3() {
		System.out.println("AAA:method3...");
	}
	
}

class BBB extends AAA{							//BBB
	
	@Override									//method 2 - AAA의 method2를 오버라이드
	public void method2() {						//method 3 - 매개변수 1개 *오버로드*
		System.out.println("BBB:method2...");
	}
	
	//Overload
	public void method3(int a) {
		System.out.println("BBB:method3...");
	}
}

class CCC extends BBB{							//CCC
	@Override
	public void method1() {						//method 1 - AAA의 method1를 오버라이드
		System.out.println("CCC:method1...");	//method 2 - BBB의 method2를 오버라이드
	}											//method 3 - 매개변수 2개 *오버로드*
	@Override
	public void method2() {
		System.out.println("CCC:method2...");
	}
	//Overload
	public void method3(int a, int b) {
		System.out.println("CCC:method3...");
	}
}


public class OverridingTest {
	public static void main(String[] args) {
		
	//오버라이드 메서드 실습
		CCC c = new CCC();
		
		c.method1();			//CCC에서 AAA 의 method1을 재정의(오버라이드)
		c.method2();			//CCC에서 AAA 의 method2를 재정의(오버라이드)
		c.method3();			//AAA의 method3은 인수가 없고 *오버로드*
		c.method3(1);			//BBB의 method 3은 인수가 한 개 있음 *오버로드*
		c.method3(1, 2);		//CCC의 method3은 인수가 두 개 있음 *오버로드*
	
	
		
	//Car 상속 객체 오버라이드 메서드
	
	Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
	Truck bongo = new Truck("봉고", "흰색", 0, 0);
	
	sonata.speedUp(200);
	sonata.show();
	
	bongo.load(10);
	bongo.speedUp(80);
	bongo.show();
	
	
	}	


}
