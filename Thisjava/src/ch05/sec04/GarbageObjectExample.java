package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;				//"여행" 에 해당하는 String 객체를 쓰레기로 만듦
									//hobby 를 참조하는 다른 변수나 아무 기능이 없으므로, 이는 쓰레기가 됨
		
		String kind1 = "자동차";
		String kind2 = kind1;		//kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null;				//"자동차"에 해당하는 String 객체는 쓰레기가 아님
									// --> kind2가 kind1 을 여전히 참조하는 중이기 때문
		
		System.out.println("kind2: "+kind2);
		
	}
}
