package kcci.Generic_b;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends A {}

public class wildCard_b {
	static void testMethod(List<?> els) {
		// <?> 는 ANY 타입이고 제네릭처럼 제네릭처럼 제약을 걸려면 
		// <T extends A> 
		for (Object o : els) {
			System.out.println(o);
		}
	}
	
//	static void testMethod(List<A> els) {
//		for (A o : els) {
//			
//		}
//	}
	
	
	public static void main (String[]args) {
		List<A> aList = new ArrayList<A>();
		List<B> bList = new ArrayList<B>();
		
		testMethod(aList);
		testMethod(bList); // 와일드카드 쓰니깐 bList도 받아온당.
		//testMethod(bList); //위에서 A라고 정했으니까 안됨
		
		/* aList = bList? (List<A> / List<B> 타입이 다르니까 안뎀
		 * List<B> bList2 = List<A>; 안된다규
		 */
		// 이런것도 가능합니다아아앙~~ (전부 A로 제한한것들)
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		
		
	}

}
