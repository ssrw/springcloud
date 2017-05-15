package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentDupTest {

	public static void main(String[] args) {
		Map<Student,String> map= new HashMap<Student,String>();
		map.put(new Student("a",1), "a");
		map.put(new Student("b",2), "3");
		map.put(new Student("c",3), "c");
		printMap(map);
		System.out.println("adding duplicates");
		map.put(new Student("a",1), "a");
		map.put(new Student("c",3), "c");
		
		printMap(map);
	}
	public static void printMap(Map<Student, String> map){
		
		Set<Student> set= map.keySet();
		Iterator<Student> itr=set.iterator();
for(Student s:map.keySet())	
{
	System.out.println(s+ map.get(s) );
		
	}
	}
		
		
		
		
		

	}


