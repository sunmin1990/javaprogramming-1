package GameLauncher;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	//player객체 세개를 저장하기 위한 인스턴스 변수 세
	
	public void startGame() {
		p1 = new Player(); //player객체 생성 > player인스턴스 변수 세개에 대
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0; //player객체 세개에서 찍은 숫자를 저장하기 위한 변
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false; //세 선수가 찍은 숫자가 맞는지 여부를 저장하기 위한 변
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random()*10);
		// 선수들이 맞출 숫자 생
		System.out.println("0이상 9 이하의 숫자를 맞춰 보세요");
		
		while(true) {
			System.out.println("맞춰야 할 숫자는"+targetNumber+"입니다.");
			
			p1.guess(); // 선수별 guess메소드 호출
			p2.guess();
			p3.guess();
			
			
			// 각 객체의 인스턴스 변수에 접근해 각 선수가 찍은 숫자를 알아냄.
			// 맞추기 전까지 나오는 결과화
			guessp1 = p1.number;
			System.out.println("1번 선수가 찍은 숫자 :"+guessp1);
		
			guessp2 = p2.number;
			System.out.println("2번 선수가 찍은 숫자 :"+guessp2);
			
			guessp3 = p3.number;
			System.out.println("3번 선수가 찍은 숫자 :"+guessp3);
			
			
			//각 선수가 찍은 숫자 중에서 맞춘 숫자가 있는지 확인. 맞춘선수가 있으면 true로 저
			if(guessp1==targetNumber) {
				p1isRight = true;
			}
			if(guessp2==targetNumber) {
				p2isRight = true;
			}
			if(guessp3==targetNumber) {
				p3isRight = true;
			}
			if (p1isRight||p2isRight||p3isRight) {
			//1번, 2번, 3번 선수중 한명이라도 맞으면 출
				System.out.println("맞춘 선수가 있습니다.");
				System.out.println("1번 선수 :"+p1isRight);
				System.out.println("2번 선수 :"+p2isRight);
				System.out.println("3번 선수 :"+p3isRight);
				System.out.println("게임 끝");
				break; // 누구하나 맞췄으니까 게임 끝! (while 종료)
			} else {
				System.out.println("다시 시도해야 합니다.");
			} //if-else
		}//loop
	}//method
}//class
