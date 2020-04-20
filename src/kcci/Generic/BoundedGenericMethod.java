package Generic_ex;

/* 제네릭 메소드도 호출 시 전달되는 타입 인자를 제한할 수 있다. 
 * 제네릭 클래스의 타입인자를 제한할 때 생기는 특성이 제네릭 메소드의 타입인자를 제한할때에도 생긴다.
 */
class Box3<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory2 {
	//<T extends Number>는 타입인자를 Number를 상속하는 클래스로 제한함.
	public static <T extends Number> Box3<T> makeBox(T o){
		Box3<T> box = new Box3<T>();
		box.set(o);
		
		System.out.println("Boxed data: "+o.intValue());
		//타입인자 제한으로 intValue호출 가능
		return box;
	}
}

class UnBoxer{
	//타입인자를 Number를 상속하는 클래스로 제한
	public static <T extends Number> T openBox(Box3<T> box) {
		System.out.println("Unboxed data: "+box.get().intValue());
		//타입인자 제한으로 intValue호출 가능
		return box.get();
	}
}

public class BoundedGenericMethod {

	public static void main(String[] args) {
		Box3<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
		int n = UnBoxer.openBox(sBox);
		System.out.println("Returned data: "+n);

	}

}
