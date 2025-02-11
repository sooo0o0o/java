package sub3; //인스턴스화 시켜서 ClassTest.java 에서 호출하여 사용

//공유 할 자료? 값들을 모아서 저장해놓은것

//Car 클래스 정의 (설계)
public class Car{
	
	//속성(멤버 변수) - 클래스 속성은 캡슐화를위해 무조건 private 선언
	
	// /*public*/ String name;		//public 이 생략되어있는 상태 -> 외부에서 참조 가능
	// /*public*/ String color;		//이걸 private 으로 변경 해주면 됨 -> 내부에서만 사용 가능하게 만듬 : "캡슐화"
	// /*public*/ int speed;		//캡슐화 된 속성은 참조할 수 없음
	
	private String name;			//캡슐화 된 상태
	private String color;
	private int speed;
	
	//클래스 변수 (정적 변수) - 객체 생성 없이 클래스 이름으로 직접 참조
	public static int count;
	//-> static 이 없으면 클래스를 참조할 수 없다!
	
	//생성자 - 캡슐화 된 속성을 초기화 하기 위한 클래스 이름과 동일하고, 반환 타입이 없는 method
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	
	
	//기능 (멤버 메서드) - 클래스 기능은 무조건 public 선언
	
	
	//클래스 메서드 (정적 메서드) - 객체 생성 없이 클래스 이름으로 직접 호출
	public static int getCount( ) {
		return count;
	}
	
	public void speedUp(int speed) {	//private 메서드를 보는 경우는 잘 없음
		//속성 speed 에 매개변수값 대입
		//this 는 현재 클래스를 지칭
		
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재 속도 : " + this.speed);
		
	}
	
	//Getter, Setter 정의 (옵션) - 캡슐화 된 속성을 수정하기위한 method
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}