package ch07.sec02;

public class SmartPhone extends Phone {
	//필드 선언
	public boolean wifi;
	
	//생성자 선언
	public SmartPhone(String model, String color) {
		this.model=model;
		this.color=color;
		//phone 으로부터 상속받은 필드
	}
	
	//메소드 선언
	public void setWifi(boolean sifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
		
	}
}
