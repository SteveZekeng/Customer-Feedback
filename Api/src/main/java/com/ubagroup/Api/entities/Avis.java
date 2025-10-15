package com.ubagroup.Api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "avis")
public class Avis {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	private String nomClient;
	
	@Column(nullable = false)
    private int telephone;
	
	@Column(nullable = false)
	private String satisfactionClient;
	
	@Column(nullable = false)
	private String rapiditeAgent;
	
	@Enumerated(EnumType.ORDINAL)
	private AttitudeAgent attitudeAgent;
	
	@Column(nullable = false)
	private String probabiliteRecommandation;
	
	@Column(nullable = false)
	private String avisClient;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    private Service service;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agent_id")
    private Agent agent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	
}
