package org.koushik.javabrains.Passenger;

import java.util.ArrayList;
import java.util.List;

public class Handler {
	
	public Passage fetch(Long idd){
		
		
		Passage ob = new Passage();
		ob.setPassageid(1003);
		ob.setArticle("yes");
		Passage ob1 = new Passage();
		ob1.setPassageid(1004);
		ob1.setArticle("aife");
		List<Passage> list = new ArrayList<Passage>();
		list.add(ob);
		list.add(ob1);
		Passage newob=null;
		for(Passage p:list){
			if(p.getPassageid()==idd){
				 newob=p;
				break;
			}
		}
		return newob;
		
	}

}
