package ch09.sec04.exam03;

/*
 * 로컬 변수를 로컬 클래스에서 사용 할 경우 -> final 특성을 갖게된다
 * 따라서, 값을 읽을수만 있고 수정할 수 없음
 * why? 로컬 클래스 내부에서 값을 변경하지 못하도록 제한하기 떄문! (final)
 * final 키워드 선언이 필수는 아니지만, 로컬 변수에 final 키워드를 추가하면 변수가 final 변수임을 명확히 보여줄 수 있음
 */

public class A {
	
	//메소드
	public void method1(int arg) {	//final int arg
		
		//로컬 변수
		int var = 1;				//final int var = 1;
		
		
		//로컬 클래스
		class B {
			
			//메소드
			void method2() {
				//로컬 변수 읽기
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
				
				//로컬 변수 수정 !불가능!
			}
		}
				
		//로컬 객체 생성
		B b = new B();
	
		//로컬 객체 메소드 호출
		b.method2();
	
		//로컬 변수 수정 !불가능!
		
		
		
	}
	
	
}
