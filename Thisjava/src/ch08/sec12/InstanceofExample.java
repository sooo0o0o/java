package ch08.sec12;


public class InstanceofExample {
	public static void main(String[] args) {
		//구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		
		//ride() 메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
		
		}
	
		//인터페이스 매개변수를 갖는 메소드
		public static void ride(Vehicle vehicle) {
			//방법 1
			if(vehicle instanceof Bus) {
				Bus bus = (Bus) vehicle;
				bus.checkFare();
			}
			
			//방법 2
			//if(vehicle instanceof Bus) {
			//	bus.checkFare();
			//}
			
		
		vehicle.run();
		
	}
}
