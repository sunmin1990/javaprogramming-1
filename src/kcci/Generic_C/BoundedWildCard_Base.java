package kcci.Generic_C;
/* 필요한 만큼만 기능을 허용하여, 코드의 오류가 컴파일 과정에서 최대한 발견되도록 한다. */
/* 언제 와일드카드에 제한을 걸어야 하는가? : 상한제한*/
class Box<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
class Toy{
	@Override 
	public String toString() {return "I am a Toy";}
}
class BoxHandler{
	public static void outBox(Box<Toy> box) {
		//매개변수 box가 참조하는 상자에서 인스턴스를 꺼내는 기능
		Toy t = box.get(); //상자에서 꺼내기
		System.out.println(t);
	}
	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);// 상자에 넣기
	}
}

public class BoundedWildCard_Base {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box,  new Toy());
		BoxHandler.outBox(box);
	}

}
