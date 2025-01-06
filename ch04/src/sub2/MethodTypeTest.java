package sub2;
/*
 * 날짜 : 2025.01.06
 * 이름 : 곽혜수
 * 내용 : Java 메서드 타입 실습하기 
 */

public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		//메서드 호출
		
		double y1 = type1(1.2);	// 1.2-> 인자값 : 메서드를 호출할 때 전달하는 값
		double y2 = type1(2.3);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		
		type2(true);
		type2(false);	// 반환값이 없기때문에 대입 연산자(=) 없음
		
		boolean result = type3();	// 매개변수가 없으므로 인자값이 없음
		System.out.println("result : " +result);
		
		type4();
		
	}
	
	
	//Type 1. 매개변수 O 반환값 O
	
	public static double type1(double r) {
		
		double y = (r * r) + 3.14;
		return y;
	}
	
	
	//Type 2. 매개변수 O 반환값 X
	
	public static void type2(boolean status) {
		
		if(status) {
			
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
		
	}
	
	
	//Type 3. 매개변수 X 반환값 O
	
	public static boolean type3(/*매개변수자리*/) {
		
		int num1 = 1;
		int num2 = 2;
		
		if (num1 > num2) {
			return true;
		}else {
			return false;
		}
	
}
	
	
	//Type 4. 매개변수 X 반환값 X
	
	public static void type4() {
		
		double result = type1(2.3);
		System.out.println("반지름 2.3인 원의 넓이 : " + result);
	
}
	

}
