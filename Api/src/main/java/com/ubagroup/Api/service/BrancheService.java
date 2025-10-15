package com.ubagroup.Api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubagroup.Api.dto.BrancheDto;
import com.ubagroup.Api.entities.Branche;
import com.ubagroup.Api.entities.Filiale;
import com.ubagroup.Api.repositories.BrancheRepository;
import com.ubagroup.Api.repositories.FilialeRepository;

@Service
public class BrancheService {
	
	private final BrancheRepository brancheRepository;
	private final FilialeRepository filialeRepository;
		

	
	@Autowired
    public BrancheService(BrancheRepository brancheRepository, FilialeRepository filialeRepository) {
        this.brancheRepository = brancheRepository;
        this.filialeRepository = filialeRepository;
    }
	
	public BrancheDto saveBranche(BrancheDto brancheDto) {
	
		Branche branche = new Branche();
		
		branche.setNomBranche(brancheDto.getNomBranche());
		branche.setCodeBranche(brancheDto.getCodeBranche());
		branche.setVille(brancheDto.getVille());
		
		Filiale filiale = filialeRepository.findById(brancheDto.getFiliale_id()).orElseThrow(()-> new RuntimeException("id introuvable"));
		branche.setFiliale(filiale);
		
		brancheRepository.save(branche);
		
        return brancheDto;
    }
	
	public List<Branche> getAllBranches() {
        return brancheRepository.findAll();
    }
	
	public Optional<Branche> getBrancheById(Long id) {
        return brancheRepository.findById(id);
    }
	
	public Branche updateBranche(Long id, Branche updatedbranche) {
        Optional<Branche> existingbranche = brancheRepository.findById(id);
        if (existingbranche.isPresent()) {
            Branche branche = existingbranche.get();
            branche.setNomBranche(updatedbranche.getNomBranche());
            branche.setCodeBranche(updatedbranche.getCodeBranche());
            branche.setVille(updatedbranche.getVille());
            branche.setFiliale(updatedbranche.getFiliale());
            
            return brancheRepository.save(branche);
        } else {
            throw new RuntimeException("branche not found");
        }
    }
	
	 public void deleteBranche(Long id) {
	        brancheRepository.deleteById(id);
	    }

}
