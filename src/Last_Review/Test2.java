package Last_Review;
// 어느 두 수에 관한 function... 스태틱

class Calc{
	public int add(int a, int b) {
		int c = a+b;
		return c; //return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}
public class Test2 {
	static int multi(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		
		//외부 클래스 객체화 : add메소드가 static이 아니므로.
		Calc aa = new Calc();
		int c = aa.add(5, 6);
		System.out.println(c);
		
		//객체화 시키지 않고 바로 레퍼런스를 통해 수행
		int d = Calc.sub(90, 58);
		System.out.println(d);
		
		//동일 클래스 내에 만들어진 메소드에 바로 접근.
		int e = Test2.multi(78, 5);
		System.out.println(e);
		
	}

}
