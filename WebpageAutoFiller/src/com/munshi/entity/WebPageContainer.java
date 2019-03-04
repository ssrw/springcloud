package com.munshi.entity;

import java.io.Serializable;

public class WebPageContainer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String candName;
	private String candId;
	public WebPageContainer() {
		this.candName = candName;
		this.candId = candId;
	}
	public String getCandName() {
		return candName;
	}
	public void setCandName(String candName) {
		this.candName = candName;
	}
	public String getCandId() {
		return candId;
	}
	public void setCandId(String candId) {
		this.candId = candId;
	}
}
