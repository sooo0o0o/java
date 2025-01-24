package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


		
public class AppMain {
	
	//변수 생성
	private static Scanner scanner = new Scanner(System.in);
	
	private static List<Account> accounts = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		
		
		boolean isRunning = true;
		
		//5를 입력하면 프로그램이 끝남
		//if 문 활용
		/* while 문을 활용해 isRunning=true 인 동안 계속 실행되는 코드를 작성 후,
		 * if 문을 활용해 각 상황에서 실행될 실행문과, 코드가 종료되는 시점을 명시 */
		
		while(isRunning) {
			System.out.println("--------------------------------------------");
			System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료 ");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
		
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo==1) {
				createAccount();
			} else if(selectNo==2) {
				accountList();
			} else if(selectNo==3) {
				deposit();
			} else if(selectNo==4) {
				withdraw();
			} else {
				isRunning = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
		
				
		
		
		
	}
	
	static void createAccount() {
		
		System.out.println("계좌 번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.println("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = new Account(ano, owner, balance);
		accounts.add(account);
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	static void accountList() {
		
		for(Account account : accounts) {
			System.out.println(account);
		};
		
	}
	
	static void deposit() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
		
		System.out.println("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		account.deposit(money);
	
		
	}
	
	static void withdraw() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
		
		System.out.println("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		account.withdraw(money);
	}
	
	static Account findAccount(String ano) {
		for(Account account : accounts) {
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		
		return null;
	} 	
	
	
}
