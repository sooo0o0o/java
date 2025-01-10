package test2;

import java.util.Scanner;

/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : 자바 배열 이진탐색 연습문제
 */
/*
 * 이진탐색 : 검색 결과와 맞지않는 절반을 버리고 나머지 절반에서 연산수행하며 반복해서 탐색
 * 이진탐색 과정
 * 1) 배열의 중앙값 찾기
 * 2) 검색하려는 값보다 중앙값이 크면 오른쪽을 버리고, 중앙값이 작으면 왼쪽을 버린다
 * 3) 남아있는 반의 중앙값을 찾는다
 * 4) 반복
 */

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5,10,18,22,35,55,75,103,152};
		
		System.out.print("검색할 값 입력 : " );
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] > value) {
				end = mid;
			}else if(arr[mid] < value) {
				start = mid;
			}else {
				loc = mid;
				state = true;
				break;
			}
		}
		
		if(state) {
			System.out.printf("찾은 위치 : %d번째 있습니다.", loc+1);
			
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		
		sc.close();
		
	}
}
