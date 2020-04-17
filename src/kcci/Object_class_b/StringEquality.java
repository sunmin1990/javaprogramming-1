package kcci.Object_class_b;

public class StringEquality {
	public static void main(String[]args) {
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		if(str1==str2)
			System.out.println("str1, str2 참조대상 동일");
		else
			System.out.println("str1, str2 참조대상 다름");
		
		if(str1.equals(str2))
			System.out.println("str1, str2 내용 동일");
		else
			System.out.println("str1, str2 내용 다름");
	}
}
