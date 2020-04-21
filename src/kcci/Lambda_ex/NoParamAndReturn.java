package kcci.Lambda_ex;

import java.util.Random;

interface Generator{int rand();}

public class NoParamAndReturn {

	public static void main(String[] args) {
		Generator gen = () -> { //D´Ù
			Random rand = new Random();
			return rand.nextInt(50);
		};
		System.out.println(gen.rand());
	}
}
