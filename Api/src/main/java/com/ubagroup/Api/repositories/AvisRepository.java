package com.ubagroup.Api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ubagroup.Api.entities.Avis;


@Repository
public interface AvisRepository extends JpaRepository<Avis, Long>{ 
	
	//requetes sur le nbre de satisfaction
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.satisfaction_client = 'tres-satisfait' ",nativeQuery = true)
	long totalTresSatisfait();
	
	@Query(value ="SELECT COUNT=(av.agent_id) FROM Avis av WHERE av.satisfaction_client = 'satisfait' ",nativeQuery = true)
	long totalSatisfait();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.satisfaction_client = 'pas-satisfait' ",nativeQuery = true)
	long totalPasSatisfait();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.satisfaction_client = 'Pas-du-tout-satisfait' ",nativeQuery = true)
	long totalPasDuToutSatisfait();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.satisfaction_client = 'neutre' ",nativeQuery = true)
	long totalNeutre();
	
	//requetes sur les listes des satisfactions
	
	@Query(value ="SELECT * FROM Avis av WHERE av.satisfaction_client = 'satisfait' ",nativeQuery = true)
	List<Avis> findAgentSatisfait();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.satisfaction_client = 'tres-satisfait' ",nativeQuery = true)
	List<Avis> findAgentTresSatisfait();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.satisfaction_client = 'pas-satisfait' ",nativeQuery = true)
	List<Avis> findAgentPasSatisfait();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.satisfaction_client = 'pas-du-satisfait' ",nativeQuery = true)
	List<Avis> findAgentPasDuToutSatisfait();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.satisfaction_client = 'neutre' ",nativeQuery = true)
	List<Avis> findAgentSatisfactionNeutre();

	
	//requetes sur le nbre d'agents lent/rapide
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.rapidite_agent = 'lent' ",nativeQuery = true)
	long totalLent();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.rapidite_agent = 'Tres-lent' ",nativeQuery = true)
	long totalTresLent();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.rapidite_agent = 'rapide' ",nativeQuery = true)
	long totalRapide();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.rapidite_agent = 'tres-rapide' ",nativeQuery = true)
	long totalTresRapide();
	
	// requetes sur les listes d'agents lent/rapide
	@Query(value ="SELECT * FROM Avis av WHERE  av.rapidite_agent = 'lent' ",nativeQuery = true)
	List<Avis> findAgentLent();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.rapidite_agent = 'Tres-lent' ",nativeQuery = true)
	List<Avis> findAgentTresLent();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.rapidite_agent = 'Tres-rapide' ",nativeQuery = true)
	List<Avis> findAgentTresRapide();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.rapidite_agent = 'rapide' ",nativeQuery = true)
	List<Avis> findAgentRapide();
		
	// ici, dans le where du av.attitude_agent ="chiffre"; Lorsque la reponse est positive le chiffre est 'paire' et inversement
	// Ex: si l'agent a ete souriant, le client mettre 0 et sinon 1
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE av.attitude_agent = '0' ",nativeQuery = true)
	long totalSouriant();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.attitude_agent = '1' ",nativeQuery = true)
	long totalNonSouriant();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.attitude_agent = '2' ",nativeQuery = true)
	long totalEcouteActivePositive();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.attitude_agent = '3' ",nativeQuery = true)
	long totalNonEcouteActivePositive();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.attitude_agent = '4' ",nativeQuery = true)
	long totalResolutionEffective();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.attitude_agent = '5' ",nativeQuery = true)
	long totalNonResolutionEffective();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.attitude_agent = '6' ",nativeQuery = true)
	long totalAurevoirEtMerci();
	
	@Query(value ="SELECT COUNT(av.agent_id) FROM Avis av WHERE  av.attitude_agent = '7' ",nativeQuery = true)
	long totalNonAurevoirEtMerci();
	
	//requete sur les listes d'attitudes 
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '0' ",nativeQuery = true)
	List<Avis> findAgentSouriant();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '1' ",nativeQuery = true)
	List<Avis> findAgentNonSouriant();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '2' ",nativeQuery = true)
	List<Avis> findAgentEcouteActivePositive();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '3' ",nativeQuery = true)
	List<Avis> findAgentNonEcouteActivePositive();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '4' ",nativeQuery = true)
	List<Avis> findAgentResolutionEffective();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '5' ",nativeQuery = true)
	List<Avis> findAgentNonResolutionEffective();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '6' ",nativeQuery = true)
	List<Avis> findAgentAurevoirEtMerci();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.attitude_agent = '7' ",nativeQuery = true)
	List<Avis> findAgentNonAurevoirEtMerci();
	
	
	 //requetes sur la liste de probabilite recues
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.probabilite_recommandation BETWEEN '0' AND '6'",nativeQuery = true)
	List<Avis> findBranchePasProbable();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.probabilite_recommandation BETWEEN '7' AND '8'",nativeQuery = true)
	List<Avis> findBrancheProbabiliteNeutre();
	
	@Query(value ="SELECT * FROM Avis av WHERE  av.probabilite_recommandation BETWEEN '9' AND '10'",nativeQuery = true)
	List<Avis> findBrancheTresProbable();
	
	//requetes sur le nbre de probabilite recues
	
	@Query(value ="SELECT COUNT(a.branche_id) FROM Avis av, Branche b, Agent a  WHERE av.agent_id = a.id AND b.id = a.branche_id AND av.probabilite_recommandation BETWEEN '0' AND '6'",nativeQuery = true)
	long totalBranchePasProbable();
	
	@Query(value ="SELECT COUNT(a.branche_id) FROM Avis av, Branche b, Agent a  WHERE av.agent_id = a.id AND b.id = a.branche_id AND av.probabilite_recommandation BETWEEN '7' AND '8'",nativeQuery = true)
	long totalBrancheProbabiliteNeutre();
	
	@Query(value ="SELECT COUNT(a.branche_id) FROM Avis av, Branche b, Agent a  WHERE av.agent_id = a.id AND b.id = a.branche_id AND av.probabilite_recommandation BETWEEN '9' AND '10'",nativeQuery = true)
	long totalBrancheTresProbable();
	
	
	//requetes sur le nbre de commentaires recus au total
	
	@Query(value ="SELECT COUNT(av.avis_client) FROM Avis av",nativeQuery = true)
	long totalComment();
	


}
