package com.ubagroup.Api.dto;



public class AgentDto {
	
	
	 private String nom;
	 
	 private String prenom;
	 
	 private String staffId;
	 
	 private String fonction;
	 
	 private String sexe;

	 private long branche_id;

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
	

	public long getBranche_id() {
		return branche_id;
	}

	public void setBranche_id(long branche_id) {
		this.branche_id = branche_id;
	}
	 
	 

}
