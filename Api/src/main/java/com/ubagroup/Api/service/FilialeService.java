package com.ubagroup.Api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ubagroup.Api.entities.Filiale;
import com.ubagroup.Api.repositories.FilialeRepository;

@Service
public class FilialeService {
	
	private final FilialeRepository filialeRepository;
	
	@Autowired
    public FilialeService(FilialeRepository filialeRepository) {
        this.filialeRepository = filialeRepository;
    }
	
	public Filiale saveFiliale(Filiale filiale) {
        return filialeRepository.save(filiale);
    }
	
	public List<Filiale> getAllFiliales() {
        return filialeRepository.findAll();
    }
	
	public Optional<Filiale> getFilialeById(Long id) {
        return filialeRepository.findById(id);
    }
	
	public Filiale updateFiliale(Long id, Filiale updatedfiliale) {
        Optional<Filiale> existingfiliale = filialeRepository.findById(id);
        if (existingfiliale.isPresent()) {
            Filiale filiale = existingfiliale.get();
            filiale.setNomFiliale(updatedfiliale.getNomFiliale());
            filiale.setCodePays(updatedfiliale.getCodePays());
            
            return filialeRepository.save(filiale);
        } else {
            throw new RuntimeException("filiale not found");
        }
    }
	
	public void deleteFiliale(Long id) {
        filialeRepository.deleteById(id);
    }

}
