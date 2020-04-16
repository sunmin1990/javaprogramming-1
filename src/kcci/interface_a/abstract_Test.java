package kcci.interface_a;

/* 인스턴스 변수와 인스턴스 메소드를 갖지만, 이를 상속하는 하위 클래스에 의해서 구현되어야 할 메소드가 하나 이상 있는 경우*/
abstract class Animal22{
	public abstract void breath();
	public void eat() {System.out.println("Animal eat");}
	// eat()은 앞으로 구현해야 할 메소드 : 클래스의 메소드들이 다 선언 되어있냐 아니냐로 추상클래스 판단
}

class Dog22 extends Animal22{
	public void breath() { // 추상클래스는 단일상속
		System.out.println("Dog breath");
	}
}
public class abstract_Test {
	public static void main(String[]args) {
		Animal22 a = new Dog22();
		a.breath();
	}
}
