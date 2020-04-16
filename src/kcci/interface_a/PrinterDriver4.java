package kcci.interface_a;

interface Printable44{
	void print(String doc);
	default void printCMYK(String doc) { }
}
class Prn731Drv_a implements Printable44{
	@Override
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}
class Prn909Drv_a implements Printable44{
	@Override
	public void print(String doc) { //implements
		System.out.println("From ME-909 blick & white ver");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) { //Override
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

public class PrinterDriver4 {
	public static void main(String[]args) {
		String myDoc = "This is a report about...";
		Printable44 prn1 = new Prn731Drv_a();
		prn1.print(myDoc);
		System.out.println();
		
		Printable44 prn2 = new Prn909Drv_a();
		prn2.print(myDoc);
	}

}
