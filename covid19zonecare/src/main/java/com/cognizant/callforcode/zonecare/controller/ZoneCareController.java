package com.cognizant.callforcode.zonecare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.callforcode.zonecare.Repositories.CovidDataRepository;
import com.cognizant.callforcode.zonecare.Repositories.PincodeDataRepository;
import com.cognizant.callforcode.zonecare.Repositories.WardDetailsDataRepository;
import com.cognizant.callforcode.zonecare.Repositories.WardServicesDataRepository;
import com.cognizant.callforcode.zonecare.entity.CovidCount;
import com.cognizant.callforcode.zonecare.entity.Pincode;
import com.cognizant.callforcode.zonecare.entity.WardDetails;
import com.cognizant.callforcode.zonecare.entity.WardServices;

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
