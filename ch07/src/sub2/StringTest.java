package sub2;

/*
 * 날짜 : 2025.01.14
 * 이름 : 곽혜수
 * 내용 JAVA String 실습하기
 */

public class StringTest {
	public static void main(String[] args) {
		
		//문자열(문자+배열) 생성
		String str1 = "Hello";	//리터럴 방식
		String str2 = new String("Hello");
		
		System.out.println("str1 : " +str1);
		System.out.println("str2 : " +str2);
		
		
		//문자열 비교 : 문자열 비교에는 무조건 .equals() *****
		
		//참조타입의 " 주소값 " 비교 => str1,2의 저장된 주소값이 다르므로 "다르다" 출력
		if(str1 == str2) {	
			System.out.println("str1, str2 문자열이 같다");
		}else {
			System.out.println("str1, str2 문자열이 다르다");

		}
		
		//내부 문자열 자체를 비교하기 위해선 .equals() 사용
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열이 같다");

		}else {
			System.out.println("str1, str2 문자열이 다르다");

		}
		
		//문자열 길이
		String message = "Hello,Korea";	
		System.out.println("message 길이 : "+ message.length());	//공백,특수문자도 문자열 하나로 취급->11개
		
		
		//문자열 추출
		char c1= message.charAt(0);
		char c2= message.charAt(6);
		
		System.out.println("message 문자열 1번째 문자 : "+ c1);
		System.out.println("message 문자열 7번째 문자 : "+ c2);
		
		
		//문자열 자르기
		String sub1 = message.substring(0,5);		//1번째 ~ 5번째 까지 -> [0] ~ [4]
		String sub2 = message.substring(6);			//6번째 이후로
		
		System.out.println("message 문자열 0~4까지 문자열 : "+sub1);
		System.out.println("message 문자열 6~마지막까지 문자열 : "+sub2);
		
		
		//문자열 인덱스
		int idx1 = message.indexOf("e");			//앞에서 부터 알파벳 e 인덱스 탐색
		int idx2 = message.lastIndexOf("e");		//뒤에서(last) 부터 알파벳 e 인덱스 탐색
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
						
		//문자열 분리
		String[] words = message.split(",");
		
		for(String word : words) {
			System.out.println(word);
		}
		
		
		//문자열 교체
		String newStr1 = message.replace("Korea","Busan");
		String newStr2 = message.replace("Hello","Welcome");
		
		System.out.println("newStr1 : "+newStr1);
		System.out.println("newStr2 : "+newStr2);
		
		
		//문자열로 변환
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
		
	}
}
