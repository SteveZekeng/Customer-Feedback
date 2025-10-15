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
@Table(name = "agent")
public class Agent {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 @Column(nullable = false)
	 private String nom;
	 
	 @Column(nullable = false)
	 private String prenom;
	 
	 @Column(nullable = false)
	 private String staffId;
	 
	 @Column(nullable = false)
	 private String fonction;
	 
	 @Column(nullable = false)
	 private String sexe;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "branche_id")
	 private Branche branche;

	 @JsonIgnore
	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "agent")
	 private List<Avis> avis;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getStaffId() {
		return staffId;
	}


	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public Branche getBranche() {
		return branche;
	}


	public void setBranche(Branche branche) {
		this.branche = branche;
	}


	public List<Avis> getAvis() {
		return avis;
	}


	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}
	 
	 

	

}
