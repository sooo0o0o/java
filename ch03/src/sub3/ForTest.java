package sub3;

/*
 * 날짜 : 2025/01/02
 * 이름 : 곽혜수
 * 내용 : Java 반복분 for 실습하기
 */

public class ForTest {

	public static void main(String[] args) {
		
		//for(초기식 ; 조건식 ; 증감식)
		for(int i = 0 ; i<10 ; i++) {
			
			System.out.println("i : " + i);
			
		}
		
		//1부터 10까지의 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			sum += k;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		//1부터 10까지의 짝수합
		
		int evensum = 0;
		
		for(int n=1 ; n<=10 ; n++) {
			
			if(n%2==0){
				
				evensum += n;
			}
			
		}
		
		System.out.println("1부터 10까지 짝수합: " +evensum);
		
		//for 중첩
		
		for(int a=1 ; a<=3 ; a++) {
			System.out.println("a : " +a);
			
			for(int b=1 ; b<=5 ; b++) {
				System.out.println("b : " +b);
				
				for(int c=1 ; c<=7 ; c++) {
					System.out.println("c : " +c);
				}
			}
		}
		
		
		//구구단
		
		System.out.println("2 x 1 = 2");
		
		for(int x=2; x<=9 ; x++) {
			
			for(int y=1; y<=9 ; y++) {
				
				int result = x * y;
				
				System.out.println(x+ " x "+ y + " = " +result);
			}
		}
		
		
		
		//별삼각형
		
		for(int start = 10; start>=1; start--) {
			
			
			for(int end = 1; end<=start; end++) {
				
				System.out.print("★");
			}
			
			System.out.print("\n"); //개행(줄바꿈)
		}
		
		
		
		
	}
}
