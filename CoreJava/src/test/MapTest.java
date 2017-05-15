package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String args[])
	{
		Map<String,String> map= new HashMap();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		/*//Iterating or looping map using Java5 foreach loop
		for(Object s : map.keySet())
		{
			System.out.println("key" + " "+  s +" "+"value"+" "+map.get(s));
		}*/
		
		//Iterating HashMap in Java using EntrySet and Java iterator
		
		Set<Map.Entry<String, String>> entryset=map.entrySet();
		Iterator<Entry<String,String>> itr= entryset.iterator();
		while(itr.hasNext())
		{
			Entry entry=itr.next();
			
			System.out.println("key" + " "+  entry.getKey() +" "+"value"+" "+entry.getValue());
			
		}
		}
		
		
		
	}
	
	
	


