package sub7;		


//추상 클래스 - 추상 method 를 갖는 클래스 , 상속(inherit)을 위한 클래스 -> for overriding *

public abstract class Animal {		//abstract = 추상클래스
	
	public abstract void move();	//내용 없이 선언만 - 추상 method : 내용이 없는 미완성 method -> 오버라이드 염두
	
	public void hunt() {}			//overriding 을 하기 위해서 내용이 없는 빈 메서드 선언!
				
		
}
