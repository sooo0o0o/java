package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 12번 A+B (4)
 */

public class Test12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNextInt()) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			System.out.println(x+y);			
			
		}
		
		
		sc.close();
		
	}
	
	
}
