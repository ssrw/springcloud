import java.util.Scanner;


public class Palindrome {
	
	
	public static void main(String arg[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=>");
		String str=sc.next();
		int tag=0;
		int j=str.length() -1;
		for(int i=0;i<str.length()/2;i++){
			String com= (String.valueOf(str.charAt(i)));
			String com1 = (String.valueOf(str.charAt(j)));
			if(!(com.equalsIgnoreCase(com1))){
				tag=1;
				break;
			}
			j--;
		}
		if(tag==0){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
		
		
	}

}
