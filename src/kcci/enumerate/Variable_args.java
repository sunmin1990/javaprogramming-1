package kcci.enumerate;

public class Variable_args {
	static void test1(String[] str) { // string으로 받는다  str=(그냥 인자)
		for(int inx=0;inx<str.length;inx++) {
			System.out.print(str[inx]);
		}
		System.out.println();
	}
	
	static void test2(String...str2){ //바로 Array로 취급 String[] str2 = {"1","2","3","4"}
		for(int inx=0;inx<str2.length;inx++) {
			System.out.print(str2[inx]);
		}
	}
	public static void main(String[]args) {
		//test1("1","2","3","4"); // 왜 오류가뜰까? 바로 Array로 못만들어줘서 오류 / array였었어야 함.
		
		String[] a = {"1","2","3","4"};
		test1(a);
		test2("1","2","3","4"); //가변인자이기때문에 바로 Array로 인식
		
	}
}
