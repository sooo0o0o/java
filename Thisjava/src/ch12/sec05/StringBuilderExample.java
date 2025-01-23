package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		String data = new StringBuilder()	//메소드 체이닝 패턴
				.append("DEF")		//문자열 끝에 D, E, F 추가
				.insert(0, "ABC")	//문자열 A, B, C를  지정 위치(0) 에 추가
				.delete(3, 4)		//ABCDEF 상태에서, 3번째 D 와 4번째 E 사이 -> 즉, D 만 삭제
				.toString();		//완성된 문자열 리턴 -> ABCEF
		
		System.out.println(data);
				
	}
}
