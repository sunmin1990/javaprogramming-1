package kcci.interface_a;

interface Printable11{
	void print(String doc);
}

interface ColorPrintable extends Printable11{ //Printable11을 상속하는 인터페이스
	void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable{
	@Override
	public void print(String doc) { //흑백출력
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}
	@Override
	public void printCMYK(String doc) { //컬러출력
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}
public class PrinterDriver3 {
	public static void main(String[]args) {
		String myDoc = "This is a report about...";
		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}
}
