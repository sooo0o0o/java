package step2;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : 백준 2단계 1번 두 수 비교하기
 */

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
			
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
	sc.close();
		
	}
	
}
