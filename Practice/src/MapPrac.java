import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(new Employee("Aife",200),"Aife1");
		map.put(new Employee("Saife",300),"Saife");
		map.put(new Employee("Aife",200),"Aife");
		/*for(Map.Entry<String,Integer> k :map.entrySet()){
			System.out.println(k.getKey()+"  "+k.getValue());
			System.out.println(k);
			
		}*/
		Iterator<Entry<Employee,String>> itr=map.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getValue());
		}
		

	}

}
