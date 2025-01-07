package step2;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : 백준 2단계 5번 알람시계
 */

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int min = 0;
		int hr = 0;
		
		if(m<=45 && h<24 && h>0) {
			
			min = 60-(45 - m);
			hr = h - 1;
			
			System.out.println(hr + " " + min);
			
		} else if(m<=45 && h==0) {
			
			min = 60-(45 - m);
			hr = 23;
			
			System.out.println(hr + " " + min);
		
		} else if(m>45 && h<24 && h>0) {
			
			min = m - 45;
			hr = h ;
			
			System.out.println(hr + " " + min);
			
		} else if(m>45 && h==0) {
			
			min = m - 45;
			hr = 0;
			
			System.out.println(hr + " " + min);
			
		}
		
		sc.close();
	}
}
