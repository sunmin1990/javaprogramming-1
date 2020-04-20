package Generic_ex;

class Box2<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory{
	public static <T> Box2<T> makeBox(T o){  //제네릭 메소드 정의
		//메소드의 이름은 makeBox이고, 반환형은 Box<T>이다.
		//그리고 T는 타입 매개변수의 선언 (Box2<T>는 반환형, <T>는 타입매개변수)
		Box2<T> box = new Box2<T>(); //상자 생성
		box.set(o); //전달된 인스턴스를 상자에 담아서
		return box; //반환
	}
}
public class GenericMethodBox {

	public static void main(String[] args) {
		Box2<String> sBox = BoxFactory.makeBox("Sweet"); //메소드 호출시에 자료형이 결정됨
		    //<String>은 T에 대한 타입인자.
		System.out.println(sBox.get());
		Box2<Double> dBox = BoxFactory.makeBox(7.59); //7.59오토박싱
		System.out.println(dBox.get());

	}

}
