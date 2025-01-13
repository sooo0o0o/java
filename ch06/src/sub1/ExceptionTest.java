package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 날짜 : 2025.01.13
 * 이름 : 곽혜수
 * 내용 : Java 예외처리 실습하기
 */

public class ExceptionTest {
	public static void main(String[] args) {
		
		/////////////////////////////
		//		실행예외(런타임)		/////
		////////////////////////////
		
		//*예외클래스 Exception* //up-castiong of ArithmaticException ( 다형성이 적용된 catch 구문 )
		
		//예외상황1 :  N / 0
		
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {						//예외가 발생 가능한 코드를 작성
			
			r4 = num1 / num2;	
			//Exception in thread "main" java.lang.ArithmeticException: / by zero
			//예외 발생-> 프로그램이 강제로 중단 -> try ~ catch 사용
			
		}catch ( ArithmeticException e ) {		//예외 발생 시 처리 방법 작성
			
			e.printStackTrace();	//콘솔 출력 : 예외내용 출력
			
		}
		
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);	//r4가 try 블록 안에서만 사용 가능한 지역변수
		
		
		//예외상황2 :  배열의 잘못된 index 를 참조할 때
		int[] arr = {1, 2, 3, 4, 5};		//[0][1][2][3][4] 이므로, 
		
		try {
			for(int i = 0 ; i <= 5 ; i++ ) {	//[5] 는 존재하지 X
				System.out.print(arr[i] + " ");	
				//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException 
				// : Index 5 out of bounds
			}
			System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//예외상황3 : 객체 생성없이 method 호출
		Animal animal = null; // 객체 선언
		
		try {
			
			animal.move();
			
			//java.lang.NullPointerException: Cannot invoke "sub1.Animal.move()" 
			//because "animal" is null
			
		}catch (NullPointerException e) {
			
			e.printStackTrace();
			
		}
		
		
		//예외상황3 : 잘못된 casting
		Animal a1 = new Tiger();	//업캐스팅(다형성)
		Animal a2 = new Eagle();
		
		if(a1 instanceof Tiger) {	// 클래스 테스트
			Tiger tiger = (Tiger)a1 ; // 다운캐스팅
			tiger.move();
			tiger.hunt();
		}
				
		try {
			
			Shark shark = (Shark) a2;	
			shark.move();
			shark.hunt();
			
			//Exception in thread "main" java.lang.ClassCastException
			// : class sub1.Eagle cannot be cast to class sub1.Shark
			
		}catch(ClassCastException e) {
			
			e.printStackTrace();
			
		}
		
		
		
		/////////////////////////////
		//		일반예외(컴파일에러)	/////
		////////////////////////////
		
		//동적 객체 생성
		try {
			
			Class clazz = Class.forName("sub1.Eagle");	//sub1 패키지의 Eagle 클래스 정보 불러오기
			//Exception in thread "main" java.lang.Error: Unresolved compilation problem 
			// : Unhandled exception type ClassNotFoundException
			
			Constructor<?> constructor = clazz.getDeclaredConstructor();	//생성자 선언
			Eagle eagle = (Eagle) constructor.newInstance();	//동적 객체 생성
			
			eagle.move();
			eagle.hunt();
			
		//Exception e 사용시 이렇게 많은 양의 catch 가 필요 X
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (NoSuchMethodException e) {
			
			e.printStackTrace();
			
		} catch (SecurityException e) {
			
			e.printStackTrace();
			
		} catch (InstantiationException e) {
			
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
			
		} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
			
		} catch (InvocationTargetException e) {
			
			e.printStackTrace();
			
		} finally {
			//예외 처리 발생여부에 상관 없이 마지막에 무조건 실행되는 로직
			System.out.println("finally 실행...");
		}	
				
		System.out.println("프로그램 정상 종료...");
		
	}	//main end
	
}
