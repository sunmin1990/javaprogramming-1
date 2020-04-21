package frameWork_collection;

import java.util.*;

public class List_framework {

	public static void main(String[]args) {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new LinkedList<String>();
		List<String> l3 = new Vector<String>();
		List<String> l4 = new Stack<String>();
		
		l1.add("one");
		l1.add("two");
		
		Iterator<String> ltr = l1.iterator();
		while(ltr.hasNext()) {System.out.println(ltr.next());}
		//컬렉션만의 특성이랴~ =_= 하나씩 뽑아냄
		System.out.println();
		for(int inx=0;inx < l1.size(); inx++) {System.out.println(l1.get(inx));}
		System.out.println();
		for(String s : l1) {System.out.println(s);}
}
}
