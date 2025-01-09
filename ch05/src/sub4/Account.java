
package sub4; //인스턴스화 시켜서 ClassTest.java 에서 호출하여 사용


//Account 클래스 정의(설계)

public class Account {
	
	
	//속성(필드)
	
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	//생성자
	
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//getter, setter
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//기능
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
		
	}
	
	public void show() {
		System.out.println("----------------------");
		System.out.println("은행명 : "+ this.bank);
		System.out.println("계좌번호 : "+ this.id);
		System.out.println("예금주 : "+ this.name);
		System.out.println("현재 잔액 : " + this.balance);
		System.out.println("----------------------");
		 
	}
}
