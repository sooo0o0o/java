package sub4;

/*
 * 날짜 : 2025.01.09
 * 이름 : 곽혜수
 * 내용 : Java 클래스 상속 실습하기	
 */


//클래스 생성

class Parent{
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int plus() {
		return num1 + num2;
	}
}


class Child extends Parent {			// class 클래스명 extends 상속받을 클래스명
	private int num3;					// 부모 클래스의 기능을 그대로 물려받는것
	private int num4;
	
	/*
	 * 상속 받았기 때문에 부모의 생성자를 초기화 해야햐는 '의무'가 생긴다!
	 * 정의할 때 부모의 생성자까지 모두 정의해줘야함
	 * super(부모의 속성);
	*/
	
	public Child(int num1, int num2, int num3, int num4) {	
		
		super(num1, num2);				//부모의 생성자까지 정의를 해서 호출을 해줘야한다.
		
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3 - num4;
	}
	
}


//클래스 상속(Inherit) 이해하기

public class IngeritTest {
	
	public static void main(String[] args) {
		
		//상속 객체 생성
		Child child = new Child(1,2,3,4);
		int result1 = child.plus();		//부모클래스의 plus 기능을 상속받았기 떄문에 child 가 사용할 수 있음
		int result2 = child.minus();
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		
		
		//Car 상속 객체 생성
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고","남색",0,0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		//Account 상속 객체 생성
		
		StockAccount kb = new StockAccount("KB증권", "101-11-1001", "홍길동", 10000,"삼성전자", 0, 50000);
		kb.deposit(1000000);
		kb.buy(10, 50000);
		kb.show();
		
		kb.sell(5, 60000);
		kb.show();
		
		 //Person 클래스 상속 객체 생성
		
		Doctor doctor = new Doctor("김유신", 33, "소아과");
		Engineer engineer = new Engineer("김춘추", 34, "소프트웨어");
		
		doctor.work();
		engineer.work();
		
		
		
		
		
		
		
		
		
	}

}
