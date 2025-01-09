package ch06.sec08.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 powerOn() 메소드 호출
		myCalc.powerOn();
		
		//plus 메소드 호출 시, 5와 6을 매개값으로 제공하고
		//덧셈 결과를 return 받아 result1 변수에 대입
		int result1 = myCalc.plus(5, 6);	//x, y 자리에 숫자를 대입해서 직접 제공
		System.out.println("result1 : " + result1);
		
		
		int x = 10;							
		int y = 4;							
		
		
		//division 메소드 호출 시, x와 y을 메개값으로 제공하고
		//나눗셈 결과를 return 받아 result2 변수에 대입
		double result2 = myCalc.divide(x, y);	//x, y 자리에 대입한 10, 4로 진행. 
		System.out.println("result2: "+result2);
		
		
		//리턴값이 없는 powerOff() 메소드 호출
		myCalc.powerOff();
		
		
	}
}
