package test;

import java.util.Objects;

public class Student {
	private String name;
	private Integer roll;
	public Student(String name,Integer roll)
	{
		this.name=name;
		this.roll=roll;
	}
	
	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student st = (Student) o;
        return name == st.name &&
                Objects.equals(roll, st.roll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String toString(){
        return "Name: "+name+"  ROLL: "+roll;
    }
	

}
