import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Count {

	public static void main(String[] args) {

		String str= "aaife munshi";
		List a1=new ArrayList(){};
		for(int i=0;i<str.length();i++){
		   a1.add(str.charAt(i));	
		}
		System.out.println(a1);
		System.out.println(Collections.frequency(a1,'a'));
		
	}

}
