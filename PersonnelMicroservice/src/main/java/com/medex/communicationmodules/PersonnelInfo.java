package com.medex.communicationmodules;

import javax.persistence.*;

import com.medex.model.Personnel;

//The personnel class
//Type = 1
@Entity //A 'serializable' entity
@Table(name = "Personnel", schema ="PersonnelMicroserviceSchema") //Where this entity will be placed
//Now, the fields that we will annotate will be stored in the hosts table.
public class PersonnelInfo {
	@Id //Primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //"Do this identification for me, generate that specific ID for me
	@Column(name="id") //Which column?
	int id;
	@Column(name="name")
	String name;
	@Column(name="orderid")
	int orderid = -1;

	public PersonnelInfo() {}

	//Non default constructor
	
	public PersonnelInfo(Personnel p)
	{
		this.id = p.getId();
		this.name = p.getName();
		this.orderid = p.getOrderid();
	}
	
	public PersonnelInfo(int id, String name, int aorderid) {
		this.id = id;
		this.name = name;
		this.orderid = aorderid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	
}