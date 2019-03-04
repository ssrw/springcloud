package beanFiles;

import java.io.Serializable;

public class StaffDesignation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String designation_name;
	
	
	public StaffDesignation() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation_name() {
		return designation_name;
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	
	

}
