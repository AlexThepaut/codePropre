package ex1;

import java.util.Date;

public class entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date date_Creation;
	
	public static final int CAPITAL_MAX = 3000000;

	public entreprise(){
		
	}
	
	public entreprise(int siret, String nom, String adresse, Date date_Creation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.date_Creation = date_Creation;
	}
	
	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate_Creation() {
		return date_Creation;
	}

	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}
	
	public void Afficher_statut(){
		
	}
}
