package com.wardinfo.rest.webservices.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wardinfo.rest.webservices.restfulwebservices.Entity.CovidCount;
import com.wardinfo.rest.webservices.restfulwebservices.Entity.Pincode;
import com.wardinfo.rest.webservices.restfulwebservices.Entity.WardDetails;
import com.wardinfo.rest.webservices.restfulwebservices.Entity.WardServices;
import com.wardinfo.rest.webservices.restfulwebservices.Repositories.CovidDataRepository;
import com.wardinfo.rest.webservices.restfulwebservices.Repositories.PincodeDataRepository;
import com.wardinfo.rest.webservices.restfulwebservices.Repositories.WardDetailsDataRepository;
import com.wardinfo.rest.webservices.restfulwebservices.Repositories.WardServicesDataRepository;

@RestController
public class ZoneCareController {
	
	@Autowired
	private CovidDataRepository covidDataService;
	
	@Autowired
	private PincodeDataRepository pinDataService;	
	
	@Autowired
	private WardDetailsDataRepository wardDataService;
	
	@Autowired
	private WardServicesDataRepository wardServicesService;
	
	
	@GetMapping("/covidcounts")
	public List<CovidCount> retrieveAllCovidCounts() {
		return covidDataService.findAll();
	}
	
	@GetMapping("/pincodes")
	public List<Pincode> retrieveAllPincodes() {
		return pinDataService.findAll();
	}
	
	@GetMapping("/warddetails")
	public List<WardDetails> retrieveAllWardDetails() {
		return wardDataService.findAll();
	}
	
	@GetMapping("/wardservices")
	public List<WardServices> retrieveAllWardServices() {
		return wardServicesService.findAll();
	}
	
	
	
	
}
