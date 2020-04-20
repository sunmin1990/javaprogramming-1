package kcci.Generic_C;

class Box2<T>{
	private T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}
class Toy2{
	@Override
	public String toString() {return "I am a Toy";}
}
class BoxHandler2{
	public static void outBox(Box2<? extends Toy2> box) {
		Toy2 t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box2<? super Toy2> box, Toy2 n) {
		box.set(n); // 상자에 넣기
	}
}

public class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		Box2<Toy2> box = new Box2<>();
		BoxHandler2.inBox(box, new Toy2());
		BoxHandler2.outBox(box);

	}

}
