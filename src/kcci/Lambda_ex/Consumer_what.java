package kcci.Lambda_ex;

import java.util.function.Consumer;
interface Database{void open(String dbName);}

public class Consumer_what {

	public static void main(String[] args) {
		
		//선언된 Data type
		Database db = (dbName) -> {
			System.out.println(dbName + " open");
		};
		db.open("jjj"); //ㅋㅋㅋ찍었다!
		
		//리턴타입없고 파라미터만 있을 때 : 범용형 인터페이스 : 인터페이스 쓰기 싫을 때 :(
		Consumer <String> o = (dbName) ->{
			System.out.println(dbName+" open");
		};
		o.accept("Database"); //consumer - accept 짝!

	}

}
