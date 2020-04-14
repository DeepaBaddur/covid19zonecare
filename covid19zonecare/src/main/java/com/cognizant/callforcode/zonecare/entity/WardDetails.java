package com.cognizant.callforcode.zonecare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ward_details")
public class WardDetails {
	
	//define fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pincode_wardno")
	private String pincodeWardNo;
	
	@Column(name = "name")
	String name;
	  
	@Column(name = "age")
	String age;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "contact_no")
	String contactNo;

	public String getPincodeWardNo() {
		return pincodeWardNo;
	}

	public void setPincodeWardNo(String pincodeWardNo) {
		this.pincodeWardNo = pincodeWardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "WardDetails [pincodeWardNo=" + pincodeWardNo + ", name=" + name + ", age=" + age + ", address="
				+ address + ", contactNo=" + contactNo + "]";
	}
}
