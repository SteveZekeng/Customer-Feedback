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
import com.ubagroup.Api.entities.Filiale;
import com.ubagroup.Api.service.FilialeService;

@RestController
@RequestMapping("/api/CustomerFeedback")
public class FilialeController {
	
	private final FilialeService filialeService;
	
	@Autowired
    public FilialeController(FilialeService filialeService) {
        this.filialeService = filialeService;
    }
	
	@PostMapping("/filiale")
    public ResponseEntity<Filiale> saveFiliale(@RequestBody Filiale filiale) {
        Filiale newFiliale = filialeService.saveFiliale(filiale);
        return ResponseEntity.ok(newFiliale);
    } 
	
	 @GetMapping("/filiales")
	    public List<Filiale> getAllFiliales() {
	        return filialeService.getAllFiliales();
	    }
	
	@GetMapping("/filiale/{id}")
    public ResponseEntity<Filiale> getFilialeById(@PathVariable Long id) {
        Optional<Filiale> filiale = filialeService.getFilialeById(id);
        return filiale.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	@PutMapping("/filiale/{id}")
    public ResponseEntity<Filiale> updateBranche(@PathVariable Long id, @RequestBody Filiale filiale) {
        Filiale updatedFiliale = filialeService.updateFiliale(id, filiale);
        return ResponseEntity.ok(updatedFiliale);
    }
	
	@DeleteMapping("/filiales/{id}")
    public ResponseEntity<String> deleteFiliale(@PathVariable Long id) {
        filialeService.deleteFiliale(id);
        return ResponseEntity.ok("Filiale deleted successfully");
    }  
 

}
