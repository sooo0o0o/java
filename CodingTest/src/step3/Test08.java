package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 8번 A+B (8)
 */

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int t = sc.nextInt();
			sc.nextLine();			//개행 문자 처리
		
			for(int i = 1; i <= t; i++) {
			
				String line = sc.nextLine();
				String[] input = line.split(" "); //문자열 배열을 생성해 대입
			
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
			
				System.out.println("Case #"+i +": "+x + " + "+y+" = "+(x+y));
			}
		
				
			sc.close();
		}

}
