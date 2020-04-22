package kcci.Lambda_ex;

interface Calculate <T>{
	T Cal (T a, T b);
}

public class LambdaGeneric {

	public static void main(String[] args) {
		Calculate<Integer> ci = (a,b) -> a+b;
		System.out.println(ci.Cal(4, 3));
		
		Calculate<Double> cd = (a,b) -> a+b;
		System.out.println(cd.Cal(4.32,  3.45));

	}

}
