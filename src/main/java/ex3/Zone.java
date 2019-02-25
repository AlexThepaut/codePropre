package ex3;

import java.util.List;

public abstract class Zone {

	private List<Animal> animals;
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public abstract double getPoids();
	
	public void afficherListeAnimaux(){
		for (Animal animal: animals){
			System.out.println(animal.getNom());
		}
	}
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * getPoids();
	}
}
