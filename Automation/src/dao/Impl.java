package dao;

public class Impl {
	public Env fetchName(Long input){
		Env ob=new Env();
		ob.setName("aife");
		ob.setRoll("AC33");
		//input=(long) 1234;
		ob.setMarks(input);
		
		return ob;
	}

}
