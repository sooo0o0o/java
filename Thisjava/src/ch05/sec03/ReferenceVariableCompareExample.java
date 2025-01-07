package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;					//배열 변수 arr1,2,3 선언
		
		arr1 = new int[] {1,2,3}; 
		arr2 = new int[] {1,2,3};	// 배열 {1,2,3} 생성 후 arr1 과 arr2에 각각 대입
		arr3 = arr2;				// 배열 arr2의 값을 배열 arr3에 대입
		
		System.out.println(arr1 == arr2);	// 데이터 내용은 같지만, 실질적으로 다른 배열이기때문에 false
		System.out.println(arr2 == arr3);	// arr2의 내용을 arr3에 대입했기때문에 true
	}

}
