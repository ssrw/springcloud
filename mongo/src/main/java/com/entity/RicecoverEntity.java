/**
 * 
 */
package com.entity;

/**
 * @author AIFE
 *
 */
public class RicecoverEntity {
     private String name;
     private String type;
     //Default constructor
     public RicecoverEntity(){}
     
     
	/**
	 * @param name
	 * @param type
	 */
	public RicecoverEntity(String name, String type) {
		this.name = name;
		this.type = type;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
     
     
     
}
