package kcci.Exception;

public class Test4 {
	public static void main(String[]args) {
		try {
//			int a = 3;
//			int b = 0;
//			int c = a / b;
			int a[] = new int[5];
			a[5] = 0;
//			a[5] = 30/0;
			
		}catch(ArithmeticException e) { // ArithmeticException e = new ArithmeticException
			//예외 에러메세지 발송 등 기능 추가 가능
			System.out.println("0으로 나누었습니다.");
			//try{}catch{}catch{}catch{} ... 계속 붙이면서 순차 확인
			//catch100개 해도 안잡히는 오류는??
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) { //catch100개 해도 안잡히는 오류 무조건 잡는 마지막 줄.
			System.out.println("Exception");
		}
	}
}

// Throwable(예외처리 최상위 클래스) > Exception > Error > ... 
// Exception한테만 책임전가하려고 하지 말고 위의 에러처리문을 상세히 기술하도록