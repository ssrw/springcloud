
public class Emp {
	public String name;
	//public int age;
	public Emp(String name) {
		super();
		this.name = name;
		//this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
/*	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		int a=1000;
		return /*a*(int) Math.random()*/result;
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;*/
		Emp other=(Emp) obj;
		if(!name.equals(other.name)){
		  return false;
		}
		return true;
	}
	
	

}
