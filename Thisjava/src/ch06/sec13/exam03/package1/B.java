package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		
		//객체 생성
		
		A a = new A();
		
		
		//필드값 변경
		a.field1 = 1;
		a.field2 = 1;		//package 가 같으면 default 접근제한자에 접근 가능
		/*
		 a.field3 = 1; 		//package 가 같아도 private 필드엔 접근 할 수 없다
		*/
		
		//메소드 호출
		a.method1();
		a.method2();		//package 가 같으면 default 접근제한자에 접근 가능
		/*
		 a.method3();		//package 가 같아도 private 필드엔 접근 할 수 없다
		*/
		
		
		
	}
}
