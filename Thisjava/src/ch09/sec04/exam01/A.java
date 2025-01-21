package ch09.sec04.exam01;

public class A {
	//생성자
	A() {
		//로컬 클래스 선언 -> 생성자가 실행될 동안에만 객체 생성 가능
		class B {}
		
		//로컬 객체 생성
		B b = new B();
	}
	
	
	//메소드
	void method() {
		//로컬 클래스 선언 -> 메소드가 실행될 동안에만 객체 생성 가능
		class B {}
		
		//로컬 객체 생성
		B b = new B();
	}
}
