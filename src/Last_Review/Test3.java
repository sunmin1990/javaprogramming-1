package Last_Review;

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {//생성자의 오버로딩 : 멤버변수 초기화
		this.name=name;
		this.age=age;
	}
//	public void setName(String name) {this.name=name;}//멤버변수 하나에 대해서만 초기화
//	public String getName() {return this.name;}       //할필요 없었슴... -_- 멍청한나..
//	public void setAge(int age) {this.age=age;}
//	public int getAge() {return this.age;}

	public void gotoSchool() {
		System.out.println(name+","+age+"살. 은 학교가기 싫다.");
	}
}

public class Test3 {
	public static void main(String[] args) {
		Student stu = new Student("구지혜",100);
		stu.gotoSchool();
	}

}
