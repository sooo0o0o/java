package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 10번 별찍기(2)
 */

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int start = 1; start <= n; start++) {
			
			for(int end1 = n ; end1 > start; end1--) {
				
				System.out.print(" ");
			}
			
			for(int end2=1 ; end2<=start ; end2++ ) {
				
				System.out.print("*");
			}
			
			
			System.out.print("\n");
			
		}
		
		sc.close();
	}
}
