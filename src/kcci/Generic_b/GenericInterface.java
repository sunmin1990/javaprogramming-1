package kcci.Generic_b;

interface IAnimal<T>{ // 아래 명시된 조건대로 구현하시오
	void set(T t);
	T get();
	void breath();
}
class Animal<T> implements IAnimal<T> { //구현 했사옵니다~
	T animal;
	@Override
	public void set(T t) {this.animal = t;}
	@Override
	public T get() {return null;}
	@Override
	public void breath() {System.out.println("Animal breath");}
}	

class Dog{}

public class GenericInterface {
	public static void main(String[]args) {
		Animal<Dog> a = new Animal<Dog>();
		a.set(new Dog()); //객체의 메소드 사용
		Dog al = a.get(); //값을 집어넣을때
	}
}
