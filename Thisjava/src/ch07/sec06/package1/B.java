package ch07.sec06.package1;

//A와 같은 package

public class B {
	//메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
