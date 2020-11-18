package sn.gestionPharmacie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.gestionPharmacie.dao.IPharmacie;
import sn.gestionPharmacie.entities.Pharmacies;

@SpringBootApplication
public class SpringGestionPharmacieApplication implements CommandLineRunner {

	
	
	
	@Autowired
	private  IPharmacie pharmaciesdao;
	public static void main(String[] args) {
		SpringApplication.run(SpringGestionPharmacieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pharmacies p =new Pharmacies();
		p.setNom("GUIGON");
		p.setVille("DAKAR");
		p.setQuartier("SANDAGA");
		p.setEtat(1);
		
		
//		pharmaciesdao.save(p);
		
//		pharmaciesdao.findAll().forEach(c ->System.out.println(c.getNom()));
	}

}
