package kcci.interface_a;

interface Printable66{
	void printLine22(String str);
}

class SimplePrinter22 implements Printable66{ // Printable 流立 备泅
	public void printLine22(String str) {
		System.out.println(str);
	}
}
class MultiPrinter extends SimplePrinter22{ // Printable 埃立 备泅
	public void printLine22(String str) {
		super.printLine22("start of Multi...");
		super.printLine22(str);
		super.printLine22("End of multi");
	}
}

public class InstanceofInterface {
	public static void main(String[]args) {
		Printable66 prn1 = new SimplePrinter22();
		Printable66 prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable66)
			prn1.printLine22("This is a simple printer");
		System.out.println();
		
		if(prn2 instanceof Printable66)
			prn2.printLine22("This is a multi printer");
	}

}
