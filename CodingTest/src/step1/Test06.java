package step1;

/*
 * 날짜 : 2025.01.02
 * 이름 : 곽혜수
 * 내용 : 백준 1단계 6번 사칙연산
 */

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int addtion = a+b;
		int subtraction = a-b;
		int multiplication = a*b;
		int devision = a/b;
		int remainder = a%b;
		
		System.out.println(addtion);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(devision);
		System.out.println(remainder);
		
		sc.close();
	
	}

}
