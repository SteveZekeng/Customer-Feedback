package com.ubagroup.Api.dto;



public class BrancheDto {
	
	
	 private String nomBranche;
	
	 private String codeBranche;
	
	 private String ville;

     private Long filiale_id;


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

	public long getFiliale_id() {
		return filiale_id;
	}

	public void setFiliale_id(long filiale_id) {
		this.filiale_id = filiale_id;
	}
     
     

}
