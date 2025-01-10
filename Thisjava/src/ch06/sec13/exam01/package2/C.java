package ch06.sec13.exam01.package2;		//package 가 다름

import ch06.sec13.exam01.package1.*;	//package1 import


public class C {
	//필드 선언
	
	/*
	 	  
 	A a;		//패키지가 다르므로, A 클래스에 접근 할 수 없음 */
	
	B b;		//public 접근제한 이므로 접근 가능
}
