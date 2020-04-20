package Generic_a;

class Animal<T>{ //제네릭화 된 클래스 입니당 (원하는 타입 집어넣으세요) = 캐스팅 하지 않고 바로 쓸 수 이씀.
	// 일반화 형태의 기능을 제공하는구나를 딱 알아채야 함.
	T b; //타입매개변수를 만들어서 정의
	void setbreed(T b) {this.b=b;}
	T getBreed() {
		return b;
	}
}
class Dog {
	@Override
	public String toString() {
		return "Dog";
	}
}
class Cat{
}

public class Generic_a {
	
	public static void main(String[]args) {
		Animal<Dog> a = new Animal<Dog>();
		a.setbreed(new Dog());
		Dog d = a.getBreed(); //선언시킨 객체 여기서 타입 받아서 선언?
		// 일반화타입 T를 <Dog>라고 정의
//		Animal<Cat> c = new Animal<Cat>();
		System.out.println(d);
	}

}
