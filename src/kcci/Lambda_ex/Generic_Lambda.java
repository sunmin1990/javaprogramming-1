package kcci.Lambda_ex;

interface Calc <T> { //제네릭 기반의 함수형 인터페이스
	T operation(T a, T b);
}

public class Generic_Lambda {

	public static void main(String[] args) {
		Calc<Integer> c = (x, y) -> {return x+y;};
		
		System.out.println(c.operation(1, 2));
		

	}

}
