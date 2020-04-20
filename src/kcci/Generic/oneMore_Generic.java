package kcci.Generic;

import java.util.ArrayList;

class Box111<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}
}
class MyArr<T>{
	private ArrayList<T> al;
	public MyArr(int size) {
		this.al = new ArrayList<T>();
	}
	public void setAl(T v) {
		al.add(v);
	}
	public T getAl(int inx) {
		return al.get(inx);
	}
}

public class oneMore_Generic {

	public static void main(String[] args) {
		Box111<Integer> b1 = new Box111<Integer>();
		b1.add(new Integer(2));
		Box111<String> s1 = new Box111<String>();
		s1.add("Hello Java");
		System.out.println(b1.get());
		System.out.println(s1.get());

	}

}
