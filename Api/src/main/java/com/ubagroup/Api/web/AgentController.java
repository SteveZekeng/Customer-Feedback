package com.ubagroup.Api.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubagroup.Api.dto.AgentDto;
import com.ubagroup.Api.entities.Agent;
import com.ubagroup.Api.service.AgentService;



@RestController
@RequestMapping("/api/CustomerFeedback")
public class AgentController {
	
	private final AgentService agentService;
	
	 @Autowired
	    public AgentController(AgentService agentService) {
	        this.agentService = agentService;
	    }
	 
	 @PostMapping("/agent")
	    public ResponseEntity<AgentDto> saveAgent(@RequestBody AgentDto agentDto) {
	        agentService.saveAgent(agentDto);
	        return ResponseEntity.ok(agentDto);
	    } 
	 
	 @GetMapping("/agents")
	    public List<Agent> getAllAgent() {
	        return agentService.getAllAgents();
	    }
	 
	 @GetMapping("/agent/{id}")
	    public ResponseEntity<Agent> getAgentById(@PathVariable Long id) {
	        Optional<Agent> agent = agentService.getAgentById(id);
	        return agent.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	 
	 @PutMapping("/agents/{id}")
	    public ResponseEntity<Agent> updateAgent(@PathVariable Long id, @RequestBody Agent agent) {
	        Agent updatedAgent = agentService.updateAgent(id, agent);
	        return ResponseEntity.ok(updatedAgent);
	    }
	 
	 @DeleteMapping("/agents/{id}")
	    public ResponseEntity<String> deleteAgent(@PathVariable Long id) {
	        agentService.deleteAgent(id);
	        return ResponseEntity.ok("Agent deleted successfully");
	    }                              
	    
	 @GetMapping("/agents/{staffId}")
	 	public ResponseEntity<Boolean> checkingCodeQR(@PathVariable String staffId) {
		 boolean findstaffId = agentService.checkingCodeQR(staffId);
		 return ResponseEntity.ok(findstaffId);
	 }
	 
}
