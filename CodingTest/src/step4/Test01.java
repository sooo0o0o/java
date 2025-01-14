package step4;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 4단계 1번 개수세기
 */

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int num[] = new int[t];		// num[] 배열 생성
		
		
		for(int i=0; i < t; i++) {
			num[i] = sc.nextInt();	// num[i] = 입력받은 숫자, until i < t
					
		}
		
		int x = sc.nextInt();	// 찾을 숫자 x
		
		int sum = 0;
		for(int list : num) {
			
			if ( list == x ) sum++;	//list 와 x 를 비교해 갯수를 ++
		
		}
		
		System.out.println(sum);
		sc.close();
	}

}
