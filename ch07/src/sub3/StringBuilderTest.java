package sub3;

/*
 * 날짜 : 2025.01.14
 * 이름 : 곽혜수
 * 내용 JAVA String Builder 실습하기
 */

//append() : 문자열을 끝에 삽입
//insert() : 문자열을 지정 위치에 삽입
//delete() : 문자열 일부를 삭제
//replace() : 문자열 일부를 교체
//toString() : 문자열 리턴

public class StringBuilderTest {
	public static void main(String[] args) {
		
		
		//String 객체의 immutable(불변성) 특성
		String str = "Hello";
		System.out.println("str : "+str);
		System.out.println("str 주소값 : " +System.identityHashCode(str));
		
		str += "World";	//새로운 문자열 삽입
		System.out.println("str : "+str);
		System.out.println("str 주소값 : " +System.identityHashCode(str));
		

		System.out.println();
		System.out.println();
		
		
		
		//String 의 immutable 을 개선한 StringBuilder 로 문자열 가공 처리
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb : "+ sb);
		System.out.println("sb 주소값 : " +System.identityHashCode(sb));
		
		sb.append("World");	
		// 삽입과 달리 .append()를 이용하면 buffer 의 낭비가 X 
		//instance 자체에서 문자열에 대한 수정이 이루어짐 -> 재활용
		
		
		System.out.println("sb : " + sb);
		System.out.println("sb 주소값 : " +System.identityHashCode(sb));
		
		
		
		System.out.println();
		System.out.println("\\('-')/파\\('-')/이\\('-')/팅\\('-')/♥\\('-')/");
		System.out.println();

		
	}
}
