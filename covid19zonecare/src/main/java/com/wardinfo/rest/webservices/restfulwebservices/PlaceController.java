package com.wardinfo.rest.webservices.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {
	
	@Autowired
	private PlaceDaoService service;
	
	
	
	
	@GetMapping("/places")
	public List<Place> retrieveAllPlaces() {
		return service.findAll();
	}
	
	
	@GetMapping("/places/{placeName}")
	public Place retrievePlace(@PathVariable String placeName) {
		Place place = service.findOne(placeName);
		
		return place;
	}


}
