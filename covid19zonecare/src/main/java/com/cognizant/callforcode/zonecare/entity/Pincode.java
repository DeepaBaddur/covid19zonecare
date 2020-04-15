package com.cognizant.callforcode.zonecare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pincode {
	
	@Id
	private int Id;
	private String pincode_ward;
	private int pincode;
	private int ward;
	
	public Pincode()
	{
		
	}	
	
	public Pincode(int id, String pincode_ward, int pincode, int ward) {
		super();
		Id = id;
		this.pincode_ward = pincode_ward;
		this.pincode = pincode;
		this.ward = ward;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
		
	public String getPincode_ward() {
		return pincode_ward;
	}
	
	public void setPincode_ward(String pincode_ward) {
		this.pincode_ward = pincode_ward;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public int getWard() {
		return ward;
	}
	
	public void setWard(int ward) {
		this.ward = ward;
	}
}
