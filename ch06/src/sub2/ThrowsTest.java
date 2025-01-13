package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2025.01.13
 * 이름 : 곽혜수
 * 내용 : Java Throws 예외처리 실습하기
 */

public class ThrowsTest {
	public static void main(String[] args) {
		
		//method1, method2 에서 throws 한 예외를 최종적으로 main() 에서 처리
		try {
			method1(10);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
		
	}
	
	//method1을 호출한 곳으로 Exception 예외 던짐
	public static void method1(int n1) throws Exception {
		method2(n1);
		
	}
	
	//method2를 호출한 곳으로 InputMismatchException, ArithmeticException 예외 던짐
	public static void method2(int n1) throws InputMismatchException, ArithmeticException {
		Scanner scan = new Scanner(System.in);
		System.out.println("n2 입력 : ");	
		
		
		int n2 = scan.nextInt();	//InputMismatchException
		int result = n1 / n2;		//ArithmeticException: / by zero
		
		System.out.println("result : " + result);
	}
	
}
