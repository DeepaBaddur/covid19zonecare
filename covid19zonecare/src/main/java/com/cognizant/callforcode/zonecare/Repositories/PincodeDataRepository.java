package com.wardinfo.rest.webservices.restfulwebservices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wardinfo.rest.webservices.restfulwebservices.Entity.Pincode;

public interface PincodeDataRepository extends JpaRepository<Pincode, Integer> {

}
