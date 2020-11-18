package sn.gestionPharmacie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import sn.gestionPharmacie.dao.IPharmacie;
import sn.gestionPharmacie.entities.Pharmacies;

@RestController
//@RequestMapping(value="/pharmacies")
public class PharmacieService {
	@Autowired
	private IPharmacie pharmaciesdao;
	
	@RequestMapping(value="/pharmacies", method = RequestMethod.GET)
	public List<Pharmacies>getAll(){
		return pharmaciesdao.findAll();
	}
	  
	@RequestMapping(value="/pharmaciesVille/{ville}", method = RequestMethod.GET)
	public List<Pharmacies>getAllPharmaciesByVille(@PathVariable String ville){
		return pharmaciesdao.getAllPharmaciesByVille(ville);
		
	}
	
	@RequestMapping(value="/pharmaciesQuartier/{quartier}", method = RequestMethod.GET)
	public List<Pharmacies>getAllPharmaciesByQuartier(@PathVariable String quartier){
		return pharmaciesdao.getAllPharmaciesByQuartier(quartier);
		
	}
	
	@RequestMapping(value="/pharmacies/save", method = RequestMethod.POST)
	public List<Pharmacies> save(Pharmacies p){
	 pharmaciesdao.save(p);
	return pharmaciesdao.findAll();
		
	}
	
	@RequestMapping(value="/pharmacies/delete/{id}", method = RequestMethod.DELETE)
	public List<Pharmacies> delete(@PathVariable int id){
		if (pharmaciesdao.getById(id) != null) {
		 pharmaciesdao.delete(pharmaciesdao.getById(id));
		
		}
		return pharmaciesdao.findAll();
		
		
	}
	
	@RequestMapping(value="/pharmacies/get/{id}", method = RequestMethod.GET)
	public Pharmacies get(@PathVariable int id){
		return pharmaciesdao.getById(id);
	}
	
	
	@RequestMapping(value="/pharmacies/update/{id}", method = RequestMethod.PUT)
	public List<Pharmacies> update(@PathVariable int id,Pharmacies p){
		p.setId(id);
		pharmaciesdao.save(p);
		return pharmaciesdao.findAll();
	}
	

	
}
