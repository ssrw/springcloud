package org.aife.dto;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
	private String twowheelerName;
	private String handleType;

	public String getTwowheelerName() {
		return twowheelerName;
	}

	public void setTwowheelerName(String twowheelerName) {
		this.twowheelerName = twowheelerName;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

}
