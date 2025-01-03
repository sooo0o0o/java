package test1;

/*
 * 날짜 : 2025/01/03
 * 이름 : 곽혜수
 * 내용 : Java 반복문 연습문제
 */

public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0; i<n ; i++) {
			
			for(int j=n-1 ; j>i ; j--) {	//4,3,2,1
				System.out.print(" ");
			}
		
		
			for(int j = 0; j<=2*i ; j++) {	//1,3,5,7,9
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
