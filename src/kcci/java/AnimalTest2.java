package kcci.java;

class Animal{}
class Dog extends Animal{
}

public class AnimalTest2 {
	public static void main(String[]args) {
		Animal a = new Dog();
		if(a instanceof Dog) { //안전한 캐스팅을 위해 instanceof 으로 확인
			Dog d = (Dog) a; 
		}
	}
}
