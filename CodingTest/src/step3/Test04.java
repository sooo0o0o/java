package step3;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 4번 영수증
 */

public class Test04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int receiptPrice = sc.nextInt();
		int productNumber = sc.nextInt();
		int a, b;
		int result = 0;
		boolean compare;
		
		/*
		 * productNumber 의 값만큼 입력 가능
		 * (물건금액 * 갯수) 의 총 합이 receiptPrice 와 같으면 T 다르면 F
		*/
		
		for(int i = 0; i < productNumber ; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			int price = a * b;
			
			result+=price;
		
		}
		
		compare = receiptPrice == result;
		
		if(compare==true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		sc.close();
	}

}
