package kcci.interface_a;

interface IShape{
	void draw(int x, int y);
}
class Circle implements IShape{
	public void draw(int a, int b) { //추상클래스 draw구현
		System.out.println("Draw a circle:"+a+","+b);
	}
}
class Rectangle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a rectangle:"+a+","+b);
	}
}
class DrawManager{ //Draw관리 클래스
	IShape s; //
	public DrawManager(IShape s) { //매니저 메소드는 인터페이스 규약을 따르니까 
	// IShape s = new Circle
		this.s = s;
	}
	public void draw(int s, int t) {
		this.s.draw(s, t);
	}
}
public class Test4 {
	public static void main(String[]args) {
		DrawManager d = new DrawManager(new Circle()); //인터페이스 규약을 따르니까 객체만 집어넣으면 됨
		d.draw(1, 2);
		DrawManager d2 = new DrawManager(new Rectangle()); 
		d2.draw(2, 4);
	}
}
