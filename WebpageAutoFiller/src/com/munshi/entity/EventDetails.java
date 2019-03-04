/**
 * 
 */
package com.munshi.entity;

import java.io.Serializable;

/**
 * @author AIFE
 *
 */
public class EventDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	private String id;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
