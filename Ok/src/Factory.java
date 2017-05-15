
public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessToShape ob=new AccessToShape();
	/*	ob.accesstoMethod("Circle");
		ob.accesstoMethod("null");*/
		PrimayShape shape=ob.accesstoMethod("circle");
		shape.draw();

	}

}
