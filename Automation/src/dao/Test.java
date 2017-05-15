package dao;

public class Test {
	public static void main(String args[]){
	Impl ob1=new Impl();
	Env ob2=ob1.fetchName(1234L);
	System.out.println(ob1.fetchName(1234L).getName());
	System.out.println(ob1.fetchName(1234L).getRoll());
	System.out.println(ob2.getName());
   }

}
