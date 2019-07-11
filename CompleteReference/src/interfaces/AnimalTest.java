package interfaces;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new AnimalDog();
		AnimalCat cat = new AnimalCat();
		
		//Cat assignable to dog thru their superclass
		dog = cat;

	}

}
