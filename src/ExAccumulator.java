package studyJava;
/* 다음 main메소드와 함께 동작하는 Accumulator 클래스를 정의하자. 
 * 그리고 Accumulator 클래스에 main 메소드도 넣어서 컴파일 및 
 * 실행을 하자*/

class Accumulator{
	static int i=0;
	static int sum;
//	public Accumulator() {
//		this.i=i;
//		this.sum=sum;
//	}
	
	public static int add(int i) {
		int sum=0;
		for (int a=0; a<10; a++) {
			sum+=a;
		}
		return sum;
	}
	static void showResult() {
		System.out.println("sum = "+add(i));
	}

}
public class ExAccumulator {

	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}
	
/* 실행 결과로, 즉 showResul메소드의 호출결과로 다음과 같은 수준의
 * 출력을 보이면 된다. 
 * >> sum = 45 */

}
