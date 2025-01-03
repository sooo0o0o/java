package sub4;

/*
 * 날짜 : 2025/01/03
 * 이름 : 곽혜수
 * 내용 : Java 반복분 while 실습하기
 */

public class WhileTest {
	
	public static void main(String[] args) {
		
		//1부터 10까지 합 : 조건 안에서 반복
		
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			
			sum += k;
			k++;
			
		}
		
		System.out.println("1부터 10까지의 합 : "+ sum);
		
		//do-while : 최초 한 번은 실행하고 반복여부 결정
		int n = 1;
		int tot = 0;
		
		do {
			
			if(n % 2==0) {
				
				tot += n;
			}
			
			n++;
			
		}while( n<=10 );
		
		System.out.println("1부터 10까지 짝수합 : "+tot);
		
		//break
		
		int num = 1;
		
		while(true) {	//무한루프
			
			if(num % 5==0 &&  num %7 ==0) {
				break;	//반복문 탈출
			}
			
			num++;
			
			
		}
		System.out.println("5와 7의 최소공배수 : "+num);
		
		//continue
		
		int total = 0;
		int j = 0;
		
		while(j<=10) {
			
			j++;
			
			if(j%2 ==1) {	//j 가 홀수이면 루프반복, 짝수이면 total 에 더해짐
				
				continue;	//반복문 상위 이동
			
			}
			
			total +=j;
		
		}
		
		System.out.println("1부터 10까지 짝수합 : " +total);
		
	}

}
