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

import com.ubagroup.Api.dto.BrancheDto;
import com.ubagroup.Api.entities.Branche;
import com.ubagroup.Api.service.BrancheService;


@RestController
@RequestMapping("/api/CustomerFeedback")
public class BrancheController {
	
	private final BrancheService brancheService;
	
	 @Autowired
	    public BrancheController(BrancheService brancheService) {
	        this.brancheService = brancheService;
	    }
	 
	 @PostMapping("/branche")
	    public ResponseEntity<BrancheDto> saveBranche(@RequestBody BrancheDto brancheDto) {
	       
		   brancheService.saveBranche(brancheDto);
	       
	       return ResponseEntity.ok(brancheDto);
	        
	    } 
	 
	 @GetMapping("/branches")
	    public List<Branche> getAllBranches() {
	        return brancheService.getAllBranches();
	    }
	 
	 @GetMapping("/branche/{id}")
	    public ResponseEntity<Branche> getBrancheById(@PathVariable Long id) {
	        Optional<Branche> branche = brancheService.getBrancheById(id);
	        return branche.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	 
	 @PutMapping("/branche/{id}")
	    public ResponseEntity<Branche> updateBranche(@PathVariable Long id, @RequestBody Branche branche) {
	        Branche updatedBranche = brancheService.updateBranche(id, branche);
	        return ResponseEntity.ok(updatedBranche);
	    }
	 
	 @DeleteMapping("/branches/{id}")
	    public ResponseEntity<String> deleteBranche(@PathVariable Long id) {
	        brancheService.deleteBranche(id);
	        return ResponseEntity.ok("Branche deleted successfully");
	    }      

}
