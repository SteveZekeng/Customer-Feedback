package com.ubagroup.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ubagroup.Api.entities.Branche;

@Repository
public interface BrancheRepository extends JpaRepository<Branche, Long>{

}
