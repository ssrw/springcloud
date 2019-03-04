/**
 * 
 */
package com.entity;

/**
 * @author AIFE
 *
 */
public class RiceEntity {
      private String name;
      private String type;
      private RicecoverEntity rcover;
      
      //Default constructor for Deserialization
      public RiceEntity(){}

	/**
	 * @param name
	 * @param type
	 */
	public RiceEntity(String name, String type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * @param name
	 * @param type
	 * @param rcover
	 */
	public RiceEntity(String name, String type, RicecoverEntity rcover) {
		this.name = name;
		this.type = type;
		this.rcover = rcover;
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

	/**
	 * @return the rcover
	 */
	public RicecoverEntity getRcover() {
		return rcover;
	}

	/**
	 * @param rcover the rcover to set
	 */
	public void setRcover(RicecoverEntity rcover) {
		this.rcover = rcover;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RiceEntity [name=" + name + ", type=" + type + ", rcover=" + rcover + "]";
	}   
	
	
      
}
