package Generic_a;

class Apple{ //class Apple extends Object {}
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an Orange";
	}
}

class Box1<T>{  //T == class Object
	private T ob; // 변수를 일단 오브젝트로 받았엉. 무슨타입이든 다받으려고
	public void set(T o) { // 아 이거구만 설정! (aBox.set)
	// 오브젝트클래스니까 애플이랑 오렌지를 여따가 다 받았엉.
		ob = o;
	}
	public T get() { //get은 반환메소드인가 두개 다 get 해주려고 T!
	// public Object getBox(){return this.a = a;}
		return ob;
	}
}
public class FruitAndBoxFault_Generic {

	public static void main(String[]args) {
		Box1<Apple> aBox = new Box1<Apple>();
		Box1<Orange> oBox = new Box1<Orange>();
		
		//aBox.set("Apple");
		aBox.set(new Apple()); //지정! aBox는 애플이라고
		//oBox.set("Orange");
		oBox.set(new Orange()); //지정! oBox는 오렌지!
		
		Apple ap = aBox.get(); // get메소드의 반환형도 Apple과 Orange로 결정됨.
		Orange og = oBox.get();
		
		System.out.println(ap); //toString은 여기서 호출된거.
		System.out.println(og);
	}

}
