package test2;

/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : 자바 피보나치 수열 재귀 메서드 연습문제
 */
/* n-1번째 수 + n번째 수 = n+1번째 수 */

public class Test10 {
	public static void main(String[] args) {
		
		for(int i = 0; i <10 ; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
	
	public static int fibo(int n) {
		
		if(n<=1) {
			return n;
		}
		
		return fibo(n-2) + fibo(n-1);
	}
}
