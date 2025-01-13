package ch07.sec05.exam02;

public class SportsCar extends Car {
	
	 
	@Override
	 
	public void speedUp() {
		speed += 10;
	}
	/*
	 * 
	//오버라이딩을 할 수 없음
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
	*/
	//final 이라는 키워드가 method 생성에 포함 = *최종적인* method
	//즉, 다른 class 에서 호출하여 사용할 수 X
	//Car 클래스의 stop() method 를 final 로 선언 했으므로, 자식 클래스인 SportsCar 에서 Overriding 할 수 X
	
}
