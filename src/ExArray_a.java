package studyJava;
/* 배열과 메소드 
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최대값, 최소값을
 * 찾아서 반환하는 메소드를 각각 다음의 형태로 정의하자
 * public static int minValue(int[]arr)
 * public static int maxValue(int[]arr)
 * 단 반복문을 사용할 때 minValue 정의에서는 일반적인for문을 사용하고
 * maxValue의 정의에서는 enhanced for문을 사용하기로 하자*/

class ArrayValue{
	static int i[] = {1,2,3,4,5,6,7,8,9,10};
	
	public static int minValue(int[]arr) {
		int min = arr[0];
		for(int i=0; i<arr.length;i++)
			if(min>arr[i]) {
				min = arr[i];
			}
		return min;
	}
	public int maxValue(int[]arr) {
		int max = arr[0];
		for(int i : arr) 
			if(max<arr[i]) {
				max = arr[i];
			}
		return max;
	}
	
	System.out.println(minValue());
	System.out.println(maxValue());
}
class ExArray_a{
	public static void main(String[]args) {
//		ArrayValue ar [] = new ArrayValue[5];
//		ar[0] = new ArrayValue(1);
//		ar[1] = new ArrayValue(2);
//		ar[2] = new ArrayValue(3);
//		ar[3] = new ArrayValue(4);
//		ar[4] = new ArrayValue(5);
		
		
	}
	
}
