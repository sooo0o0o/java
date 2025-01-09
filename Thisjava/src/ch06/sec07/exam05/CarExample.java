package ch06.sec07.exam05;

public class CarExample {
	
	public static void main(String[] args) {
		Car car1 = new Car("자가용");	//매개변수가 String 1개이므로 , 생성자1 호출
		System.out.println("car1.company : "+car1.company);
		System.out.println("car1.model : "+car1.model);
		
		Car car2 = new Car("자가용", "빨강"); //매개변수가 String, String 이므로 생성자2 호출
		System.out.println("car2.company : " +car2.company);
		System.out.println("car2.model : " +car2.model);
		System.out.println("car2.color : " +car2.color);
		
		Car car3 = new Car("택시", "검정", 200); //매개변수가 Str, Str, int 이므로 생성자3 호출
		System.out.println("car3.company : " +car3.company);
		System.out.println("car3.model : " +car3.model);
		System.out.println("car3.color : " +car3.color);
		System.out.println("car3.maxSpeed : " +car3.maxSpeed);
		
	}

}
