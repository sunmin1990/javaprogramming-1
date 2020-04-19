package GameLauncher;

public class Player {
	int number=0; // Player 초기화 변수
	
	public void guess() {
		number = (int) (Math.random()*10);
		// 난수 생성 메소드 
	}
}
