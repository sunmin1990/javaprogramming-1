package kcci.Lambda_ex;

import java.util.function.Predicate;

interface Checkvalue <T> {boolean test2(Integer a);}

public class predicate_what {
	//밑에 한방을 check메소드의 매개변수로 전달 Line 24
	static void check(Predicate<Integer> s, int a) {
		System.out.println(s.test(10));
	}
	
	public static void main(String[]args) {
		//인터페이스 만들고 써준 람다식
		Checkvalue <Integer> c = (a) -> {return (a>18);};
		System.out.println(c.test2(18));
		
		//위에꺼랑 똑같은데 범용 인터페이스로 한방! 
		Predicate<Integer> p = (a) -> (a>18);
		System.out.println(p.test(20)); //반환값은 true/false
		
		// 축약 한방 - 왜하는진모르게따...
		check((a) -> (a > 18), 30);
	}
}
