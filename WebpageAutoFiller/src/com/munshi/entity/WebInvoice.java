/**
 * 
 */
package com.munshi.entity;

import java.io.Serializable;

/**
 * @author AIFE
 *
 */
public class WebInvoice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	private int id;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}      
}
