
public class TestConstructor {
	
	private int a;
	
	private Address address;
	
	

	public TestConstructor(Address address) {
		super();
		this.address = address;
	}
	
	

	public Address getAddress() {
		return address;
	}




	public TestConstructor(int a) {
		super();
		this.a = a;
	}
	
	public int getA(){
		return a;
	}
	
	

}
