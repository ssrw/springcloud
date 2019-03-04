package org.aife.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="USER_ID")
	private int userId;
	@Column (name="USER_NAME")
	private String userName;
	/*@Embedded
	private Address addr;*/
	/*@ElementCollection
	@JoinTable (name="USER_ADDRESS",joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name ="ADDRESS_SEQ_ID") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddresses = new ArrayList();*/
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}*/
	/*public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}*/
	/*public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}*/
	/*@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	
	/*@OneToMany
	@JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"),
	      inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}*/
	
	@ManyToMany
	private Collection<Vehicle> vehicleList = new ArrayList<Vehicle>();
	public Collection<Vehicle> getVehicleList() {
		return vehicleList;
	}
	public void setVehicleList(Collection<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	
	
	
	
	
	
	

}
