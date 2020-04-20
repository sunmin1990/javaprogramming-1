package Generic_ex;

class Box <T extends Number>{ 
	//인스턴스 생성시 타입 인자로 Number또는 이를 상속하는 클래스만 올수있음
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class BoundedBox {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();//Integer는 Number를 상속
		iBox.set(24);
		
		Box<Double> dBox = new Box<>(); //Double도 Number를 상속
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());

	}

}
