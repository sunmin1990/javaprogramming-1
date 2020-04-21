package kcci.Lambda_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SLenComp implements Comparator<String>{
						//comparator<T>인터페이스의 구현이 필요한 상황
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class SlenComparator {

	public static void main(String[] args) {
		List<String> list111 = new ArrayList<>();
		list111.add("Robot");
		list111.add("Lambda");
		list111.add("Box");
		
		Collections.sort(list111, new SLenComp());
		//collections.sort메소드를 호출하면서 두번째 인자로 정렬의 기준을 갖고있는 인스턴스를 생성해서 전달
		// 기능전달. 
		
		for (String s : list111)
			System.out.println(s);

	}

}
