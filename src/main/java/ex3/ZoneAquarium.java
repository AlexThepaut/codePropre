package ex3;

public class ZoneAquarium extends Zone{

	private double poids = 0.2;

	@Override
	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
}