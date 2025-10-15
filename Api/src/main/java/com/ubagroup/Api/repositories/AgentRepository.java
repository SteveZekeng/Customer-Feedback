package com.ubagroup.Api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ubagroup.Api.entities.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long>{
	
	@Query(value ="SELECT * FROM Agent a WHERE a.staff_id = :staffId ",nativeQuery = true) 
	Optional<Agent> findByStaffId(@Param("staffId") String staffId);
	
	
	
	
}
