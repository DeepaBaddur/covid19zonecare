package com.wardinfo.rest.webservices.restfulwebservices.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WardServices {
	
	@Id
	private int pincode_ward;
	private String category;
	private String shopname;
	private String contactperson;
	private String contactno;
	private String isdelivery;
	
	public WardServices()
	{
		
	}
	
	public WardServices(int pincode_ward, String category, String shopname, String contactperson, String contactno,
			String isdelivery) {
		super();
		this.pincode_ward = pincode_ward;
		this.category = category;
		this.shopname = shopname;
		this.contactperson = contactperson;
		this.contactno = contactno;
		this.isdelivery = isdelivery;
	}



	public int getPincode_ward() {
		return pincode_ward;
	}

	public void setPincode_ward(int pincode_ward) {
		this.pincode_ward = pincode_ward;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getcontactperson() {
		return contactperson;
	}

	public void setcontactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getisdelivery() {
		return isdelivery;
	}

	public void setisdelivery(String isdelivery) {
		this.isdelivery = isdelivery;
	}
	
}
