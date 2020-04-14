package com.wardinfo.rest.webservices.restfulwebservices;

public class Place {
	
	private int pinCode;
	
	private String placeName;

	private int totalWards;
	
	private int totalCases;
	private int totalRecovered;
	private int totalDeaths;	
	public Place()
	{
		
	}
	
	

	public Place(int pinCode, String placeName, int totalWards, int totalCases, int totalRecovered, int totalDeaths) {
		super();
		this.pinCode = pinCode;
		this.placeName = placeName;
		this.totalWards = totalWards;
		this.totalCases = totalCases;
		this.totalRecovered = totalRecovered;
		this.totalDeaths = totalDeaths;
	}



	public int getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}

	public int getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(int totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public int getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}



	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getTotalWards() {
		return totalWards;
	}

	public void setTotalWards(int totalWards) {
		this.totalWards = totalWards;
	}
	
	

}
