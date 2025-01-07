package step2;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : 백준 2단계 7번 주사위 세 개
 */

public class Test07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x==y && y==z) {
			
			int prize = 10000 + (y * 1000);
			System.out.println(prize);
			
		}else if(x==z){
			int prize = 1000 + (x * 100);
			System.out.println(prize);
			
		}else if(x==y || y==z) {
			
			int prize = 1000 + (y * 100);
			System.out.println(prize);
			
		}else{
			
			if(x>y && x>z) {
				int prize = 100 * x ;
				System.out.println(prize);
				
			}else if(x<y && y>z) {
				int prize = 100 * y ;
				System.out.println(prize);
				
			}else if(x<y && y<z) {
				int prize = 100 * z ;
				System.out.println(prize);
				
			}else if(x>y && x<z) {
				int prize = 100 * z ;
				System.out.println(prize);
				
			}
			
		}
		
		sc.close();
	}

}
