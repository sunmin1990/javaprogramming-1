package kcci.frameWork_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> Itr = list.iterator(); //반복자 획득. 
		
//		while(Itr.hasNext())
//			System.out.print(Itr.next()+'\t');
//		System.out.println();
//		
//		Itr = list.iterator();
		
//		String str;
//		while(Itr.hasNext()) { //반환할 대상이 있다면,
//			str = Itr.next();// next메소드 호출해서 다음으로 넘어감.
//			if(str.equals("Box")) //만약 다음에 호출한게 "Box"랑 같으면
//				Itr.remove(); //제거
//		}
		
		int inx=1;
		List<String> al = new ArrayList<String>();
		
		while(Itr.hasNext()) { 
			String str = Itr.next();
			if(inx==2) {  // 인덱스 2번만 리무브하도록 지정해보았다.
				Itr.remove();
			}
			else {
				al.add(str);
			System.out.println(inx);
			}
			inx++;
			
		}
		System.out.println();
		
		for(String s : al) {
			System.out.println(s);
		}
		
		
//		while(s.hasNext())
//			System.out.print(s.next()+'\t');
//		System.out.println();
	}

}

/* hasNext() next메소드 호출 시 참조값 반환 가능 여부 확인
 * next()  
 * */
