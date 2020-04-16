package kcci.array_A;

//public class workshop3 {
//	
//	public static void main(String[]args) {
//		String[] student = new String[5];
//		student[0] = new char {"A","B","A","C","C","D","E","F","A","D"};
//		student[1] = new char {"D","B","A","B","C","A","E","F","A","D"};
//		student[2] = new char {"E","D","D","A","C","B","E","E","A","D"};
//		student[3] = new char {"C","B","A","E","D","D","E","F","A","D"};
//		student[4] = new char {"A","B","D","C","C","D","E","E","A","D"};
//	}
//	String[] answer = {'D','B','D','C','C','D','A','E','A','D'};
//	for (String i : answer) {
//		System.out.println(i)
//	}
// }
//	
//	public static void main(String[]args) {
//		String[] answer = {"D","B","D","C","C","D","A","E","A","D"};
//		String[] student = {"A","B","A","C","C","D","E","F","A","D"};
//		
//		for (String a : student1) {
//
//			if (a == answer) {
//				System.out.println(answer);
//			}else {
//				System.out.println(1);
//			}
//		}
//	
//	}
//}

public class workshop3{
	public static void main(String[]args) {
		String[] sutdent1 = {"A","B","A","C","C","D","E","F","A","D"};
		String[] sutdent2 = {"D","B","A","B","C","A","E","F","A","D"};
		String[] sutdent3 = {"E","D","D","A","C","B","E","E","A","D"};
		String[] sutdent4 = {"C","B","A","E","D","D","E","F","A","D"};
		String[] sutdent5 = {"A","B","D","C","C","D","E","E","A","D"};
		String[] answer = {"D","B","D","C","C","D","A","E","A","D"};
	
		grade(sutdent2, answer);
		grade(sutdent1, answer);
		grade(sutdent4, answer);
		grade(sutdent5, answer);
		grade(sutdent3, answer);
	}

	static void grade(String[] student, String[] answer) {
	// student를 grade 메소드의 변수로 참조
		int count = 0;
		for(int inx=0;inx<answer.length;inx++) {
			if(student[inx]==answer[inx]) {
				count +=1;
			}
		}
			System.out.println(count);
	}
}


	
