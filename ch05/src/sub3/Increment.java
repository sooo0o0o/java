package sub3;

public class Increment {
	
	private int num1;
	private static int num2;		//정적 변수, static
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
}
