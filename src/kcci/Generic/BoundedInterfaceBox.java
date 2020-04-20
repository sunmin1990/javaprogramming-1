package Generic_ex;

interface Eatable{
	public String eat();
}
class Apple implements Eatable{
	public String toString() {
		return "I am an apple";
	}
	@Override
	public String eat() {
		return "It tastes so good!";
	}
}
class Box1<T extends Eatable>{
//타입인자를 제한할 때에는 하나의 클래스와 하나 이상의 인터페이스에 대해 동시에 제한을 할 수 있다.
//Eatable인터페이스를 구현하는 클래스만이 타입 인자로 올 수 있다. (타입인자 제한)
	T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		System.out.println(ob.eat());
		//Eatable로 제한하였기때문에 eat호출 가능
		return ob;
	}
}
public class BoundedInterfaceBox {
	public static void main(String[]args) {
		Box1<Apple> box = new Box1<>();
		box.set(new Apple()); //사과 저장
		
		Apple ap = box.get(); //사과 꺼내기
		System.out.println(ap);
	}

}