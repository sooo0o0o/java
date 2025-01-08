package ch05.sec09;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		//길이 3인 배열
		int[] oldIntArray = {1, 2, 3};
		
		//길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		
		//배열 항목 복사
		for(int i = 0; i<oldIntArray.length; i++) {		//배열 함수가 참조하는 초기값이 i = 0 이므로
			newIntArray[i] = oldIntArray[i];			//데이터가 채워지지 않은 Array[3],[4] 는 0 이다
		}
		
		//배열 항목 출력
		for(int i = 0 ; i <newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
			
			
		}
		
	}
}
