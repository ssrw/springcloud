/**
 * 
 */
package com.munshi.entity;

import java.io.Serializable;

/**
 * @author AIFE
 *
 */
public class ErrorResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errorcode;
	private String errorMessage;
	public ErrorResponse() {
		this.errorcode = errorcode;
		this.errorMessage = errorMessage;
	}
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
