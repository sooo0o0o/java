package step1;
import java.util.Scanner;

/*
 * 날짜 : 2025.01.03
 * 이름 : 곽혜수
 * 내용 : 백준 1단계 10번 곱셈
 */

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int n3 = n1 * (n2%10);
		int n4 = n1 * ((n2%100)/10);
		int n5 = n1 * (n2/100);
		
		int n6 = n3+ (10*n4)+ (100*n5);
		
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		sc.close();
		
		
	}

}
