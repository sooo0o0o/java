package sub8;

public class Cable implements Socket {
	
	private Bulb bulb;		//bulb 선언 : 전구 연결
	public Cable(Bulb bulb) {
		this.bulb=bulb;
	}
	
	@Override
	public void switchON() {
		bulb.lightOn();
		
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
		
	}
	
	

}
