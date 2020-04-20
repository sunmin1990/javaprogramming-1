package kcci.Generic_b;

class Box<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {return ob.toString();}
}
class UnBoxer{
	public static <T> T OpenBox(Box<T> box) {return box.get();}

	//상자 안의 내용물을 확인하는 기능의 제네릭 메소드
	public static <T> void peekBox(Box<T> box) {
	/* Box<Integer>, Box<String>의 인스턴스를 인자로 전달받도록 하기 위함이므로
	 * public static void peekbox(Box<Object> box)로 정의해도 무방하지않아.
	 * Box<Object>와 Box<String, Integer>는 상속관계를 형성하지 않으니깐! 
	 * 이때 등장하는 것이 와일드 카드란 말씀.*/
	
		System.out.println(box); 
	}
}

public class WildcardUnboxer {
	
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("So Simple String");
		UnBoxer.peekBox(box); //상자안의 내용물 확인

	}

}
