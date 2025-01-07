package step2;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : 백준 2단계 4번 사분면 고르기
 */

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			
			System.out.println("1");
			
		}else if (x < 0 && y > 0) {
			
			System.out.println("2");
			
		}else if (x < 0 && y < 0) {
			
			System.out.println("3");
		
		}else if (x > 0 && y < 0) {
			
			System.out.println("4");
			
		}else {
			
			System.out.println("origin");
		}
		
		sc.close();
	}

}
