package Study_workshop;

//import java.util.Scanner;

public class Array13_1 {
	
	public static int maxValue(int[] arr) { //return값이 있는 최대값 구하는 메서드 생성
		int max = arr[0];
//		for(int i=0; i<arr.length; i++) { 일반적인 for문 대신 enhanced for문 사용
		for(int e :arr) { //int형 정수 e는 arr이라는 배열을 대상으로 {중괄호} 안에 있는 영역을 반복 실행
			if(max<e)     //max라는 변수가 e보다 작으면 max에 e를 대입한다.
				max=e;
		}
		return max;      //최대값 출력
	}
	
	public static int minValue(int[] arr) { //return값이 있는 최소값 구하는 메서드 생성
		int min = 0;
		min=arr[0];
		for(int j=0; j<arr.length; j++) {
			if(min>arr[j])
				min=arr[j];
		}
		return min;
	}
	
	public static void main(String[] args) { //배열 각각의 인자값 선언.
		
		int [] arr = new int [5];
		arr[0] = 10;
		arr[1] = 77;
		arr[2] = 135;
		arr[3] = 14;
		arr[4] = 25;
		
		System.out.println("Maximum:" + maxValue(arr));
		System.out.println("Minimum" +minValue(arr));

	}
}
