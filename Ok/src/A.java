import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class A {
	
	public static void main(){

    char[] a = {'a','i','f','a'};
    char[] b = new char[]{'a'};
    int count=0;
    /*for(int i=0;i<a.length;i++){
    	 for (int j=i+1;j<a.length;j++){
    		 if(a[i]==a[j]){
    			 count++; 
    		 }
    	 }
    	 System.out.println(a[i]+"has"+count+"frequency");
    	 count=0;
     }*/
    
    List<char[]> arrlist = Arrays.asList(b);
    for(char[] ch: arrlist){
    	System.out.println(ch); 
    }
    Collections.frequency(arrlist, 'a');
    
    /*StringBuffer sb1=new StringBuffer("Amit");
    StringBuffer sb2=new StringBuffer("Amit");
    String sss1="Amit";
    System.out.println(sb1==sb2);
    System.out.println(sb1.equals(sb2));
    System.out.println(sb1.equals(sss1));
    System.out.println("Podder".substring(3));*/
 
   }
}
