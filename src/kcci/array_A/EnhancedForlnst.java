package kcci.array_A;

class Box33 {
	private String contents;
	private int boxNum;
	
	Box33(int num, String cont){
		boxNum = num;
		contents = cont;
	}
	public int getBoxNum() {
		return boxNum;
	}
	public String toString() {
		return contents;
	}
}

public class EnhancedForlnst {
	public static void main(String[]args) {
		Box33[] ar = new Box33[5];
		ar[0] = new Box33(101,"Coffee");
		ar[1] = new Box33(202,"Computer");
		ar[2] = new Box33(303,"Apple");
		ar[3] = new Box33(404,"Dress");
		ar[4] = new Box33(505,"Fairy-tale book");
	}

}
