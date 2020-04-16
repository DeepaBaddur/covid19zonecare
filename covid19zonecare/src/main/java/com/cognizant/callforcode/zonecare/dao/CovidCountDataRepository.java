package com.cognizant.callforcode.zonecare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.callforcode.zonecare.entity.CovidCount;

public interface CovidCountDataRepository extends JpaRepository<CovidCount, Integer>{

}
