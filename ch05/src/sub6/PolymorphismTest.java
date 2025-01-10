package sub6;
/*
 * 날짜 : 2025.01.10
 * 이름 : 곽혜수
 * 내용 : JAVA 다형성(polymorphism) 
 * 
 * 다형성(polymorphism) **
 		- 상속 관계에서 부모 클래스의 기능(method)이 자식 클래스에서 다양한 기능(method)로 변하는 특징
 		- 객체(참조변수) 타입 선언을 '부모클래스 타입'으로 선언 **
 		- 다형성을 활용해 프로그래밍 중복성 감소, 통일성 및 유연성 향상
 */
public class PolymorphismTest {
	
	public static void main(String[] args) {
		/*
		 부모 타입(Animal)으로 선언 
		 개념적으론 Tiger tiger = new Tiger();과 의미는 같다!
		*/
		
		
		/*
		 부모 메소드가 존재하는 경우 이용해 정의하는게 좋다** : 통일성/일관성
		 
		 자식 클래스에 기능을 정의했기때문에, 부모 타입으로 선언된 객체가 사용되지 못한다
			-> 즉 , 부모클래스에 기능을 추가하고 그걸 자식 클래스에서 overriding 하는 방식으로 프로그램을 짠다
		*/ 
		
		
		//다형성을 적용한 객체 생성(업캐스팅, Up-Casting )
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
				
		a1.move();
		a1.hunt();		
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		System.out.println("-----------------------------------");
		
		//다운캐스팅, Down-Casting
		Tiger tiger = (Tiger) a1;	//형변환, Animal -> Tiger
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		System.out.println("-----------------------------------");
		
		
		//캐스팅(타입) 비교연산
		if(a1 instanceof Tiger) {
			
			System.out.println("a1은 Tiger 입니다.");
			
		}else if(a2 instanceof Eagle) {
			
			System.out.println("a2는 Eagle 입니다.");
			
		}else if(a3 instanceof Shark) {
			
			System.out.println("a3는 Shark 입니다.");
			
		}
		
		System.out.println("-----------------------------------");
		
		
		//다형성을 활용한 배열
		
		Animal arr[] = { tiger , eagle , shark };
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
		
	}

}
