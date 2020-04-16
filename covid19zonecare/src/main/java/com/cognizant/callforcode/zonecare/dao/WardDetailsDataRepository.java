package com.cognizant.callforcode.zonecare.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.callforcode.zonecare.entity.WardDetails;

public interface WardDetailsDataRepository extends JpaRepository<WardDetails, String> {

}
