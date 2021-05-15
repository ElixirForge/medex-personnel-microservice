package com.medex.model;

import javax.persistence.*;

//The personnel class
//Type = 1
@Entity //A 'serializable' entity
@Table(name = "Personnel", schema ="PersonnelMicroserviceSchema") //Where this entity will be placed
//Now, the fields that we will annotate will be stored in the hosts table.
public class Personnel {
	@Id //Primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //"Do this identification for me, generate that specific ID for me
	@Column(name="id") //Which column?
	int id;
	@Column(name="name")
	String name;
	@Column(name="orderid")
	int orderid = -1;
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;

	public Personnel() {}

	//Non default constructor
	public Personnel(int id, String name, int aorderid, String username, String password) {
		this.id = id;
		this.name = name;
		this.orderid = aorderid;
		this.username = username;
		this.password = password;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
