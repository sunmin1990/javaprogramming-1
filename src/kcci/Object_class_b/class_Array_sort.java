package kcci.Object_class_b;

import java.util.Arrays;

class Sutudent3 implements Comparable{
	int rollno;
	String name;
	int age;
	
	public Sutudent3 (int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Sutudent3 s = (Sutudent3) o;
		if(this.age == s.age)
			return 0;
		else if(this.age > s.age)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
}

public class class_Array_sort{
	public static void main(String[]args) {
		Sutudent3[] stu = new Sutudent3[3];
		stu[0] = new Sutudent3(1,"홍길동",21);
		stu[1] = new Sutudent3(2,"이순신",40);
		stu[2] = new Sutudent3(3,"강감찬",30);
		Arrays.sort(stu);
		for(Sutudent3 s : stu) {
			System.out.println(s);
		}
		
	}
}

