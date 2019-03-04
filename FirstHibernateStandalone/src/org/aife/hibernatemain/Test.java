package org.aife.hibernatemain;

import java.util.ArrayList;
import java.util.List;

import org.aife.dto.Address;
import org.aife.dto.FourWheeler;
import org.aife.dto.TwoWheeler;
import org.aife.dto.UserDetails;
import org.aife.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
	/*	UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("hello");
		
		Vehicle objVehicle = new Vehicle();
		objVehicle.setVehicleName("Car");
		Vehicle obj1Vehicle = new Vehicle();
		obj1Vehicle.setVehicleName("BIKE");
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(objVehicle);
		list.add(obj1Vehicle);
		user.setVehicleList(list);
		
		objVehicle.getUserList().add(user);
		obj1Vehicle.getUserList().add(user);
		Address addr = new Address();
		
		addr.setStreetName("Ahalyabai road");
		addr.setVillageName("Mirapota");
		addr.setPinCode(713423);
		user.setAddr(addr);
		
		Address addr1 = new Address();
				
		addr1.setStreetName("Ahalyabai road");
		addr1.setVillageName("Mirapota");
		addr1.setPinCode(700456);
		user.setAddr(addr);
		user.getListOfAddresses().add(addr);
		//user.getListOfAddresses().add(addr1);
		
	
		
		
		
		UserDetails user1 = new UserDetails();
		user1.setUserName("World");
		
		Address addr11 = new Address();
		
		addr11.setStreetName("Ahalyabai road");
		addr11.setVillageName("Mirapota");
		addr11.setPinCode(713423);
		user1.getListOfAddresses().add(addr11);
		
		
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		session.save(objVehicle);
		session.save(obj1Vehicle);
		tx.commit();
		session.close();
		
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println(user.getUserName());*/
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		TwoWheeler twowheelerObj = new TwoWheeler();
		twowheelerObj.setVehicleName("Bike");
		twowheelerObj.setHandleType("Handle");
		FourWheeler fourwheelerObj = new FourWheeler();
		fourwheelerObj.setVehicleName("Audi");
		fourwheelerObj.setHandleType("Steering");
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(vehicle);
		session.save(twowheelerObj);
		session.save(fourwheelerObj);
		tx.commit();
		session.close();
		
		

	}

}
