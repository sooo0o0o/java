package sub2;

/*
 * 날짜 : 2025.01.07
 * 이름 : 곽혜수
 * 내용 : Java 클래스 캡슐화 실습하기
 */

public class EncapsuleTest {
	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		
		Car sonata = new Car("소나타","흰색",10);	//직접적으로 "생성자"를 통해 초기값을 전달
					
		// sonata.name = "소나타";		//외부 객체를 직접 참조
		// sonata.color = "흰색";
		// sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		/*
		 <출력>
		 차랑명 : 아반떼
		 차량색 : 검정
		 현재 속도 : 20
		*/
		
		Car avante = new Car("아반떼", "검정", 20);
		
		avante.speedUp(30);
		avante.speedDown(30);
		avante.show();
		
		avante.setColor("흰색"); // setter 를 이용해 속성 수정
		avante.show();
		
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력1>
		 은행명 : 국민은행
		 계좌번호 : 110-11-1011
		 입금주 : 김유신
		 현재 잔액 : 10000
		
		 <출력2>
		 은행명 : 우리은행
		 계좌번호 : 110-11-1211
		 입금주 : 김춘추
		 현재 잔액 : 15000
		*/
		
		Account kb = new Account("국민은행", "110-11-1011", "김유신", 0);
		Account woori = new Account("우리은행", "110-11-1211", "김춘추", 0);
		
		kb.deposit(20000);
		kb.withdraw(10000);
		kb.show();
		
		woori.deposit(30000);
		woori.withdraw(15000);
		woori.show();
		/* 김유신 -> 김유진*/
		
		kb.setName("김유진");
		kb.show();
		
		/* 우리은행 > 유리은행 */
		
		woori.setBank("유리은행");
		woori.show();
	}

}
