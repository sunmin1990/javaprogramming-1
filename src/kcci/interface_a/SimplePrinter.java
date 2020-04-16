package kcci.interface_a;

interface Printable55{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);
	}
}

class Printer_a implements Printable55{ }

public class SimplePrinter {
	public static void main(String[]args) {
		String myDoc = "This is a report about...";
		Printable55 prn = new Printer_a();
		prn.print(myDoc);
		
		Printable55.printLine("End of Line");
	}

}
