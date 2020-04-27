package studyJava;
class Point{
	int xPos;
	int yPos;
	public Point(int x, int y) {
		xPos=x;
		yPos=y;
	}
	public void showPointInfo() {
		System.out.println("["+xPos+","+yPos+"]");
	}
}

class Circle extends Point{
		private int zRad;
		final double PI = 3.14;

	public Circle(int xPos, int yPos, int zRad) {
		super(xPos, yPos);
		this.zRad=zRad;
	}
	public void showCircleInfo() {
		double area = zRad * zRad * PI;
		showPointInfo();
		System.out.println(area);
	}
}
/*이 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자.Circle클래스는
 * 좌표상의 위치정보와 반지름의 길이 정보를 저장할 수 있어야 한다. 그리고 다음
 * 수준의 main메소드를 기반으로 Circle클래스를 테스트하자.*/
public class ExCircle {

	public static void main(String[] args) {
		Circle c = new Circle(3,3,6);
		c.showCircleInfo();

	}
	
/*위의 main 메소드에서 showCircleInfo메소드 호출을 통해서 원의 정보를 
 * 출력했을때, 원의 좌표정보와 반지를 정보는 반드시 출력이 되도록 구현해야 한다.*/

}
