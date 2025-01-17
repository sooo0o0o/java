package test3;



/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : 싱글톤 객체 연습문제
 */

class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("======================");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("----------------------");
	}
}

class CarFactory {
	private static CarFactory instance = new CarFactory();	//singleton 객체 생성
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
		
		/* <동일한 코드>
		 * Vehicle v = new Vehicle(name, price)
		 * return v;
		*/
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		/*
		 * 생성자 CarFactory가 private 으로 막혀있기 때문에, 직접적으로 new CarFactory(); 코드 작성 불가
		 * 그래서 getInstance()를 통해 instance 에서 가지고 옴
		*/
		
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}

}
