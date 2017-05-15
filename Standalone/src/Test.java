import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Test {
	public static void main(String args[]){
	/*char[] a = {'a','i','f','a','k','s','s','s'};
    char[] b = new char[]{'a'};
    int count=0;
    for(int i=0;i<a.length;i++){
    	 for (int j=0;j<a.length;j++){
    		 if(a[i]==a[j]){
    			 count++; 
    		 }
    	 }
    	 System.out.println(a[i]+" has "+count+" frequency");
    	 count=0;
     }
	
	 for(int k=1;k<=50;k++){
		 
		
	 }
	 HashMap<String,String>  hm= new HashMap<String,String>();
	 hm.put("aife", "101");
	 hm.put(null, "102");
	 hm.put("saife", "103");
	 hm.put(null, "hello");
	 hm.put(null,"hello1");
	 for(Map.Entry<String,String> k:hm.entrySet()){
		 System.out.println(k.getKey()+k.getValue());

	 }
	 int d = 0;
	 int m=0,n=1;
	 int c=m+n;
	 System.out.print(m+" "+n+" "+c+" ");
	 do{
		 d=c+n;
		 System.out.print(d+" ");
		 n=c;
		 c=d; 
	 }while((d<=40));*/
	 
	 /*Map<Character,Integer> map = new HashMap<Character,Integer>();
	 map.put('a',1);
	 map.put('b', 2);
	 map.put('c', 3);
	 map.put('d', 1);
	 map.put('e', 2);
	 map.put('f', 3);
	 map.put('g', 1);
	 map.put('h', 2);
	 map.put('i', 3);
	 map.put('j', 2);
	 
	 Scanner scan =new Scanner(System.in);
	 int count1=0;
	 System.out.println("Please enter a string=>");
	 String str=scan.next();
	 for(int i=0;i<str.length();i++){
		 if(map.containsKey(str.charAt(i))){
			 count1 = count1 + map.get(str.charAt(i));
		 }
	 }
	 System.out.println("Key has been presses"+count1+"times");*/
		
		
    Map<Integer,String>   map1 = new HashMap<Integer,String>();
    for(int i=1;i<=1000;i++){
    	map1.put(i, "Closed");
    }
    
    for(int i=1;i<=1000;i++){
    	for(int j=1;j<=1000;j++){
    		if((j%i) == 0){
    			if(map1.get(j).equalsIgnoreCase("Closed")){
    			    map1.put(j,"Opened");
    			}else if(map1.get(j).equalsIgnoreCase("Opened")){
    				map1.put(j,"Closed");
    			}
    		}
    		
    	}
    }
    for(Entry<Integer, String> hm: map1.entrySet()){
    	System.out.println(hm.getKey()+"------>"+hm.getValue());
    	
    }
    
   
	 
	 
	 
	}

	
	
	
}
