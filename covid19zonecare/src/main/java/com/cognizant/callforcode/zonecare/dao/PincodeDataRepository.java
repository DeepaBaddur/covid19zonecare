package com.cognizant.callforcode.zonecare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.callforcode.zonecare.entity.Pincode;

public interface PincodeDataRepository extends JpaRepository<Pincode, String>{

	@Query("SELECT p FROM Pincode p WHERE p.pincode = :pincode")
	List<Pincode> findByPincode(@Param("pincode") String pincode);

}
