
public class B extends AbstractDemo {
	
    B(){
    	System.out.println("I am in B");
    }
    B(int a){
    	super(a);
    	System.out.println("I am in parameterised B");
    }
    void display()throws NullPointerException{
    	System.out.println("Display of B");
    }
	public static void main(String[] args) {
		B ob =new B(6);  
	}

}
