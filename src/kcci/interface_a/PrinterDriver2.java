package kcci.interface_a;

interface Printable{
	void print(String doc); //출력을 위한 추상 메소드
	// 인터페이스의 모든 메소드는 public이 선언된 것으로 간주.
}

class Prn204Drv implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-204 printer");
		System.out.println(doc);
	}
}
class Prn731Drv implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}
public class PrinterDriver2 {

	public static void main(String[] args) {
		String myDoc = "This is a report aboud...";
		
		Printable prn = new Prn204Drv();
		prn.print(myDoc);
		System.out.println();
		
		prn = new Prn731Drv();
		prn.print(myDoc);
	}
}


/* 인터페이스의 기본과 그 의미
 * 인터페이스의 형을 대상으로 참조변수의 선언이 가능하다.
 * 인터페이스의 추상 메소드와 이를 구현하는 메소드 사이에 오버라이딩 관계가 성립한다.  @Override 선언 가능
 * 추상메소드 : 메소드의 몸체가 비어있는 메소드
 * 인터페이스에 존재할 수 있는 메소드 (abstract, default, static)
 * 구현 : 인터페이스를 대상으로는 인스턴스 생성이 불가능하고 다른 클래스에 의해 implements로 상속
 * 		- 키워드 implements를 사용
 * 		- 한 클래스는 둘 이상의 인터페이스를 동시에 구현할 수 있다.
 * 		- 상속과 구현은 동시에 가능*/