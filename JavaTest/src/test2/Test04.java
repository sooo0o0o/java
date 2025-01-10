package test2;

/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : 자바 배열 선택 정렬 연습문제
 */
/*
 * 선택정렬 정렬단계
 * 1) 배열의 첫번째 원소를 2, 3, 4, 5번째 원소와 차례로 비교
 * 2) 첫 번쨰 원소보다 작은 원소를 찾으면 자리 바꾸기
 * 3) 두번쨰 원소를 3,4,5번쨰 원소와 비교
 * 4) 반복
 */

public class Test04 {
	public static void main(String[] args) {
		
		int arr[] = {4,2,1,5,3};
		
		for (int i = 0; i < 4; i ++) {
			
			for( int j = i +1 ; j < 5; j ++) {
				
				if(arr[i] > arr[j]) {		//크기를 비교하며, 자리 바꾸기
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		//정렬된 배열 출력하기
		for(int n : arr) {
			System.out.print(n + " ");
			
		}
	}

}
