package ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);						//프로그램 강제 종료
		}
		
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); 	//문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);	//문자열을 정수로 변환
		
		int result = num1 + num2;
		
		System.out.println(num1 + "+" + num2 + "=" + result);
	}
}

/*
 * 이클립스 상단의 [Run] - [Run Configurations] - "Project 입력란" - 'ch05.sec11.MainString....'
 * - [Arguments]탭 - "Program arguments 입력란" - '10 20' 입력
 * 
 *	--->이 경우, 값이 대입되며 10+20=30 이라는 값이 나온다 
*/
 