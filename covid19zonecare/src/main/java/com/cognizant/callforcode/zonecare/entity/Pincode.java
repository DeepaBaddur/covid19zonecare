package com.cognizant.callforcode.zonecare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pincode {
	
	@Id
	private int pincode_ward;
	private int pincode;
	private int ward;
	
	public Pincode()
	{
		
	}	
	
	public Pincode(int pincode_ward, int pincode, int ward) {
		super();
		this.pincode_ward = pincode_ward;
		this.pincode = pincode;
		this.ward = ward;
	}
		
	public int getPincode_ward() {
		return pincode_ward;
	}
	public void setPincode_ward(int pincode_ward) {
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
