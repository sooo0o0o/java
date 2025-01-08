package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 2번 A+B-3
 */

public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * t  -> sc.nextInt() : 입력 받아야하는 수
		 * sum -> x + y : 두 수의 합
		 * n(sum)=t 가 되면 식이 더이상 실행되지 x
		 * */
		
		int t = sc.nextInt();
		int x;
		int y;
		
		for(int n = 0; n < t ; n++) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			System.out.println(x+y);
		}
		
		sc.close();
		
	}

}
