package kcci.Generic;

public class GenericMethodBoxMaker {
	static <E> void printArr(E[] arr) {
		for (E e : arr) {
			System.out.println(e); // <E>타입으로 array 받았다고.
		}
	}
	
	public static void main(String[]args) {
		Integer[] arr = {1,2,3,4};
		Character[] cha = {'A','a','b'};
		printArr(arr); //E[] arr = arr;
		printArr(cha);
	}
}
