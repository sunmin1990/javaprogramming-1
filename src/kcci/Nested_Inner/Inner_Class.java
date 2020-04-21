package kcci.Nested_Inner;

class School{
	private int m=10; //멤버변수
	class Student{ //멤버로 클래스가 들어간것 뿐.
		void msg() {System.out.println(m);}
	}
}

public class Inner_Class {
	public static void main(String[]args) {
		School s = new School();
		//School.Student s2 = new School.Student(); 이렇게는 안되고
		School.Student s3 = s.new Student();// 내부클래스를 객체화 시켜서 School
		s3.msg();
		
	}

}
