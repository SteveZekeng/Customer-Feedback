package com.ubagroup.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ubagroup.Api.entities.Service;

@Repository 
public interface ServiceRepository extends JpaRepository<Service, Long>{

}
