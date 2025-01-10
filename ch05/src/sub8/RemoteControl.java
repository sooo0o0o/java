package sub8;
/*
 * 인터페이스 : abstract method only ***
 * 일종의 클래스 구현 가이드
 */

public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	
	//abstract 생략
	public void chUp();	
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
	
}
