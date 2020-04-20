package kcci.Exception;

import java.io.IOException;

class MyClass{
	void method() throws IOException{
			throw new IOException("Device Error");
//		try {
//			throw new Exception("device Error");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}


public class Test5 {
	public static void main(String[]args) //throws IOException 예외발생으로 처리
	{
//		int a = 1;
//		int b = 0;
//		int c = a/b;
		//throw new ArithmeticException();
		
		MyClass c = new MyClass();
//		c.method(); try-catch 안하고 그냥 에러출력
		
	}
}
