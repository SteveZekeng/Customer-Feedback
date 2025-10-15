package com.ubagroup.Api.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "branche")
public class Branche {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	 private String nomBranche;
	
	@Column(nullable = false)
	 private String codeBranche;
	
	@Column(nullable = false)
	 private String ville;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filiale_id")
    private Filiale filiale;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "branche")
    private List<Agent> agent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomBranche() {
		return nomBranche;
	}

	public void setNomBranche(String nomBranche) {
		this.nomBranche = nomBranche;
	}

	public String getCodeBranche() {
		return codeBranche;
	}

	public void setCodeBranche(String codeBranche) {
		this.codeBranche = codeBranche;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Filiale getFiliale() {
		return filiale;
	}

	public void setFiliale(Filiale filiale) {
		this.filiale = filiale;
	}

	public List<Agent> getAgent() {
		return agent;
	}

	public void setAgent(List<Agent> agent) {
		this.agent = agent;
	}
	
	
	
	
	
	

}
