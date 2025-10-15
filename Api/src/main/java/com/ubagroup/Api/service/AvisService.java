package com.ubagroup.Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ubagroup.Api.dto.AvisDto;
import com.ubagroup.Api.entities.Agent;
import com.ubagroup.Api.entities.Avis;
import com.ubagroup.Api.repositories.AgentRepository;
import com.ubagroup.Api.repositories.AvisRepository;
import com.ubagroup.Api.repositories.ServiceRepository;

@Service
public class AvisService {
	
	private final AvisRepository avisRepository;
	private final AgentRepository agentRepository;
	private final ServiceRepository serviceRepository;
	
	@Autowired
    public AvisService(AvisRepository avisRepository, AgentRepository agentRepository, ServiceRepository serviceRepository) {
        this.avisRepository = avisRepository;
        this.agentRepository = agentRepository;
        this.serviceRepository = serviceRepository;
    }
	
	public AvisDto saveAvis(AvisDto avisDto) {
		Avis avis = new Avis();
		
		avis.setNomClient(avisDto.getNomClient());
		avis.setTelephone(avisDto.getTelephone());
		avis.setSatisfactionClient(avisDto.getSatisfactionClient());
		avis.setRapiditeAgent(avisDto.getRapiditeAgent());
		avis.setAttitudeAgent(avisDto.getAttitudeAgent());
		avis.setProbabiliteRecommandation(avisDto.getProbabiliteRecommandation());
		avis.setAvisClient(avisDto.getAvisClient());
		
		com.ubagroup.Api.entities.Service service = serviceRepository.findById(avisDto.getService_id()).orElseThrow(()-> new RuntimeException("id introuvable"));
		avis.setService(service);
		
		Agent agent = agentRepository.findById(avisDto.getAgent_id()).orElseThrow(()-> new RuntimeException("id introuvable"));
		avis.setAgent(agent);
		
		avisRepository.save(avis);
		avisRepository.save(avis);
		
        return avisDto;
    }
	
	public List<Avis> getAllAvis() {
        return avisRepository.findAll();
    }
	
	 //service satisfaction du client
	 
	 public long countAgentTS() {
		 return avisRepository.totalTresSatisfait();
	 }
	 
	 public long countAgentS() {
		 return avisRepository.totalSatisfait();
	 }
	 
	 public long countAgentNeutral() {
		 return avisRepository.totalNeutre();
	 }
	 
	 public long countAgentPS() {
		 return avisRepository.totalPasSatisfait();
	 }
	 
	 public long countAgentPDTS() {
		 return avisRepository.totalPasDuToutSatisfait();
	 }
	 
	 // service efficacité de l'agent
	 
	 public long countLent() {
		 return avisRepository.totalLent();
	 }
	 
	 public long countTL() {
		 return avisRepository.totalTresLent();
	 }
	 
	 public long countRapide() {
		 return avisRepository.totalRapide();
	 }
	 
	 public long countTR() {
		 return avisRepository.totalTresRapide();
	 }
	
	 // service attitude de l'agent
	 
	 public long countSouriant() {
		 return avisRepository.totalSouriant();
	 }
	 
	 public long countNS() {
		 return avisRepository.totalNonSouriant();
	 }
	 
	 public long countEcouteAP() {
		 return avisRepository.totalEcouteActivePositive();
	 }
	 
	 public long countNonEcouteAP() {
		 return avisRepository.totalNonEcouteActivePositive();
	 }
	 
	 public long countRE() {
		 return avisRepository.totalResolutionEffective();
	 }
	 
	 public long countNRE() {
		 return avisRepository.totalNonResolutionEffective();
	 }
	 
	 public long countAM() {
		 return avisRepository.totalAurevoirEtMerci();
	 }
	 
	 public long countNAM() {
		 return avisRepository.totalNonAurevoirEtMerci();
	 }
	 
	// service probabilité de recommandation pour une branche
	 //List des branches aux differentes probabilite de recommandation
	 
	 public  List<Avis> getBrancheTP() {
		 return avisRepository.findBrancheTresProbable();
	 }
	 
	 public  List<Avis> getBranchePN() {
		 return avisRepository.findBrancheProbabiliteNeutre();
	 }
	 
	 public  List<Avis> getBranchePP() {
		 return avisRepository.findBranchePasProbable();
	 }
	 
	 //Nbre de branches aux differentes probabilite de recommandation
	 
	 public long countBranchePP() {
		 return avisRepository.totalBranchePasProbable();
	 }
	 
	 public long countBranchePN() {
		 return avisRepository.totalBrancheProbabiliteNeutre();
	 }
	 
	 public long countBrancheTP() {
		 return avisRepository.totalBrancheTresProbable();
	 }
	 
	 //Nbre de commentaires(avis)
	 
	 
	 public long countComment() {
		 return avisRepository.totalComment();
	 }
	 
	 //list agents satisfaction
	 
	 public  List<Avis> getAgentTS() {
		 return avisRepository.findAgentTresSatisfait();
	 }
	 
	 public List<Avis> getAgentSatisfait() {
		 return avisRepository.findAgentSatisfait();
	 }
	 
	 public List<Avis> getAgentPS() {
		 return avisRepository.findAgentPasSatisfait();
	 }
	 
	 public List<Avis> getAgentPDTS() {
		 return avisRepository.findAgentPasDuToutSatisfait();
	 }
	 
	 public List<Avis> getAgentN() {
		 return avisRepository.findAgentSatisfactionNeutre();
	 }
	 
	//list agents rapidite
	 
	 public List<Avis> getAgentL() {
		 return avisRepository.findAgentLent();
	 }
	 
	 public List<Avis> getAgentTL() {
		 return avisRepository.findAgentTresLent();
	 }
	 
	 public List<Avis> getAgentR() {
		 return avisRepository.findAgentRapide();
	 }
	 
	 public List<Avis> getAgentTR() {
		 return avisRepository.findAgentTresRapide();
	 }
	 
	 // List attitude agents
	 
	 public List<Avis> getAgentSouriant() {
		 return avisRepository.findAgentSouriant();
	 }
	 
	 public List<Avis> getAgentNS() {
		 return avisRepository.findAgentNonSouriant();
	 }
	 
	 public List<Avis> getAgentEAP() {
		 return avisRepository.findAgentEcouteActivePositive();
	 }
	 
	 public List<Avis> getAgentNEAP() {
		 return avisRepository.findAgentNonEcouteActivePositive();
	 }
	 
	 public List<Avis> getAgentRE() {
		 return avisRepository.findAgentResolutionEffective();
	 }
	 
	 public List<Avis> getAgentNRE() {
		 return avisRepository.findAgentNonResolutionEffective();
	 }
	 
	 public List<Avis> getAgentAM() {
		 return avisRepository.findAgentAurevoirEtMerci();
	 }
	 
	 public List<Avis> getAgentNAM() {
		 return avisRepository.findAgentNonAurevoirEtMerci();
	 }
	 
	 

 
	

}
