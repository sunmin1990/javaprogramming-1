package kcci.Nested_Inner;
interface Printable{//추상메소드가 하나인 인터페이스
	void print (String s);
}

//인터페이스에서 메소드 하나 정의됐을때 그것만  가능함. 
public class Lambda3 {
	public static void main(String[]args) {
		Printable prn = (s) -> {System.out.println(s);};
		prn.print("wtf");
	}

}
