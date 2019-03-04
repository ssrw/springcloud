package com.munshi.Entity;

import java.io.Serializable;

public class WebPageContentEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String candidateName;
	
	

	public WebPageContentEntity(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	

}
