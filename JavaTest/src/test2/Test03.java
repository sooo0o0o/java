package test2;

/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : 자바 배열 역순으로 정렬 연습문제
 */

public class Test03 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		//현재 배열 출력
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + ", ");
			
		}
		
		System.out.print("\n");
		
		//배열의 원소를 역순으로 정렬			--> 배열 자리바꾸기
		for (int j = 0; j < 5; j ++) {
			int temp = arr[j];
			arr[j] = arr[9-j];		//arr[j]의 값을 arr[9-j] 자리로 옮긴다
			arr[9-j] = temp;		//arr[9-j]의 값을 arr[j] 자리로 옮긴다
		}
		
		//역순으로 정렬된 배열 출력
		for(int n : arr) {
			System.out.print(n + ", ");
			
					
		}
				
	}
	
}
