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
		
		
		
		
		/*
		 <출력3>
		 도서관 관리 시스템의 일부로 Book 클래스 정의하기
		 */
		
		Book book1 = new Book("삼국지", "나관중", "10001", 10);
		book1.show();
		
		boolean isOk = book1.borrowBook();
		
		if(isOk) {
			System.out.println("도서 대출 성공!");
		}else {
			System.out.println("도서 대출 실패!");
		}
		
		book1.show();
		
		Book book2 = new Book("이것이 자바다", "신용권", "10002", 0);
		book2.show();
		
		if(book2.borrowBook()) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book2.getTitle() + "도서 대출 실패!");
		}
		
		
		/*
		 <출력4>
		 영화 예약 시스템
		*/
		
		Movie movie1 = new Movie("글래디에이터","리들리스콧",8.0, 10);
		movie1.showDetails();
		
		boolean reserved = movie1.reserveSeat();
		
		if(reserved) {
			System.out.println("예약되었습니다.");
		}else {
			
		}
		
		movie1.showDetails();
		
		
		
	}

}
