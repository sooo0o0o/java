package sub4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2025.01.16
 * 이름 : 곽혜수
 * 내용 : Java 직렬화 테스트
 */

public class SerializeTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		
		
		String target = "C:\\Users\\lotte6\\Desktop\\Apple";
		
		//java.io.NotSerializableException: sub4.Apple -> 직렬화를 지원하지않는 Apple 클래스
		
		try {
			//기본 스트림 생
			FileOutputStream fos = new FileOutputStream(target);
			
			//객체 직렬화를 위한 보조 스트림 생성 후 기본 스트림과 연결
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//객체 직렬화(객체를 파일로 쓰기)
			oos.writeObject(apple);
			
			//스트림 해제
			oos.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {			//FileOutputStream 예외처리
			
			e.printStackTrace();
			
		} catch (IOException e) {					//ObjectOutputStream 예외처리
			
			e.printStackTrace();
			
		}
		
				
		System.out.println("프로그램 종료...");
		
	}//main end
	
}
