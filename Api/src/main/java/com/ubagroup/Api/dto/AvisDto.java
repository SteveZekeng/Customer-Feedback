package com.ubagroup.Api.dto;

import com.ubagroup.Api.entities.AttitudeAgent;

public class AvisDto {
	

	
	private String nomClient;
	
    private int telephone;
	
	private String satisfactionClient;
	
	private String rapiditeAgent;
	
	private AttitudeAgent attitudeAgent;
	
	private String probabiliteRecommandation;
	
	private String avisClient;
	
    private Long service_id;

    private Long agent_id;

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getSatisfactionClient() {
		return satisfactionClient;
	}

	public void setSatisfactionClient(String satisfactionClient) {
		this.satisfactionClient = satisfactionClient;
	}

	public String getRapiditeAgent() {
		return rapiditeAgent;
	}

	public void setRapiditeAgent(String rapiditeAgent) {
		this.rapiditeAgent = rapiditeAgent;
	}

	public AttitudeAgent getAttitudeAgent() {
		return attitudeAgent;
	}

	public void setAttitudeAgent(AttitudeAgent attitudeAgent) {
		this.attitudeAgent = attitudeAgent;
	}

	public String getProbabiliteRecommandation() {
		return probabiliteRecommandation;
	}

	public void setProbabiliteRecommandation(String probabiliteRecommandation) {
		this.probabiliteRecommandation = probabiliteRecommandation;
	}

	public String getAvisClient() {
		return avisClient;
	}

	public void setAvisClient(String avisClient) {
		this.avisClient = avisClient;
	}

	public Long getService_id() {
		return service_id;
	}

	public void setService_id(Long service_id) {
		this.service_id = service_id;
	}

	public Long getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(Long agent_id) {
		this.agent_id = agent_id;
	}

	


}
