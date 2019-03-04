package org.aife.dto;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
public class FourWheeler extends Vehicle {
	
	private String fourWheelerName;
	private String handleType;
	public String getFourWheelerName() {
		return fourWheelerName;
	}
	public void setFourWheelerName(String fourWheelerName) {
		this.fourWheelerName = fourWheelerName;
	}
	public String getHandleType() {
		return handleType;
	}
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}
	
	

}
