package bank;

public class Account {
	//멤버 변수 지정
	private String ano;
	private String owner;
	private int balance;
	
	//생성자 생성
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//Getter 와 Setter 메서드 사용해 계좌번호와 계좌주 이름, 잔액 등을 반환
	public String getAno() {return ano;}
	
	public String getOwner() {return owner;}
	
	public int getBalance() {return balance;}
	
	public void setBalance(int balance) {this.balance = balance;}
	
	
	//입출금 메서드 작성
	public void withdraw(int money) {
		if(money > 0 && balance >= money) {
			balance -= money;
			System.out.println("출금이 성공되었습니다.");
			
		}else {
			System.out.println("출금 잔액이 부족합니다.");
			
		}
		
	}
	//입출금 메서드 작성
	public void deposit(int money) {
		if(money > 0 ) {
			balance += money;
			System.out.println("예금이 성공되었습니다.");
			
		}else {
			System.out.println("유효하지 않은 금액입니다.");
			
		}
		
	}
	
	//계좌 정보를 읽기 쉽도록 문자열로 반환하기 위해서, toString() 메서드를 생성해 자료 반환 방식 지정
	@Override
	public String toString() {
		return ano + " " + owner + " " + balance;
	}

}
