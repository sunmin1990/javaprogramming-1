package kcci.enumerate;

public class Enum {

	enum Season{ //그룹화 시켜서 쓰고싶데
		WINTER, SPRING, SUMMER, FALL
	}
	
	enum Light{ //예를들면 스위치 온오프 같은거.
		ON, OFF
	}
	public static void main(String[]args) {
		for (Season s:Season.values()) {
			System.out.println(s);
		}
		Season s = Season.WINTER;
		Season s2 = Season.SPRING;
		System.out.println(s);
		System.out.println(s2);
		System.out.println(Season.valueOf("WINTER").ordinal());
		// 윈터가 제일 처음에 있으니까 윈터의 위치값(default)0 반환
	}
}
