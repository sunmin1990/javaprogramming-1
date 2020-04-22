package kcci.Nested_Inner;

interface Database{void open();}

/* open을 구현한 클래스가 익명클래스로 쉬리리리릵*/

public class review_Anonymous {
	//람다식의 인자전달 - 인자를 전달하여 매개변수를 초기화 
	static void test(Database d) {d.open();}
	
	public static void main(String[]args) {
		Database db = new Database() {
			public void open() {System.out.println("Database open!");}
		}; //이름이 없는 무명 클래스 ~바로객체생성하고 메소드도정의하고 쓰고 버림
		db.open();
		
		//람다 : 매개변수 타입같은건 컴파일러가 알아서 인퍼런싱
		Database db2 = () -> {System.out.println("Open Sesami!");};
		db2.open();
		test(db2);
		
		//람다식의 인자전달 : 람다식을 메소드의 인자로 전달
		test(()->{System.out.println("Don't open");});
	}

}
