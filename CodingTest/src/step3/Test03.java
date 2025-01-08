package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 3번 합
 */

public class Test03 {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		int sum=0;
		int i = 1;
		
		
		while(i <= n) {
			
			sum += i;
			i++;
			
			
		}
		
		System.out.println(sum);
		
		
		
		
		num.close();
	}

}
