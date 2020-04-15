package com.wardinfo.rest.webservices.restfulwebservices.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.wardinfo.rest.webservices.restfulwebservices.Entity.CovidCount;

public interface CovidDataRepository extends JpaRepository<CovidCount, Integer>{

}
