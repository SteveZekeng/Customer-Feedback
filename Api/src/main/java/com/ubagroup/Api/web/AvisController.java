package com.ubagroup.Api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubagroup.Api.dto.AvisDto;
import com.ubagroup.Api.entities.Avis;
import com.ubagroup.Api.service.AvisService;



@RestController
@RequestMapping("/api/CustomerFeedback")
public class AvisController {
	
	private final AvisService avisService;
	
	 @Autowired
	    public AvisController(AvisService avisService) {
	        this.avisService = avisService;
	    }
	 
	 @PostMapping("/avis")
	    public ResponseEntity<AvisDto> saveAvis(@RequestBody AvisDto avisDto) {
	        avisService.saveAvis(avisDto);
	        return ResponseEntity.ok(avisDto);
	    } 
	 
	 //List des avis 
	 @GetMapping("/avis")
	    public List<Avis> getAllAvis() {
	        return avisService.getAllAvis();
	    }
	 
	 //Nbre d'agents ayant recus des avis satisfait
	 @GetMapping("/agentsSatisfait")
	 public long countAgentSatisfait() {
		 return avisService.countAgentTS();
	 }
	 
	//Nbre d'agents ayant recus des avis tres satisfait
	 @GetMapping("/agentsTresSatisfait")
	 public long countAgentTresSatisfait() {
		 return avisService.countAgentTS();
	 }
	 
	//Nbre d'agents ayant recus des avis pas satisfait
	 @GetMapping("/agentsPasSatisfait")
	 public long countAgentPasSatisfait() {
		 return avisService.countAgentPS();
	 }
	 
	//Nbre d'agents ayant recus des avis pas du tout satisfait
	 @GetMapping("/agentsPasDuToutSatisfait")
	 public long countAgentPasDuToutSatisfait() {
		 return avisService.countAgentPDTS();
	 }
	 
	//Nbre d'agents ayant recus des avis a satisfaction neutre
	 @GetMapping("/agentsSatisfactionNeutre")
	 public long countAgentSatisfactionNeutre() {
		 return avisService.countAgentNeutral();
	 }
	 
	 //List des agents ayant recus des avis satisfait
	 @GetMapping("/listAgentSatisfait")
	    public List<Avis> getAllAgentSatisfait() {
	        return avisService.getAgentSatisfait();
	    }
	 
	 //List des agents ayant recus des avis tres satisfait
	 @GetMapping("/listAgentTresSatisfait")
	    public List<Avis> getAllAgentTresSatisfait() {
	        return avisService.getAgentTS();
	    }
	 
	 //List des agents ayant recus des avis pas satisfait
	 @GetMapping("/listAgentPasSatisfait")
	    public List<Avis> getAllAgentPasSatisfait() {
	        return avisService.getAgentPS();
	    }
	 
	 //List des agents ayant recus des avis pas du tout satisfait
	 @GetMapping("/listAgentPasDuToutSatisfait")
	    public List<Avis> getAllAgentPasDuToutSatisfait() {
	        return avisService.getAgentPDTS();
	    }
	 
	 //List des agents ayant recus des avis a satisfaction neutre
	 @GetMapping("/listAgentSatisfactionNeutre")
	    public List<Avis> getAllAgentNeutral() {
	        return avisService.getAgentN();
	    }
	 
	 //Nbre d'agents rapide
	 @GetMapping("/agentsRapide")
	 public long countAgentRapide() {
		 return avisService.countRapide();
	 }
	 
	//Nbre d'agents tres rapide
	 @GetMapping("/agentsTresRapide")
	 public long countAgentTresRapide() {
		 return avisService.countTR();
	 }
	 
	//Nbre d'agents lent
	 @GetMapping("/agentsLent")
	 public long countAgentLent() {
		 return avisService.countLent();
	 }
	 
	//Nbre d'agents tres lent
	 @GetMapping("/agentsTresLent")
	 public long countAgentTresLent() {
		 return avisService.countTL();
	 }
	 
	 //List des agents rapide
	 @GetMapping("/listAgentRapide")
	    public List<Avis> getAllAgentRapide() {
	        return avisService.getAgentR();
	    }
	 
	 //List des agents tres rapide
	 @GetMapping("/listAgentTresrapide")
	    public List<Avis> getAllAgentTresRapide() {
	        return avisService.getAgentTR();
	    }
	 
	 //List des agents lent
	 @GetMapping("/listAgentLent")
	    public List<Avis> getAllAgentLent() {
	        return avisService.getAgentL();
	    }
	 
	 //List des agents tres lent
	 @GetMapping("/listAgentTresLent")
	    public List<Avis> getAllAgentTresLent() {
	        return avisService.getAgentTL();
	    }
	 
	 //Nbre d'agence/branche ayant recues des recommandations tres probable 
	 @GetMapping("/RecommandationTresProbable")
	 public long countRecommandationTresProbable() {
		 return avisService.countBrancheTP();
	 }
	 
	//Nbre d'agence/branche ayant recues des recommandations pas probable 
	 @GetMapping("/RecommandationPasProbable")
	 public long countRecommandationPasProbable() {
		 return avisService.countBranchePP();
	 }
	 
	//Nbre d'agence/branche ayant recues des recommandations a probabilite neutre
	 @GetMapping("/RecommandationProbabiliteNeutre")
	 public long countRecommandationProbabiliteNeutre() {
		 return avisService.countBranchePN();
	 }
	 
	//Liste des agences/branches ayant recues des recommandations tres probable 
	 @GetMapping("/listBrancheTresProbable")
	    public List<Avis> getAllBrancheTresProbable() {
	        return avisService.getBrancheTP();
	    }
	 
	//Liste des agences/branches ayant recues des recommandations pas probable 
	 @GetMapping("/listBranchePasProbable")
	    public List<Avis> getAllBranchePasProbable() {
	        return avisService.getBranchePP();
	    }
	 
	//Liste des agences/branches ayant recues des recommandations a probabilite neutre 
	 @GetMapping("/listBrancheProbabiliteNeutre")
	    public List<Avis> getAllBrancheProbabiliteNeutre() {
	        return avisService.getBranchePN();
	    }
	 
	 
	 //Nbre total de commentaires recus 
	 @GetMapping("/totalCommentaires")
	 public long countComments() {
		 return avisService.countComment();
	 }
	 
	 //Nbre d'agent attitude souriant
	 @GetMapping("/totalSouriant")
	 public long countAgentsouriant() {
		 return avisService.countSouriant();
	 }
	 
	//Nbre d'agent attitude pas souriant
	 @GetMapping("/totalNonSouriant")
	 public long countAgentNonSouriant() {
		 return avisService.countNS();
	 }
	 
	//Nbre d'agent attitude ecoute active et positive
	 @GetMapping("/totalEcouteActivePositive")
	 public long countEcouteActivePositive() {
		 return avisService.countEcouteAP();
	 }
	 
	//Nbre d'agent attitude non ecoute active et positive
	 @GetMapping("/totalNonEcouteActivePositive")
	 public long countNonEcouteActivePositive() {
		 return avisService.countNonEcouteAP();
	 }
	 
	//Nbre d'agent attitude resolution effective
	 @GetMapping("/totalResolutionEffective")
	 public long countResolutionEffective() {
		 return avisService.countRE();
	 }
	 
	//Nbre d'agent attitude non resolution effective
	 @GetMapping("/totalNonResolutionEffective")
	 public long countNonResolutionEffective() {
		 return avisService.countNRE();
	 }
	 
	//Nbre d'agent attitude aurevoir et merci
	 @GetMapping("/totalAurevoirEtMerci")
	 public long countAurevoirEtMerci() {
		 return avisService.countAM();
	 }
	 
	//Nbre d'agent attitude pas d'aurevoir et merci
	 @GetMapping("/totalNonAurevoirEtMerci")
	 public long countNonAurevoirEtMerci() {
		 return avisService.countNAM();
	 }
	 
	 //List agent souriant
	 @GetMapping("/listAgentSouriant")
	    public List<Avis> getAllAgentSouriant() {
	        return avisService.getAgentSouriant();
	    }
	 
	 //List agent pas souriant
	 @GetMapping("/listAgentNonSouriant")
	    public List<Avis> getAllAgentNonSouriant() {
	        return avisService.getAgentNS();
	    }
	 
	 //List agent ecoute active et positive
	 @GetMapping("/listAgentEcouteActivePositive")
	    public List<Avis> getAllAgentEcouteActivePositive() {
	        return avisService.getAgentEAP();
	    }
	 
	 //List agent non ecoute active et positive
	 @GetMapping("/listAgentNonEcouteActivePositive")
	    public List<Avis> getAllAgentNonEcouteActivePositive() {
	        return avisService.getAgentNEAP();
	    }
	 
	 //List agent resolution effective
	 @GetMapping("/listAgentResolutionEffective")
	    public List<Avis> getAllAgentResolutionEffective() {
	        return avisService.getAgentRE();
	    }
	 
	 //List agent non resolution effective
	 @GetMapping("/listAgentNonResolutionEffective")
	    public List<Avis> getAllAgentNonresolutionEffective() {
	        return avisService.getAgentNRE();
	    }
	 
	 //List agent aurevoir et merci
	 @GetMapping("/listAgentAurevoirEtMerci")
	    public List<Avis> getAllAgentAurevoirEtMerci() {
	        return avisService.getAgentAM();
	    }
	 
	 //List agent pas d'aurevoir et merci
	 @GetMapping("/listAgentNonAurevoirEtMerci")
	    public List<Avis> getAllAgentNonAurevoirEtMerci() {
	        return avisService.getAgentNAM();
	    }
	 
	
	

}
