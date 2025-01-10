package test2;

/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : 자바 최대공약수 재귀 메서드 연습문제
 */
/*
 * 유클리드 호제법
   -두 개의 자연수에 대한 최대공약수 구 하는 기법
   -a,b 에 대해서 a>b 일 때 a 를 b 로 나눈 나머지를 r 이라고 하면
    a 와 b 의 최대공약수는 b 와 r 의 최대공약수와 같다
*/

public class Test09 {
	public static void main(String[] args) {
		
		System.out.println("    1과    5의 최대공약수 : "+gcd(1,5));
		System.out.println("    3과    6의 최대공약수 : "+gcd(3,6));
		System.out.println("   12과   18의 최대공약수 : "+gcd(12,18));
		System.out.println("   60과   24의 최대공약수 : "+gcd(60,24));
		System.out.println("  192과  162의 최대공약수 : "+gcd(192, 162));
	}
	
	public static int gcd(int a , int b) {
		
		if(a%b == 0) {
			return b;
		}else {
			return gcd(b, a%b);
		
		}
	}
	
}
