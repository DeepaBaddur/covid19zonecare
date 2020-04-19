package com.cognizant.callforcode.zonecare.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.callforcode.zonecare.entity.WardServices;

public interface WardServicesDataRepository extends JpaRepository<WardServices, String>{

	@Query("SELECT w FROM WardServices w WHERE w.pincode_ward = :pincode_ward")
	List<WardServices> findWardServicesByPincode(@Param("pincode_ward") String pincode_ward);
	
}
