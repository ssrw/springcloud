
public class Stringrev {

	public static void main(String[] args) {
String str="boobqa";
StringBuilder strr=new StringBuilder("boobqa");
int n=str.length()/2;
int flag =0;
StringBuilder s2=strr.reverse();
/*for(int i=0;i<str.length();i++)
{
	System.out.print(str.charAt(i));
}
System.out.println(" "+"after reverse");
for(int j=str.length()-1;j>=0;j--)
{
	System.out.print(str.charAt(j));
	
}*/
int s=0;
int t=str.length()-1;
for(int k=0;k<n;k++)
{
	
	
	if(str.charAt(s)== str.charAt(t)){
		s=s+1;
		t=t-1;
		
	}else{
		flag=1;
	    break;
	}
	
}
if(flag==0){
	System.out.println(str+" is palindrome");
}else{
	System.out.println(str+" is not palindrome");
}

	}

}
