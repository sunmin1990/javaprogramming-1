package Last_Review;

//다형성의 심각성 : 상속관계에서 동일한 메소드를 호출하더라도 재정의된 메소드를 호출


class Shape{
	void draw() {System.out.println("draw shape");}
}

class Circle extends Shape{ //하위클래스에서 상위클래스의 메소드 재정의 : 오버라이딩
	void draw() {System.out.println("draw Circle");}
}

class Rectangle extends Shape{
	void draw() {System.out.println("draw Rectangle");}
}
public class Test4 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Shape a = c; //메소드 재정의  shape를 호출하더라도 circle 호출
		a.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Shape a1 = r;
		a1.draw();
		
		Shape[] s3 = new Shape[3]; //다형성의 정수
		s3[0] = new Shape();
		s3[1] = new Circle();
		s3[2] = new Rectangle();
		
		for(Shape s: s3) {s.draw();} //오버라이드된 메소드 개별호출
	}

}
