package com.cognizant.callforcode.zonecare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pincode {
	
	
	private int Id;
	@Id
	private String pincode_ward;	
	private String pincode;
	private String ward;
	
	public Pincode()
	{
		
	}

	public Pincode(int id, String pincode_ward, String pincode, String ward) {
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

		
	
	
}
