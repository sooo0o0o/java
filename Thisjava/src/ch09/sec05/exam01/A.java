package ch09.sec05.exam01;

public class A {
	//A의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			
			//A의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();
			
			//A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
				
		}
	}
	
	
	//정적 멤버 클래스
	static class C {
		void method() {
			//A의 인스턴스 필드와 메소드 사용 !불가능!\
			//field1 = 10;	-> X
			//method1();	-> X
			//why? 정적 멤버 클래스는 바깥 객체가 없어도 사용가능해야 하기 때문에 **바깥 클래스의 인스턴스 필드와 인스턴스 메소드를 사용 할 수 없다**
			
			//A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
	
	
}
