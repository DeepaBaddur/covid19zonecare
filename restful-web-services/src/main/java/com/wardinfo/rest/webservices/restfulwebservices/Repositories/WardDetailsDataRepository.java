package com.wardinfo.rest.webservices.restfulwebservices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wardinfo.rest.webservices.restfulwebservices.Entity.WardDetails;

public interface WardDetailsDataRepository extends JpaRepository<WardDetails, Integer> {

}
