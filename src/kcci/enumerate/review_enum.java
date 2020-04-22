package kcci.enumerate;

enum Menu{
	Pizza, Nuddle
}

enum Menu2{
	Pizza(100), Nuddle(200);
	int aa;
	private Menu2(int aa) { //항목값 지정할때는 private
		this.aa = aa;
	}
}

public class review_enum {
	public static void main(String[]args) {
		Menu m = Menu.Pizza; //바로 사용하는게 아니라 생성 한번하고!
		System.out.println(m);
		System.out.println(Menu.valueOf("Pizza"));
		System.out.println(Menu.valueOf("Pizza").ordinal()); //ordinal() = default 값 반환
		
		Menu2 m1 = Menu2.Pizza;
		System.out.println(m1);
		System.out.println(Menu2.valueOf("Pizza").aa); //지정값이니까 지정값 
	}
}
