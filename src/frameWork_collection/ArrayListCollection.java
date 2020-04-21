package frameWork_collection;

import java.util.*;

public class ArrayListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 컬렉션 인스턴스 생성
		
		// 인스턴스에 문자열 저장 (add는 하나밖에 안됨.)
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		
		//저장된 문자열 인스턴스 참조
		for (int i=0; i < list.size();i++)
			System.out.print(list.get(i)+'\t');
		System.out.println();
		
		list.remove(0); //첫번째 문자열(인스턴스) 지우기
		
		//지운것 다시 뽑아보기
		for (int i=0; i < list.size();i++)
			System.out.print(list.get(i)+'\t');
		System.out.println();

	}

}
