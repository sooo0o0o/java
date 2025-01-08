package sub3;


//싱글톤 객체

public class Calc {		//클래스로 생성되어있기 때문에 참조시 여러번 사용 가능

	private static Calc instance = new Calc();	//new Calc() 클라스가 이 메소드안에 저장된다
	//싱글톤 객체 이름 = instance **
	
	public static Calc getInstance() {
		return instance;
	}
	//외부에서 객체(new Calc())를 생성 못하게 막아야함
	private Calc() {}
	
	
	//기능
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
	
	
}
