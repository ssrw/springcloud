
public class Student {
	private String name;
    private String roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public void display(){
		System.out.println("Name: "+name+" Roll="+roll);
	}
	
	
}
