package kcci.array_A;

class Box //extends Object 
 	{
	private String conts; 
	
	public Box(String cont){
		this.conts = cont;// 생성자
	}
	public String toString() {
		return conts; //object클래스에서 오버라이딩 되었음.
		//객체 주소 반환 말고 conts가 가지는 값을 출력하려구
		//생성자 오버라이딩
	}
}
public class BoxArray {
	public static void main(String[]args) {
		Box[] ar = new Box[3]; //배열 생성
		ar[0] = new Box("First"); //인덱스0, First
		ar[1] = new Box("Second"); //인덱스1, Second
		ar[2] = new Box("Third"); //인덱스2, Third
		
		System.out.println(ar[0]); //출력.
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}

}

/* 어쨌든 가장 중요한건 객체지향 객체지향 모르면 아무것도 안됨. 복습 반드시 할 것 */

