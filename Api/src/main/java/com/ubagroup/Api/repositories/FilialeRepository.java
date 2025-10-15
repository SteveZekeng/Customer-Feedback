package com.ubagroup.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ubagroup.Api.entities.Filiale;

@Repository
public interface FilialeRepository extends JpaRepository<Filiale, Long>{

}
