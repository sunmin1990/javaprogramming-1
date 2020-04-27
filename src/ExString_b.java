package studyJava;
/* String class의 활용
 * 다음 주민등록번호의 중간에 삽입된 - 를 지우고 공백으로 채워서 출력하는
 * 프로그램을 작성해 보자
 * 990925-1012999*/
public class ExString_b {

	public static void main(String[]args) {
		String a = "990925-1012999";
		
		String aa = a.substring(0, 6);
		String bb = a.substring(7);
				
		String b = (aa.concat(" ")).concat(bb);
		System.out.println(b);
	}
}
