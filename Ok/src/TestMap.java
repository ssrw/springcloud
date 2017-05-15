import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class TestMap {
	
	public static void main(String args[]){
		Emp ob=new Emp("aife");
		Emp ob1=new Emp("aife");
		Set<Emp> set=new HashSet<Emp>();
		set.add(ob);
		set.add(ob1);
		for(Emp ob3:set){
			System.out.println(ob3.name+"--->");
		}
		Map<Emp,Integer> map=new HashMap<Emp,Integer>();
		map.put(ob,100);
		map.put(ob1,200);
		for(Map.Entry<Emp, Integer> hm:map.entrySet()){
			System.out.println(hm.getKey().name+"-->"+hm.getKey().name.hashCode()+"-->"+hm.getValue());
		}
		StringBuffer sb1=new StringBuffer("Amit");
		StringBuffer sb2=new StringBuffer("Amit");
		String sss1="Amit";
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sss1));
		System.out.println("Podder".substring(3));
		
	}
	


}

