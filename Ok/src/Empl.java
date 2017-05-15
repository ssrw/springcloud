
public class Empl implements Comparable {
	 String name;
	 int age;
	
	public Empl(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		Empl ob1=(Empl) ob;
		if(name.equalsIgnoreCase(ob1.name)){
			return 0;
		}else{
			return 1;
		}
	}
	
	
	

}
