package Study_workshop;

//import java.util.Scanner;

public class Array13_1 {
	
	public static int maxValue(int[] arr) { //return���� �ִ� �ִ밪 ���ϴ� �޼��� ����
		int max = arr[0];
//		for(int i=0; i<arr.length; i++) { �Ϲ����� for�� ��� enhanced for�� ���
		for(int e :arr) { //int�� ���� e�� arr�̶�� �迭�� ������� {�߰�ȣ} �ȿ� �ִ� ������ �ݺ� ����
			if(max<e)     //max��� ������ e���� ������ max�� e�� �����Ѵ�.
				max=e;
		}
		return max;      //�ִ밪 ���
	}
	
	public static int minValue(int[] arr) { //return���� �ִ� �ּҰ� ���ϴ� �޼��� ����
		int min = 0;
		min=arr[0];
		for(int j=0; j<arr.length; j++) {
			if(min>arr[j])
				min=arr[j];
		}
		return min;
	}
	
	public static void main(String[] args) { //�迭 ������ ���ڰ� ����.
		
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
