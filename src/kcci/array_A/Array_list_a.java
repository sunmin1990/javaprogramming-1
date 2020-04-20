package Array_list;

import java.util.ArrayList;

public class Array_list_a {
	public static void main(String[]args) {
		int[] arr = {1,2,3,4};
		
		for(int inx=0;inx < arr.length;inx++) {
			System.out.println(arr[inx]);
		}
		ArrayList al = new ArrayList(); 
		//목록 리스트 수정이 가능
		al.add(1); //arr뒤에 추가가됐네!
		al.add("test");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1)); //index로 비집고 들어갈 수도 있다.(가변적)
		
		for (Object o : al) {
			System.out.println(o.toString());
		}
	}
}
