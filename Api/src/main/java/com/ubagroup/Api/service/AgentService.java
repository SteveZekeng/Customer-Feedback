package com.ubagroup.Api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubagroup.Api.dto.AgentDto;
import com.ubagroup.Api.entities.Agent;
import com.ubagroup.Api.entities.Branche;
import com.ubagroup.Api.repositories.AgentRepository;
import com.ubagroup.Api.repositories.BrancheRepository;





@Service
public class AgentService {
	

	private final AgentRepository agentRepository;
	private final BrancheRepository brancheRepository;
	
	 @Autowired
	    public AgentService(AgentRepository agentRepository, BrancheRepository brancheRepository) {
	        this.agentRepository = agentRepository;
	        this.brancheRepository = brancheRepository;
	    }
	 
	 public AgentDto saveAgent(AgentDto agentDto) {
		 Agent agent = new Agent();
		 
		 agent.setNom(agentDto.getNom());
		 agent.setPrenom(agentDto.getPrenom());
		 agent.setSexe(agentDto.getSexe());
		 agent.setStaffId(agentDto.getStaffId());
		 agent.setFonction(agentDto.getFonction());
		 
		 Branche branche = brancheRepository.findById(agentDto.getBranche_id()).orElseThrow(()-> new RuntimeException("id introuvable"));
			agent.setBranche(branche);
			
			agentRepository.save(agent);
		 
	        return agentDto;
	    }
	    
	 public List<Agent> getAllAgents() {
	        return agentRepository.findAll();
	    }
	 
	 public Optional<Agent> getAgentById(Long id) {
	        return agentRepository.findById(id);
	    }
	 
	 public Agent updateAgent(Long id, Agent updatedagent) {
	        Optional<Agent> existingagent = agentRepository.findById(id);
	        if (existingagent.isPresent()) {
	            Agent agent = existingagent.get();
	            agent.setNom(updatedagent.getNom());
	            agent.setPrenom(updatedagent.getPrenom());
	            agent.setStaffId(updatedagent.getStaffId());
	            agent.setFonction(updatedagent.getFonction());
	            agent.setBranche(updatedagent.getBranche());
	            return agentRepository.save(agent);
	        } else {
	            throw new RuntimeException("agent not found");
	        }
	    }
	 
	 public void deleteAgent(Long id) {
	        agentRepository.deleteById(id);
	    }
	 
	 public boolean checkingCodeQR(String staffId) {
		 
		 Optional<Agent> existInAgent = agentRepository.findByStaffId(staffId);
		 if (existInAgent.isPresent()) {
			 return true;
		 } else {
			 return false;
		 }
		 
	 }
	 

}
