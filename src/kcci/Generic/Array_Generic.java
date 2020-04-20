package kcci.Generic;

import java.util.ArrayList; //쓸때 알아서 되니까 첨부터 쓸필요 없음.


public class Array_Generic {
	public static void main(String[]args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two"); //String만 들어가는 array로 자동 캐스팅
		
		for (String s : al) {
			System.out.println(s); //출력하라
		}
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		//이번엔 Integer로 캐스팅 한다 요캐 써두면 박싱 언박싱할때도 갠춘
		
		//Generic 덕분에 코드량이 확줄었다는데 어쩌라고.
		//.Net에 나와도 generic
	}
}
