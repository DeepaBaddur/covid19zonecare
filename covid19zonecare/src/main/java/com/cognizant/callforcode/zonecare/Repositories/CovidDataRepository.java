package com.cognizant.callforcode.zonecare.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.callforcode.zonecare.entity.CovidCount;

public interface CovidDataRepository extends JpaRepository<CovidCount, Integer>{

}
