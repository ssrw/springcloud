import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Empl> a=new ArrayList<Empl>();
		Empl emp1=new Empl("aife",216);
		Empl emp2=new Empl("saife", 24);
		Empl emp3=new Empl("saife1", 21);
		a.add(emp1);
		a.add(emp2);
		a.add(emp3);
		Collections.sort(a);
		for(Empl ob:a){
			System.out.println(ob.name);
		}

	}

}
