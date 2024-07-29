package com.mapping.xml;

import javax.persistence.Entity;

@Entity
public class person 
{
	private int pid;
	private String  name; 
	private String address;
	private String phno;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public person(int pid, String name, String address, String phno) {
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
		this.phno = phno;
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
