package kcci.Generic_C;
/* 제한된 와일드카드 선언을 갖는 제네릭 메소드 */
class Box3<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
class Toy3{
	@Override
	public String toString() {return "I am a Toy";}
}
class Robot3{
	@Override
	public String toString() {return "I am a Robot";}
}
class BoxHandler3{
	//Box<Toy>인스턴스와 Box<Robot>인스턴스를 동시에 허용할 수 있도록 inBox와 outBox메소드를 정의
	public static <T> void outBox(Box3<?extends T> box) {
									// 메소드 오버로딩
		T t = box.get();//상자에서 꺼내기
		System.out.println(t);
	}
	public static <T> void inBox(Box3<? super T> box, T n) {
		box.set(n); //상자에 넣기
	}
}

public class BoundedWildcardGenericMethod {

	public static void main(String[] args) {
		Box3<Toy3> tBox = new Box3<>();
		BoxHandler3.inBox(tBox,  new Toy3());
		BoxHandler3.outBox(tBox);
		Box3<Robot3> rBox = new Box3<>();
		BoxHandler3.inBox(rBox, new Robot3());
		BoxHandler3.outBox(rBox);

	}

}
