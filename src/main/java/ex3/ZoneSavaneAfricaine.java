package ex3;

public class ZoneSavaneAfricaine extends Zone{

	/** Masse moyenne en kg de nourriture consommée par 1 reptile */
	private static final double MASSE_NOURRITURE = 0.1;

	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}
}