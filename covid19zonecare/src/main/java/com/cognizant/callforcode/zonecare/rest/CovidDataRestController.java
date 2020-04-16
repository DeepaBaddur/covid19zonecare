package com.cognizant.callforcode.zonecare.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.callforcode.zonecare.dao.CovidCountDataRepository;
import com.cognizant.callforcode.zonecare.dao.PincodeDataRepository;
import com.cognizant.callforcode.zonecare.dao.WardDetailsDataRepository;
import com.cognizant.callforcode.zonecare.dao.WardServicesDataRepository;
import com.cognizant.callforcode.zonecare.entity.CovidCount;
import com.cognizant.callforcode.zonecare.entity.Pincode;
import com.cognizant.callforcode.zonecare.entity.WardDetails;
import com.cognizant.callforcode.zonecare.entity.WardServices;

@RestController
public class CovidDataRestController {
	
	@Autowired
	private CovidCountDataRepository covidDataService;
	
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
