package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2025/01/02
 * 이름 : 곽혜수
 * 내용 : Java 조건문 switch 실습하기
 */

public class SwitchTest {
	
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 	//정수만 입력 받도록 설정 했기때문에 그 외엔 전부 에러
		
		System.out.println("입력 숫자 : " + number);
		
		//조건값의 결과에 따라 case 별 실행흐름으로 분기
		switch(number%2) { 			
		
		case 0:
			
			System.out.println("number는 짝수");
			break;
			
		case 1:
			
			System.out.println("number는 홀수");
			break;
			
		default:
			
			System.out.println("number는 숫자가 아님");
			break;
		}
		
		sc.close();
	}

}
