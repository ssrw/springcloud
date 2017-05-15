import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> a =new TreeSet<String>();
		a.add("Ravi");
		a.add("Vijay");
		a.add("aife");
		a.add("Ravi");
		TreeMap<Integer,String> b= new TreeMap<Integer,String>();
		b.put(100, "amit");
		b.put(200, "rahul");
		b.put(100, "amit");
		b.put(300, "saikat");
		//System.out.println(a);
		Iterator<String> itr = a.iterator();
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		for(String str:a){
			System.out.println(str);
			
		}
		for (Map.Entry<Integer,String> entry : b.entrySet()) {
		    Integer c=entry.getKey();
		   String s= entry.getValue();
		    System.out.println(c+s);
		}
		

	}

}
