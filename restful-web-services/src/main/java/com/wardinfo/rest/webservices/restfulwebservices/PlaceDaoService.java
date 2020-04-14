package com.wardinfo.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlaceDaoService {
	
	private static List<Place> places = new ArrayList<>();
	
	//private static int place = 3;

	static {
		places.add(new Place(123456, "Belgavi", 25,50,7,2));
		places.add(new Place(789456, "Bangalore", 126,81,15,6));
		places.add(new Place(741852, "Mangalore", 38,23,3,1));
	}
	
	public List<Place> findAll() {
		return places;
	}
	
	public Place findOne(String placeName) {
		for (Place place : places) {
			if (place.getPlaceName().equals(placeName)) {
				return place;
			}
		}
		return null;
	}

}
