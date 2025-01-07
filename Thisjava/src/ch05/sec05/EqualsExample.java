package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";								//Var1과 Var2는 동일한 문자열 리터럴로 생성
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");	//즉, 참조가 같아 true 로 나온다
		}								
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");					//new 연산자를 통해 String 객체를 별도로 생성
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {		
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");	// 참조가 다르게 나온다 (false)
			
		}
		
		if(strVar3.equals(strVar4)) {							//내부 '문자열'만 비교하는 경우 equals 사용
			System.out.println("strVar3과 strVar4는 문자열이 같음");	//대소문자 구분함
			
		}
	}
}
