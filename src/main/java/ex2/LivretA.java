package ex2;

public class LivretA extends CompteBancaire {
	
	private double tauxRemuneration;

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}
	}
			
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
