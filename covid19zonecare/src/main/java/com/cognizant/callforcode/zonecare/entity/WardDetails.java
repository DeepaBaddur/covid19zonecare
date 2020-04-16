package com.cognizant.callforcode.zonecare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WardDetails {
	
	@Id
	private String pincode_ward;
	private String name;
	private int age;
	private String address;
	private String contactno;
	
	public WardDetails()
	{
		
	}

	public WardDetails(String pincode_ward, String name, int age, String address, String contactno) {
		super();
		this.pincode_ward = pincode_ward;
		this.name = name;
		this.age = age;
		this.address = address;
		this.contactno = contactno;
	}

	public String getPincode_ward() {
		return pincode_ward;
	}

	public void setPincode_ward(String pincode_ward) {
		this.pincode_ward = pincode_ward;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	

}
