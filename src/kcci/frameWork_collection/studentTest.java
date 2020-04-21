package kcci.frameWork_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable{
	public int age;
	public Student(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) { //두개씩 비교하면서 위치를 바꿈.
		Student stu = (Student) o;
		if (this.age > stu.age)
			return 1;
		else if(this.age < stu.age)
			return -1;
		else 
			return 0;
	}
}

public class studentTest {
	public static void main(String[]args) {
		int[] arr = {1, 2, 3, 4};
		Student[] StuArr = new Student[3]; //타입만 선언. 구조만 만들었다.
		StuArr[0] = new Student(1); //만들어진 구조에 값을 할당.
		StuArr[1] = new Student(3);
		StuArr[2] = new Student(2);
		
		for (int inx = 0; inx < StuArr.length;inx++) {
			Student s = StuArr[inx]; //StuArr출력된것을 Student타입의 s에 저장
			System.out.println(s.age); //s의 age를 출력
		}
		for (Student s : StuArr) {
			System.out.println(s.age);
		}
		Arrays.sort(StuArr);
		for (Student s : StuArr) {
			System.out.println(s.age);
		}	
		
		List<Student> stu2 = new ArrayList<>();
		stu2.add(new Student(1));
		stu2.add(new Student(3));
		stu2.add(new Student(2));
		
		for (int jnx=0; jnx < stu2.size();jnx++) {
			System.out.println(stu2.get(jnx).age);
		}
		for (Student s : stu2) {
			System.out.println(s.age);
		}
		Iterator<Student> Itr = stu2.iterator(); 
		while(Itr.hasNext()) {System.out.println(Itr.next().age);}
		
		
		/* 타입만 이터레이터라고 하는거고 인터페ㅣ스라고요ㅕ객체의 해당되는 메소드 호출*/
		
		
		
}
}
