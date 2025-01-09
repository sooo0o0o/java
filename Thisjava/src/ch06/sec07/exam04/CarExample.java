package ch06.sec07.exam04;

public class CarExample {
	public static void main(String[] args) {
		
		Car car1 = new Car();			//Car 생성자1 호출
		System.out.println("car1.company : " + car1.company);
		System.out.println();	//개행
		
		Car car2 = new Car("자가용");		//Car 생성자2 호출 -> String
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		
		Car car3 = new Car("자가용", "빨강");		//Car 생성자3 호출 -> String, String
		System.out.println("car3.company : "+ car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car car4 = new Car("택시", "검정", 200);	//Car 생성자 4 호출 -> String, String, int
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);

	}
}
