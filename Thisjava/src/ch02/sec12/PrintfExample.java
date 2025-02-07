package ch02.sec12;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);	// 정수
		System.out.printf("상품의 가격: %6d원\n", value);	// 6자리정수, 왼쪽 빈자리 공백
		System.out.printf("상품의 가격: %-6d원\n", value);	// 6자리정수, 오른쪽 빈자리 공백
		System.out.printf("상품의 가격: %06d원\n", value);	// 6자리정수, 왼쪽 빈자리 0채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n",10,area);
		//printf("형식문자열", 값1, 값2,....)
		//%[값의순번][-.0][전체자릿수][소수자릿수]conversion *변환문자*
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",1,name, job);
		
	}
}
