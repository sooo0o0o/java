package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 5번 long 출력하기
 */
public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = b/4;
		
		if((b % 4)>0) {
			
			
			for(int i=0; i<=n ; i++) {
				
				System.out.print("long ");
				
			}
		}else {
			
			
			for(int i=1; i<=n; i++) {
				
				System.out.print("long ");
				
			}
			
		}
		
		System.out.println("int");
		
		
		sc.close();
	}
	
}
