package com.cognizant.callforcode.zonecare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.callforcode.zonecare.entity.CovidCount;

public interface CovidCountDataRepository extends JpaRepository<CovidCount, String>{
	
	@Query("SELECT c FROM CovidCount c WHERE c.pincode_ward = :pincode_ward")
	List<CovidCount> findByCountPincode(@Param("pincode_ward") String pincode_ward);

}
