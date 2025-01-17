package test3;
/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : 싱글톤 객체와 인스턴스 객체 연습문제
 */

class Adder { 
	
	//Singleton instance
	private static Adder instance = new Adder();
	
	public static Adder getInstance() {
		return instance;
	}									//싱글톤 객체 생성
	
	private Adder() {}		//기본 생성자와 생성자 오버로딩을 병행하기위해 *private 생성자() {}* 필요
	
	
	private Adder(int value) {
		y += value;
	}
	
	//Private field
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
		
	}
	public static void add(Adder a2) {
		a2.x += 10;
		/*
		 *.x = 참조변수
		 *x 변수를 가지고 있는건 Adder 이므로 , Adder a2
		*/
	}
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
}

public class Test06 {
	public static void main(String[] args) {
		Adder a1 = Adder.getInstance();
		
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10,20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1,3);
		a1.show();
		
		
	}
}
