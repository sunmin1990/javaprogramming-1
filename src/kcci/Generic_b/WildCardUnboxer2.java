package kcci.Generic_b;

class Box2<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {return ob.toString();}
}
class UnBoxer2{
	public static <T> T OpenBox(Box2<T> box) {return box.get();}

	public static void peekBox(Box2<?> box) {
	//Box<T>를 기반으로 생성된 Box<Integer/String>인스턴스들을 인자로 받을 수 있다.
	//Box<T>일때랑 Box<?>일때랑 뭔차이가 있는걸까? 코드가 좀 더 간결하다.
	// 뭐 와일드카드기반이라고도 한다는데 뭔말인진 @.@a
	// public static <T> void peekbox(Box<T> box)
		System.out.println(box); 
	}
}

public class WildCardUnboxer2 {

	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		box.set("So Simple String");
		UnBoxer2.peekBox(box); //상자안의 내용물 확인

		}

}


