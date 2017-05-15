
public class AccessToShape {
	
	public PrimayShape accesstoMethod(String str){
		if(str.equalsIgnoreCase("Circle")){
		  return new Circle();
			
		}
		
		if(str.equalsIgnoreCase("Rectangle")){
		return	new Rectangle();
			
		}
		return null;
		
		
		
		
		
	}

}
