package com.cognizant.callforcode.zonecare.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CovidCount {
	
	
	@Id
	private String pincode_ward;	
	private int active;
	private int recovered;	
	private int deceased;
	private int quarantine;
	
	public CovidCount()
	{
		
	}

	public CovidCount(String pincode_ward, int active, int recovered, int deceased, int quarantine) {
		super();
		this.pincode_ward = pincode_ward;
		this.active = active;
		this.recovered = recovered;
		this.deceased = deceased;
		this.quarantine = quarantine;
	}

	public String getPincode_ward() {
		return pincode_ward;
	}

	public void setPincode_ward(String pincode_ward) {
		this.pincode_ward = pincode_ward;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public int getDeceased() {
		return deceased;
	}

	public void setDeceased(int deceased) {
		this.deceased = deceased;
	}

	public int getQuarantine() {
		return quarantine;
	}

	public void setQuarantine(int quarantine) {
		this.quarantine = quarantine;
	}	
	
	
		

}
