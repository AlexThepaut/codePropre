package ex3;

public class ZoneCarnivore extends Zone{

	private double poids = 10;

	@Override
	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
}