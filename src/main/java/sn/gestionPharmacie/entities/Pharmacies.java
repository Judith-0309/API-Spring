package sn.gestionPharmacie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.ToString;
;
 


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pharmacies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String nom;
	private String ville;
	private String quartier;
	private int etat;
	
	public Pharmacies() {
		super();
	}

	public Pharmacies(int id, String nom, String ville, String quartier, int etat) {
		super();
		this.id = id;
		this.nom = nom;
		this.ville = ville;
		this.quartier = quartier;
		this.etat = etat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
	

	
	
}
