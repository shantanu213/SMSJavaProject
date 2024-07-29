package com.pack.PracticeHiber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "emp_address")
public class address1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_Id")
	private int addressId;

	@Column(length = 100, name = "emp_street")
	private String street;
	
	@Column(length = 50, name = "emp_city")
	private String city;
	
	@Transient
	private double z;
	
	@Temporal(TemporalType.DATE)
	@Column(name="emp_date ")
	private Date addDate;

	public address1() {
		super();	
	}
	public address1(int addressId, String street, String city, double z, Date addDate) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.z = z;
		this.addDate = addDate;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

}
