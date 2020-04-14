package kcci.java;
class A{
	void aMethod() {System.out.println("aMethod");}
}
class B extends A {
	void bMethod() {System.out.println("bMethod");}
}
public class instanceOf {
	public static void main(String [] args) {
		B b = new B();
		String className = b.getClass().getSimpleName();
		System.out.println(className);
		
		if(className.equals("B")) {
			System.out.println("B Okay");
		}
		if (b instanceof B) { // if(className.equals("B")
			System.out.println("B ok");
		} //사용하기 편하라고.. instanceof도 연산자.
		boolean check1 = b instanceof A; //엄청중요한 줄
		System.out.println(check1);// 엄청 중요한 줄
		
		B b1 = null;
		boolean check2 = b1 instanceof A;
		//안맞으면 무조건 false 
		System.out.println(check2);
	
	}
}
