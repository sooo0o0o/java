package sub4;

public class Sedan extends Car {					//'상속'을 통해 코드를 매번 반복 생성 할 필요를 줄인다	
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);								  //***의무 발생! 부모의 생성자 정의(초기화)
		this.cc = cc;
	}
	
	public void turbo() {			
		
	/*
	 * 부모의 속성을 자식 클래스에서 참조해야하는데 부모생성자 Car 에서 speed 가 private 되어있다 
	 * private 때문에 speed 는 Car 에서만 사용 할 수 있다 -> 자식 클래스지만 *private 속성*은 사용 할 수 없다!
	 * 이를 사용할 수 있게 만드려면, 부모 클래스(Car) 에서 **protected 접근권한**을 사용해야 함
	*/
		
		speed += 20;
		
	}
	
	public void show() {
		
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("배기량 : " + this.cc);
		System.out.println("현재속도 : " + this.speed);

		
	}
	
}
