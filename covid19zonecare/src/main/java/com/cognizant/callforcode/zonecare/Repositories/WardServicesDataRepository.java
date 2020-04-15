package com.wardinfo.rest.webservices.restfulwebservices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wardinfo.rest.webservices.restfulwebservices.Entity.WardServices;

public interface WardServicesDataRepository extends JpaRepository<WardServices, Integer> {

}
