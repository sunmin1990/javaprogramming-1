package kcci.frameWork_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 { /* ArrayListCollection */

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("하나");
		al.add("둘!");
		al.add("스에웻!");
		for (String s : al) {
			System.out.println(s);
		}
		for (Iterator<String> itr = al.iterator();itr.hasNext();) {
			//for구문을 조건이 일치할때에만 뽑아내게 할 수도 있음.
			System.out.println(itr.next());
		}
		List<String> al2 = new ArrayList<String>();
		al2.add("하아아아나아아앗");
		al2.add("두리두리둘둘리");
		

	}

}
