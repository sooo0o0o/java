package ch06.sec07.exam05;

public class Car {
	//필드 선언
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {				//생성자1
		this(model,"은색",250);				//생성자3 호출
	}
	/*
	 this(model, "은색", 250) 으로 생성자 3을 호출해서 실행 후, 원래 생성자인 1번으로 돌아와 Car(String model) 실행
	 따라서, this(m, "", 250) 은 출력되지 X 
	*/
	
	Car(String model, String color) {		//생성자2
		this(model, color, 250);				//생성자3 호출
	}
	
	Car(String model, String color, int maxSpeed) {		//생성자3
		this.model = model;						//공통 초기화 코드
		this.color = color;						//공통 초기화 코드
		this.maxSpeed = maxSpeed;				//공통 초기화 코드
	}
	
}
