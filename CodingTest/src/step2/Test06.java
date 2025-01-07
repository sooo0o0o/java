package step2;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : 백준 2단계 6번 오븐시계
 */

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		if((m+t)>=60) {
			h++;
			m = (m+t)-60;
			
			while(m>=60) {
				h++;
				m = m-60;
			}
			
			if(h>23) {
				h = 0+(24-h);
			}
			
			System.out.println(h + " " + m);
			
		}else {
			m = m + t;
			System.out.println(h + " " + m);
			
		}
		
		sc.close();
	}
}
