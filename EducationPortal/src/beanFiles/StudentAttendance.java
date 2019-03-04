package beanFiles;

import java.io.Serializable;
import java.util.Date;

public class StudentAttendance implements Serializable {
	
	private String dept;
	private String year;
	private String branch;
	private String name;
	private String regNo;
	private Date classDate;
	private String attendanceStat;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public Date getClassDate() {
		return classDate;
	}
	public void setClassDate(Date classDate) {
		this.classDate = classDate;
	}
	public String getAttendanceStat() {
		return attendanceStat;
	}
	public void setAttendanceStat(String attendanceStat) {
		this.attendanceStat = attendanceStat;
	}
	
	

}
