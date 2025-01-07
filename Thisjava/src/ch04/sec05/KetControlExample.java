package ch04.sec05;

import java.util.Scanner; 							//scanner 사용 위해 import

public class KetControlExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//scanner 생성
		
		boolean run = true;							//while 문 조건식을 위한 변수 선언
		int speed = 0;
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("---------------------------");
			System.out.println("선택 : ");			//메뉴 생성
			
			String strNum = scanner.nextLine(); 	//키보드에서 입력한 내용 읽음
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("3")) { 
				run = false;
			}	// 또는 식을 끝내기 위해서 break 문 사용 가능
		}
		
		System.out.println("프로그램 종료");
				
		scanner.close();
	}
}
