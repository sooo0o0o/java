package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 1번 구구단
 */

public class Test01 {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i;
		
		if(n>=1) {
			
			for( i=1 ; i<=9 ; i++ ) {
				
				int m = n * i;
				System.out.println(n + " * " + i + " = " + m);
			}
			
		
			
		}
		
	sc.close();
	
	}
	
	
	
}

