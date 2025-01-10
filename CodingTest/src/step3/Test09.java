package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 9번 별 찍기 (1)
 */

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int start = 1; start <= n ; start++) {
			
			for(int end = 1 ; end <= start ; end++) {
				
				System.out.print("*");
				
			}
			
			System.out.print("\n");
			
		}
		
		sc.close();
	}
}
