import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "authorData", eager = true)
@SessionScoped
public class Author implements Serializable {
   private static final long serialVersionUID = 1L;
    String clientname;
	String id;
	String favColor1;
	 private String name;
 	 private String roll;
 	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}


	public String favoriteCar2;

	private UIComponent valbinding;
	private UIComponent valbinding1;
	public List<Car> car3List;
	/*public Car[] getFavoriteCar3Value()
	
	    {
	
	        car3List = new Car[3];
	        car3List[0] = new Car("BMW Series 4 - 316", "316");
	        car3List[1] = new Car("BMW Series 4 - 318", "318");
	        car3List[2] = new Car("BMW Series 4 - 320", "320");
	
	     
	
	        return car3List;
	
	    }
   */
	
	public List<Car> getCar3List() {
		return car3List;
	}

	public void setCar3List(List<Car> car) {
		this.car3List = car;
	}


	public List<Car> car4List;
	
	

	

	public List<Car> getCar4List() {
		
		car4List = new ArrayList<Car>();
	    car4List.add(new Car("BMW","116"));
	    car4List.add(new Car("AUDI","118"));
	    car4List.add(new Car("MERCEDES","120"));
	    return car4List;
	}

	

	public UIComponent getValbinding1() {
		return valbinding1;
	}






	public void setValbinding1(UIComponent valbinding1) {
		this.valbinding1 = valbinding1;
	}
	private String valdisplay="none";
	
	private String message;
	
	public String getFavoriteCar2() {
		return favoriteCar2;
	}






	public void setFavoriteCar2(String favoriteCar2) {
		this.favoriteCar2 = favoriteCar2;
	}
	private static Map<String, String> favoriteCar2Value;
	
	    static
	
	    {
	
	        favoriteCar2Value = new LinkedHashMap<String, String>();
	        favoriteCar2Value.put("BMW Series 1 - 116", "116"); //label, value
	        favoriteCar2Value.put("BMW Series 1 - 118", "118");
	        favoriteCar2Value.put("BMW Series 1 - 120", "120");
	
	    }
	
	   public Map<String, String> getFavoriteCar2Value()
	   {
	       return favoriteCar2Value;
	
	   }

	
	
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getValdisplay() {
		return valdisplay;
	}
	public void setValdisplay(String valdisplay) {
		this.valdisplay = valdisplay;
	}
	public UIComponent getValbinding() {
		return valbinding;
	}
	public void setValbinding(UIComponent valbinding) {
		this.valbinding = valbinding;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	
	
	public String getFavColor1() {
		return favColor1;
	}
	public void setFavColor1(String favColor1) {
		this.favColor1 = favColor1;
	}
	public void setchangeval(AjaxBehaviorEvent e){
		this.setValdisplay("none");
		if(this.getFavColor1().equalsIgnoreCase("red")){
		  this.setValdisplay("block");
		  this.setMessage("RED");
		}else if(this.getFavColor1().equalsIgnoreCase("Green")){
			this.setValdisplay("block");
			this.setMessage("GREEN");
		}
		
	}
	
	public void setDropDwnVal(AjaxBehaviorEvent e){
	
		if(this.getFavoriteCar2().equalsIgnoreCase("116")){
			LinkedList<Car> ob = new LinkedList<Car>();
			ob.add(new Car("Aife","0"));
			ob.add(new Car("Anirban","1"));
			this.setCar3List(ob);
		   
		}else {
			
			LinkedList<Car> ob1 = new LinkedList<Car>();
			ob1.add(new Car("Saife","0"));
			ob1.add(new Car("Abid","1"));
			this.setCar3List(ob1);
			
		}
		
	}
	public String submit() {
		
		
		
		FacesContext context1 = FacesContext.getCurrentInstance();
		context1.getExternalContext().getSessionMap().put("user", "hold");
		return "user?faces-redirect=true";
	}
	

	
}
