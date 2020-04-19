package com.cognizant.callforcode.zonecare.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping(path="/api")
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
	
	@GetMapping("/covidcounts/{pinward}")
	public List<CovidCount> retrieveCovidCountByPinward(@PathVariable String pinward) {
		return covidDataService.findByCountPincode(pinward);
	}	
	
	@GetMapping("/pincodes")
	public List<Pincode> retrieveAllPincodes() {
		return pinDataService.findAll();
	}
	
	@GetMapping("/pincodes/{pinward}")
	public Optional<Pincode>retrievePincodeByPinward(@PathVariable String pinward) {
		return pinDataService.findById(pinward);		
	}
	
	@GetMapping(path = "/wards/{pincode}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Pincode> retrieveWardsByPincode(@PathVariable String pincode){
		return pinDataService.findByPincode(pincode);
	}
	
	@GetMapping("/warddetails")
	public List<WardDetails> retrieveAllWardDetails() {
		return wardDataService.findAll();
	}	
	
	@GetMapping("/warddetails/{pinward}")
	public Optional<WardDetails> retrieveWardDetailByPinward(@PathVariable String pinward) {
		return wardDataService.findById(pinward);
	}
	
	@GetMapping("/wardservices")
	public List<WardServices> retrieveAllWardServices() {
		return wardServicesService.findAll();
	}
	
	@GetMapping("/wardservices/{pinward}")
	public List<WardServices> retrieveWardServiceByPinward(@PathVariable String pinward) {
		return wardServicesService.findWardServicesByPincode(pinward);
	}
	
	

}
