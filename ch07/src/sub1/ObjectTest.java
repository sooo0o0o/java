package sub1;

/*
 * 날짜 : 2025.01.14
 * 이름 : 곽혜수
 * 내용 JAVA Object 실습하기
 */

public class ObjectTest {
	public static void main(String[] args) {
		
		//자바 최상위 클래스 Object 로 다형성
		
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		System.out.println(a1.toString());	//toString() 메소드 직접 호출
		System.out.println(a2);				//toString() 메소드 간접 호출
		
		
		//객체 비교
		if(a1 == a2) {										//stack 의 값(참조변수 주소값)을 비교
			System.out.println("객체 a1, a2 참조변수 주소값이 같다.");
		}else {
			System.out.println("객체 a1, a2 참조변수 주소값이 다르다.");
		}
		
		if(a1.equals(a2)) {									//인스턴스 : heap 메모리에 생성/저장되는 객체명
			System.out.println("객체 a1, a2 인스턴스가 서로 같다.");
						
		}else {
			System.out.println("객체 a1, a2 인스턴스가 서로 다르다.");
			
		}
		
		//객체 해시값
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		
		
	}
}
