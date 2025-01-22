package ch12.sec04;
/*
 * err : 에러내용만 출력
 * our : 문자 출력
 * */
public class ErrExample {
	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("1oo");
			
		}catch(NumberFormatException e) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
		}
	}
}
