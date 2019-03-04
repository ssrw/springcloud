package beanFiles;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name; 
	private String contactno;
	private String email;
	private String regno; 
	private String dept; 
	private String address; 
	private String guardianname;
	private String guardiancntctno;
	
	public Student() {
		super();
		this.name = name;
		this.contactno= contactno;
		this.email = email;
		this.regno = regno;
		this.dept = dept;
		this.address = address;
		this.guardianname = guardianname;
		this.guardiancntctno = guardiancntctno;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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

	public String getGuardiancntctno() {
		return guardiancntctno;
	}

	public void setGuardiancntctno(String guardiancntctno) {
		this.guardiancntctno = guardiancntctno;
	}
	
	
	
	
	
	

}
