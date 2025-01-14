package step4;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 4단계 2번 x 보다 작은수
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int numArr[] = new int[n];
		
		int compare = sc.nextInt();
		
		for(int i = 0 ; i < n ; i ++) {
			
			numArr[i] = sc.nextInt();
			
		}
		
		int num = 0;
		
		for(int list : numArr) {
			
			if(list < compare) {
				num = list;
				System.out.print(num+ " ");
			}
		}
		
		
		sc.close();
		
	}

}
