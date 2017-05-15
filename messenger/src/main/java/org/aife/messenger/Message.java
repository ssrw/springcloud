package org.aife.messenger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private Long id;
	private String name;
	private String insertStatus;
	private Statement stmt;
	
	public String getInsertStatus() {
		return insertStatus;
	}
	public void setInsertStatus(String insertStatus) {
		this.insertStatus = insertStatus;
	}
	
	public Message() {
		super();
		this.id = id;
		this.name = name;
		this.insertStatus = insertStatus;
		this.stmt = stmt;
	}
	
	
	public Message(Long id2, String name2) {
		// TODO Auto-generated constructor stub
	}
	public Message(long id2, String name2) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Statement getStmt() {
		return stmt;
	}
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	
	
	
	

}
