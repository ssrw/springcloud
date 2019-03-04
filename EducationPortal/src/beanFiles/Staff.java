package beanFiles;

import java.io.Serializable;

public class Staff implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String contactno;
	private String email;
	private String regno;
	private String designation;
	private String address;
	private String guardianname;
	private String guardiancontactno;
	private String status;
	
	
	public Staff() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGuardianname() {
		return guardianname;
	}
	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}
	public String getGuardiancontactno() {
		return guardiancontactno;
	}
	public void setGuardiancontactno(String guardiancontactno) {
		this.guardiancontactno = guardiancontactno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
