package kcci.object_class;

class User{
	public String id;
	public String password;
	
	@Override
	public boolean equals (Object o) { //상속받은 equals 메소드 재정의 // Object o = new User();
		User user = (User)o; //오브젝트 타입  user객체로 형변환 > id랑 password는 user에 있으니깐
		boolean checkFlag = false;
		if(this.id == user.id && this.password == user.password) {
		// id가 같아야 패스워드도 비교 > 패스워드가 같아야 true
			checkFlag = true;
		}
		return checkFlag;
	}
}

public class method_Equals {

	public static void main(String[] args) {
		
		User u = new User(); //유저객체생성
		u.id = "test";
		u.password = "1234";
		User u2 = new User();
		u2.id = "test";
		u2.password = "1111";
		
		if(u.equals(u2)) { //유저와 유저2객체 비교
			System.out.println("Equal User");
		}
		
		Object o = new Object();
		Object o1 = new Object(); //Not Equal with o
		Object o2 = o; //Equal
		if(o.equals(o1)) {
			System.out.println("Equal");
		}else {
			System.out.println("No Equal");
		}

	}

}
