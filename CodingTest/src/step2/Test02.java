package step2;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : 백준 2단계 2번 시험 성적
 */

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score<=100 && score>=90) {
			System.out.println("A");
		}else if(score<90 && score>=80) {
			System.out.println("B");
		}else if(score<80 && score>=70) {
			System.out.println("C");
		}else if(score<70 && score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
			
		}
		
		sc.close();
	}

}
