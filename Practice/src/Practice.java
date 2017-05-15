import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.Utilities;


public class Practice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*String a=new String("Alivea and allkkk");
		String b[]= a.split("");
		int count = 0;
		Set<String> set =new HashSet<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String str:b){
			
				if(!map.containsKey(str)){
					count++;
				  map.put(str, count);	
				}else{
				   map.put(str,map.get(str)+1);
				}
				count=0;
		 }
		for(Map.Entry<String, Integer> hm:map.entrySet()){
			System.out.println(hm.getKey()+":------>"+hm.getValue()+" times");
			
		}
		
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getKey()+":----->"+itr.next().getValue()+"times");
			
		}
		int p=5;
		switch(p){
		case 0:
			System.out.println("hi");
			break;
		default:
			System.out.println("Hello");
		
		
		}*/
		/*List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("aife munshi",101));
		list.add(new Employee("saife munshi",202));
		list.add(new Employee("abid munshi",602));
		
		
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee("aife munshi",101));
		list1.add(new Employee("saife munshi",202));
		list1.add(new Employee("abid munshi",602));
		list1.add(new Employee("ahmad",420));
		list1.add(new Employee("iqbal",920));
		list1.add(new Employee("vola",101));
		
		List<Employee> blanklist = new ArrayList<Employee>();
		for(Employee e:list1){
			if(!list.contains(e)){
				blanklist.add(e);
			}
		}
	
		
		for(Employee e:blanklist){
			System.out.println(e.getName()+"------->"+e.getId());
		}
		
		System.out.println("hi");
		String s="123";
		int a =Integer.parseInt(s);
		System.out.println(a);*/
		/*BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));*/
	/*	String str = "aiia";
		int halfLength = str.length()/2;
		int j = str.length()-1;
		int flag = 1;
		for(int i =0;i<halfLength;i++){
			if(!(str.charAt(i) == str.charAt(j))){
				flag = 0;
				break;
			}
			j=j-1;
		}
		if(flag==1){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}*/
		/*label1:
		for (int i=0;i<=4;i++){
			label2:
				for(int j=0;j<=4;j++){
					if(j==2){
						continue label2;
					}
					System.out.println("i="+i+"j="+j);
				}
			
		}*/
		
		/*Employee e1 = new Employee("aife",102);
		Employee e2 =null;
		try {
			 e2 = (Employee) e1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(e2.toString());*/
	



		   /* Character[] a = {'a','i','f','a'};
		    char[] b = new char[]{'a'};
		    int count=0;*/
		    /*for(int i=0;i<a.length;i++){
		    	 for (int j=i+1;j<a.length;j++){
		    		 if(a[i]==a[j]){
		    			 count++; 
		    		 }
		    	 }
		    	 System.out.println(a[i]+"has"+count+"frequency");
		    	 count=0;
		     }*/
		    
		    /*List<Character> arrlist = Arrays.asList(a);
		    for(Character ch: arrlist){
		    	System.out.println(ch+" has frequency of "+Collections.frequency(arrlist, ch)); 
		    }*/
		   // Collections.frequency(arrlist, 'a');
		    
		    /*StringBuffer sb1=new StringBuffer("Amit");
		    StringBuffer sb2=new StringBuffer("Amit");
		    String sss1="Amit";
		    System.out.println(sb1==sb2);
		    System.out.println(sb1.equals(sb2));
		    System.out.println(sb1.equals(sss1));
		    System.out.println("Podder".substring(3));*/
		    int a[] = new int[]{23,24,1,3,4,5,10,20,30,40,60,50};
		    int b[] = new int[]{29,2,2,3,23,5,100,9,50};
		    Integer c[] = new Integer[a.length];
		    for(int i=0;i<a.length;i++){
		    	c[i] = a[i];
		    }
		    Integer d[] = new Integer[b.length];
		    for(int i=0;i<b.length;i++){
		    	d[i] = b[i];
		    }
		    int out[] = new int[b.length];
		    List<Integer> list1 = new ArrayList<Integer>();
		    list1=Arrays.asList(c);
		    int index=0;
		    int count=0;
		    for(int j=0;j<d.length;j++){
		    	if(list1.indexOf(d[j])>=0){
		    		/*int k= list1.indexOf(d[j])+1;
		    		out[index++] = k;
		    		try{
			    		 list1.remove(d[j]);
			    	}
			    	catch(Exception e){}*/
		    		/*try{
		    		 list1.remove(list1.indexOf(d[j]));
		    		}
		    		catch(Exception e){}
		    		
		    		int k= list1.indexOf(d[j])+1;
		    		out[index++] = k;*/
		    		/*try{
		    		 list1.remove(list1.indexOf(d[j]));
		    		}
		    		catch(Exception e){}*/
		    		if(count==0){
		    			int k= list1.indexOf(d[j])+1;
			    		out[index++] = k;
			    		count++;
		    			
		    		}else{
		    			if(list1.indexOf(d[j]) == 0){
		    				out[index++] = 1;
		    				count++;
		    			}else{
		    			 int k= list1.indexOf(d[j])+1;
			    		 out[index++] = k-count;
			    		 count++;
		    			}
		    			
		    		}
		    		
		    	}else{
		    		int k= list1.indexOf(d[j]);
		    		out[index++] = k;
		    	}
		    }
		  for(int s=0;s<out.length;s++){
			  System.out.print(out[s]+",");
		  }
		    
		    
		    
		    

	}

}