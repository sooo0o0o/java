package step1;
import java.util.Scanner;

/*
 * 날짜 : 2025.01.02
 * 이름 : 곽혜수
 * 내용 : 백준 1단계 9번 나머지 구하기
 */

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		int r1 = (a+b)%c;
		int r2 = ((a%c)+(b%c))%c;
		int r3 = (a*b)%c;
		int r4 = ((a%c)*(b%c))%c;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		sc.close();
		
	}

}
