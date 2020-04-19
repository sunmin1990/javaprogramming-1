package head_first_java;

class Dog{
	int size; //인스턴스 변수 선언 (size, Breed, name)
	String Breed;
	String name;
	
	void bark() { //인스턴스 메소
		System.out.println("Ruff! Ruff!");
	}
}

public class DogTestDrive {

	public static void main(String[] args) {
		Dog d = new Dog(); //Dog 객체 생
		d.size = 40;
		d.bark(); //점 연산자로 bark 메소드 호

	}

}
