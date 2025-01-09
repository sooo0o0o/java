package sub5;

public class Truck extends Car {
	
	private int capacity;
	
	public Truck(String name, String car, int speed, int capacity){
		super(name, car, speed);
		this.capacity = capacity;
		
		}
	
	@Override
	public void speedUp(int speed) {
		
		this.speed += (speed - capacity);
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		super.show();	//부모 클래스에서 show() 호출
		System.out.println("적재 용량 : " + this.capacity);
		
	}
}
