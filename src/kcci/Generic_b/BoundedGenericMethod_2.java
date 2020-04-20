package kcci.Generic_b;
class Store <T>{
	private T t;
	public void add(T t) {this.t = t;}
	public T getValue() {return this.t;}
}
class Box6<T,S>{ //두개 제네리콰!
	private T t;
	private S s;
	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}
	public T getFirst() {return this.t;} //타입매개변수
	
	public S getSecond() {return this.s;}
}

public class BoundedGenericMethod_2 {

	public static void main(String[] args) {
		Box6<String, Integer> b = new Box6<String, Integer>();
		b.add("홍길동", 1234);
		Box6<String, Store<String>> b2 = new Box6<String, Store<String>>();
		Store<String> s = new Store<String>();
		s.add("테스트");
		b2.add("강감찬", s);
		//니가 원하는대로~~~~ 다집어넣을 수 이쏘 Store<String> 뤠펕클래스
		
	}

}
