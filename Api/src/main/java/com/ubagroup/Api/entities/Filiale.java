package com.ubagroup.Api.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "filiale")
public class Filiale {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	 private String nomFiliale;
	
	@Column(nullable = false)
	 private String codePays;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "filiale")
    private List<Branche> branche;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomFiliale() {
		return nomFiliale;
	}

	public void setNomFiliale(String nomFiliale) {
		this.nomFiliale = nomFiliale;
	}

	public String getCodePays() {
		return codePays;
	}

	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}

	public List<Branche> getBranche() {
		return branche;
	}

	public void setBranche(List<Branche> branche) {
		this.branche = branche;
	}
	
	
	
	

}
