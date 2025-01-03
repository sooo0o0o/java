package step1;
import java.util.Scanner;

/*
 * 날짜 : 2025.01.03
 * 이름 : 곽혜수
 * 내용 : 백준 1단계 11번 세 수의 합
 */

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		long a, b, c;
		
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		
		long sum = a+b+c;
		
		System.out.println(sum);
		
		sc.nextLine();
		sc.close();
		
	}

}
