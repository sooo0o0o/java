package sub2;

/*
 * 날짜 : 2025.01.06
 * 이름 : 곽혜수
 * 내용 : Java 메서드 실습하기
 */

public class MethodTest {
	
	//main 메서드 : 자바 프로그램의 시작 메서드(진입점)
	
	public static void main(String[] args) {
		
		//메서드 호출(실행)
		
		int y1 = fx(1);
		int y2 = fx(2);
		int y3 = fx(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
		//지역 변수와 메서드
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
		
	}
	
	
	//메서드 정의(1)
	
	
	public static int/*반환타입*/ fx(int x)/*메서드명*/ {		//접근권한, 반환타입, 메서드명(매개변수)
												//main 메서드에서 호출하기위해 main 과 같이 static 키워드 포함
		int y = 2 * x + 3;
		
		return y;										//반환값
	}
	
	
	
	//메서드 정의(2)
	
	public static int sum(int start, int end) {	// [t1] start : 1, end : 10
												// [t2] start : 1, end : 100
		int total = 0;
		
		for(int k = start; k <= end ; k++) {
			total +=k;
		}
		
		return total;							//지역변수 : 메서드 내에서 선언한 변수. 메서드 종료시 변수 해제
	}
	
	/* push---        	<stack>    	 	--->  pop 	* 지역변수 stack 안으로 들어온 순서 반대로 나와서 해제됨
	 * 		 |--->	  |     	| 	 ---|		  	* k = 10 , total = 55 , end = 10 ....
	 * 				  |			|					* k , total, end, start 가 메인 메소드로 들어가면서
	 * 				  |	k		|					  메모리에서 지워지고, 최종적으로 t1 = 55 출력
	 * 				  |	total	|
	 *  			  |	end		|					** stack : 쌓이다, 즉 데이터를 쌓아서 저장
	 *  			  |	start	|
	 *  			  |	t1		|
	 * */
	
	
}
