package head_first_java.town_of_Object;

class Dog{
	int size; //?¸?Š¤?„´?Š¤ ë³??ˆ˜ ?„ ?–¸ (size, Breed, name)
	String Breed;
	String name;
	
	void bark() { //?¸?Š¤?„´?Š¤ ë©”ì†Œ
		System.out.println("Ruff! Ruff!");
	}
}

public class DogTestDrive {

	public static void main(String[] args) {
		Dog d = new Dog(); //Dog ê°ì²´ ?ƒ
		d.size = 40;
		d.bark(); //?  ?—°?‚°?ë¡? bark ë©”ì†Œ?“œ ?˜¸

	}

}
