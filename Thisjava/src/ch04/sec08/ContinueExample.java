package ch04.sec08;

public class ContinueExample {
	
	public static void main(String[] args) throws Exception {
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;				//홀수인 경우 반복문 재실행 , 짝수인 경우 빠져나와서 출력
			}
			
			System.out.print(i + " ");	// 홀수는 실행되지 않는다
		}
	}
}
