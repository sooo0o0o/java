package sub4;

public class Engineer extends Person{
	
	private String field;
	
	public Engineer ( String name, int age, String field) {
		
		super(name, age);
		
		this.field = field;
		
	}
	

	public void work() {
		super.Introduce();
		System.out.println("저는 엔지니어이며 " + field + " 전공 입니다.");
	}
	
	
}
