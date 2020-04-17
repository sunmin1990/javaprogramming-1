package kcci.exception_b;


/* try-catch구문은 하나의 문장이므로 try 홀로 존재할 수 없다. 
 * 반드시 catch구문이 하나이상 등장해야 한다. try에 이어서 finally구문을 둘 수도 있다. 
 * finally - 코드의 실행이 try안으로 진입하면 무조건 실행이 된다. */
public class tryCatch {
	public static void main(String[]args) {
		try {
			int a = 1/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception
				e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End"); //try 내용이 없어도 반드시 실행
		}
	}
}
