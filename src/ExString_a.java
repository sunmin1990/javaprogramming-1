package studyJava;
/*String Builder class의 활용
 * 다음 주민등록 번호의 중간에 삽입된 -를 지우고 공백으로 채워서 출력하는
 * 프로그램을 작성해 보자. 단, StringBuilder클래스를 활용하여 빈번한
 * 문자열의 생성이 발생하지 않도록 해야한다.
 * 990925-1012999*/
public class ExString_a {

	public static void main(String[] args) {
		StringBuilder sNum = new StringBuilder("990925-1012999");
		
		sNum.delete(6,7);
		sNum.insert(6, " ");
		
		System.out.println(sNum.toString());

	}

}
