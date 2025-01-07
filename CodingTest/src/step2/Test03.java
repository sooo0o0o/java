package step2;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : 백준 2단계 3번 윤년
 */

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%4==0) {
			if(year%100!=0 || year%400==0 ) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
			System.out.println("0");
		}
		
		sc.close();
		
	}

}
