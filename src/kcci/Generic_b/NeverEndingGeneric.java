package kcci.Generic_b;

import java.util.ArrayList;

public class NeverEndingGeneric {

	static Double add(ArrayList<? extends Number> num) {
	// Number형식 중 ~ANYTYPE~ 타입매개변수로 전달받음.
		double sum = 0.0;
		for (Number n : num) {
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		System.out.println(add(al));
		ArrayList<Double> al2 = new ArrayList<Double>();
		al2.add(10.0);
		al2.add(20.0);
		System.out.println(add(al2));
		

	}

}
