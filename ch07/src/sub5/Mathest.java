package sub5;

/*
 * 날짜 : 2025.01.14
 * 이름 : 곽혜수
 * 내용 JAVA Math 클래스 실습하기
 */

public class Mathest {
	public static void main(String[] args) {
		
		//Math m = new Math();
		
		//기본 메서드
		System.out.println("절대값 : "+Math.abs(25));
		System.out.println("제곱값 : "+Math.sqrt(9));
		System.out.println("올림값 : "+Math.ceil(1.2));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.2));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("반올림 : "+Math.round(1.2));
		System.out.println("반올림 : "+Math.round(1.8));
		
		//random() method
		double num1 = Math.random();
		System.out.println("num1 : "+ num1);	//0 ~ 1 사이의 실수인 난수 생성
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+ num2);	//1 ~ 10 사이의 실수인 난수 생성
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+ num3);	//1 ~ 10 사이의 정수인 난수
		
		
		double rand1 = Math.ceil(Math.random()*10);
		System.out.println("rand1 : "+ rand1);
		
		
		double rand2 = Math.ceil(Math.random() * 45);		//1 ~ 45 사이의 정수인 난수
		System.out.println("rand2 : "+ rand2);
		
	}

}
