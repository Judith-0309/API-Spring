package sn.gestionPharmacie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.gestionPharmacie.entities.Pharmacies;



@Repository
public interface IPharmacie  extends JpaRepository<Pharmacies, Integer>{
	
	
	@Query("select p from Pharmacies p where p.ville = :ville")
	public List<Pharmacies>getAllPharmaciesByVille(@Param("ville")String ville);
	
	@Query("select p from Pharmacies p where p.quartier = :quartier")
	public List<Pharmacies>getAllPharmaciesByQuartier(@Param("quartier")String quartier);
	

	@Query("select p from Pharmacies p where p.id = :id")
	public  Pharmacies getById(@Param("id") int id);
	

}
