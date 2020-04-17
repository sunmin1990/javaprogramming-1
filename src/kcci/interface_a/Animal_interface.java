package kcci.interface_a;


interface Animal{
	void breath(); //코드는 구현해 주지 않고 선언만 해두겠다. (느슨한 형태의 구조~)
}

class Dog implements Animal{ //상속은 아니고 구현
		//규격화 - breath 구현하지 않으면 동작이 안됨.
		public void breath() {
			System.out.println("Dog breath");
		}
		public void bark() {
			System.out.println("bark bark");
		}
}
class Cat implements Animal{
	public void breath() { //implements Animal.breath
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("meow meow");
	}
}
public class Animal_interface {
	static void test(Animal a) {
		a.breath();
	}
	public static void main(String[]args) {
		// Animal a = new Animal(); 인터페이스와 추상클래스는 객체화 시킬 수 없다. 
		Dog d = new Dog();
		Animal a = d; 
		a.breath();
		Animal c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}
}
