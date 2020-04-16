package kcci.interface_a;

interface Animal11{
	void breath();
}
interface Insects{
	void breath();
}
class Beetle implements Animal11, Insects{
	public void breath() {
		System.out.println("Breath Beetle");
	}
}

public class Test5 {
	public static void main(String[]args) {
		Animal11 a = new Beetle();
		a.breath();
		Insects a1 = new Beetle();
		a1.breath();
	}

}
