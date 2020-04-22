package kcci.frameWork_collection;

import java.util.*;

public class review {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //ArrayList에서는 제네릭을 지원해줘서
		ArrayList<String> al1 = new ArrayList<>(); //타입매개변수에 String이 올 수 있었다
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D"); //사이즈에 제한이 없이 사용가능
		
		/* 출력방법 1 */
		for (int inx=0; inx<al1.size();inx++) {
			System.out.println(al1.get(inx));
		}
		/* 출력방법 2 */
		for (String s : al1) {
			System.out.println(s); //컬렉션 형태의 구조로 enhanced-for를 이용해 출력
		}
		/* 출력방법 3 */
		Iterator<String> lts = al1.iterator();
		//Iterator<E>
		while(lts.hasNext()) {
			System.out.println(lts.next());
		}
		
		//Linked List ; 비슷한데 자료저장 구조만 다름
		
		HashSet hs = new HashSet(); //중복되지 않는 데이터구조
		hs.add("B");
		hs.add("B"); //중복값은 기존 것 제거
		hs.add("Z");
		System.out.println(hs);
		
		
		// Hash
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("C");
		hs2.add("A");
		hs2.add("C");
		System.out.println(hs2);
		
		Iterator<String> hslts = hs2.iterator();
		while(hslts.hasNext()) {
			System.out.println(hslts.next()); //이건 출력이 좀 특이한뎅?
		}
		
		// Map : Key - Value => Dictionary구조
		Map map = new HashMap(); //key와 value 쌍의 구조일때
		
		map.put(1, "one");
		map.put(3, "three"); 
		map.put(2, "two");
		
		//그냥 두개 쌍으로 나오질 않으니 키 먼저 뽑고 다음에 값
		Set set = map.entrySet();
		Iterator lts1 = set.iterator();
		//Iterator가 핵심. 상위 인터페이스 
		
		while (lts1.hasNext()) {
			//System.out.println(lts1.next().getClass());
			Object o = lts1.next(); //Map안의 자료구조에 있는 내용들을 Object로 받아서
			Map.Entry e = (Map.Entry) o; //Map.Entry로 형변환
			System.out.println(e.getKey()+","+e.getValue()); //key값과 value값 따로따로 찍기.	
		}
		
		Map<Integer, String> map2 = new HashMap<>();
		// 제네릭 - 타입 캐스팅 없이 바로 사용 가능
		map2.put(1, "test1");
		map2.put(2, "test2"); //Map의 엔트리 타입 1개
		
		for (Map.Entry m : map2.entrySet()) {
			System.out.println(m.getKey()+","+m.getValue());
		}
	}

}
