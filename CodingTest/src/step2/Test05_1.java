package step2;

import java.util.Scanner;

public class Test05_1 {
		
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
				
			if(y<45) {
				x--;
				y=60-(45-y);
			if(x < 0) {
				x=23;
				}
				System.out.print(x+" "+y);
			}
			else {
				y = y-45;
				System.out.print(x+" "+y);
			}
			
			sc.close();
		
			}
			

}
