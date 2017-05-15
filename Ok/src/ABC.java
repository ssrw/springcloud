import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class ABC {
	public static void main(String args[]){
		TreeMap<String, String> a1 = new TreeMap<String, String>();
		a1.put("100", "amit");
		a1.put("", null);
		a1.put(" ", null);
		a1.put(" govind", "raj");
		for (Map.Entry<String, String> m : a1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
	}

}
