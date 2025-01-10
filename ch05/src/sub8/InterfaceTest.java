package sub8;
/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : JAVA 인터페이스 실습하기
 */
/*
 * 인터페이스   -> 형태가 없는 구조체
 *			-> 오직 **추상 method**만 가지고있음
 *			-> 자체가 약결합으로, 다형성 구현을 위해 사용
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		//Interface 예제 1 - 표준화된 공통 클래스 구조 설계
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.soundUp();
		lg.soundDown();
		lg.chUp();
		lg.chDown();
		
		samsung.powerOn();
		samsung.powerOff();
		samsung.soundUp();
		samsung.soundDown();
		samsung.chUp();
		samsung.chDown();
		
		
		//Interface 예제 2 - 유연성( 다형성을 통한 결합도 완화 ) ***
		Bulb bulb = new Bulb();		
		Socket socket = new Cable(bulb);
		
		socket.switchON();
		socket.switchOff();
		
		
		//Interface 예제 3 - 다중 상속 효과
		//Computer, TV, Bulb
		
		
		
	}
}
