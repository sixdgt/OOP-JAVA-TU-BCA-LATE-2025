package examples.multilevel;

public class MultilevelMain {
	public static void main(String args[]) {
		// Animal object
		Animal a = new Animal();
		a.showAnimalDetail();
		
		// Mammal object
		Mammal m = new Mammal();
		m.showMammalDetail();
		m.showAnimalDetail();
		
		// Human Object
		Human h = new Human();
		h.showAnimalDetail();
		h.showHumanDetail();
		h.showMammalDetail();
	}
}
