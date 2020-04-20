package head_first_java;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	//player媛앹껜 �꽭媛쒕�� ���옣�븯湲� �쐞�븳 �씤�뒪�꽩�뒪 蹂��닔 �꽭
	
	public void startGame() {
		p1 = new Player(); //player媛앹껜 �깮�꽦 > player�씤�뒪�꽩�뒪 蹂��닔 �꽭媛쒖뿉 ��
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0; //player媛앹껜 �꽭媛쒖뿉�꽌 李띿� �닽�옄瑜� ���옣�븯湲� �쐞�븳 蹂�
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false; //�꽭 �꽑�닔媛� 李띿� �닽�옄媛� 留욌뒗吏� �뿬遺�瑜� ���옣�븯湲� �쐞�븳 蹂�
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random()*10);
		// �꽑�닔�뱾�씠 留욎텧 �닽�옄 �깮
		System.out.println("0�씠�긽 9 �씠�븯�쓽 �닽�옄瑜� 留욎떠 蹂댁꽭�슂");
		
		while(true) {
			System.out.println("留욎떠�빞 �븷 �닽�옄�뒗"+targetNumber+"�엯�땲�떎.");
			
			p1.guess(); // �꽑�닔蹂� guess硫붿냼�뱶 �샇異�
			p2.guess();
			p3.guess();
			
			
			// 媛� 媛앹껜�쓽 �씤�뒪�꽩�뒪 蹂��닔�뿉 �젒洹쇳빐 媛� �꽑�닔媛� 李띿� �닽�옄瑜� �븣�븘�깂.
			// 留욎텛湲� �쟾源뚯� �굹�삤�뒗 寃곌낵�솕
			guessp1 = p1.number;
			System.out.println("1踰� �꽑�닔媛� 李띿� �닽�옄 :"+guessp1);
		
			guessp2 = p2.number;
			System.out.println("2踰� �꽑�닔媛� 李띿� �닽�옄 :"+guessp2);
			
			guessp3 = p3.number;
			System.out.println("3踰� �꽑�닔媛� 李띿� �닽�옄 :"+guessp3);
			
			
			//媛� �꽑�닔媛� 李띿� �닽�옄 以묒뿉�꽌 留욎텣 �닽�옄媛� �엳�뒗吏� �솗�씤. 留욎텣�꽑�닔媛� �엳�쑝硫� true濡� ��
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
			//1踰�, 2踰�, 3踰� �꽑�닔以� �븳紐낆씠�씪�룄 留욎쑝硫� 異�
				System.out.println("留욎텣 �꽑�닔媛� �엳�뒿�땲�떎.");
				System.out.println("1踰� �꽑�닔 :"+p1isRight);
				System.out.println("2踰� �꽑�닔 :"+p2isRight);
				System.out.println("3踰� �꽑�닔 :"+p3isRight);
				System.out.println("寃뚯엫 �걹");
				break; // �늻援ы븯�굹 留욎톬�쑝�땲源� 寃뚯엫 �걹! (while 醫낅즺)
			} else {
				System.out.println("�떎�떆 �떆�룄�빐�빞 �빀�땲�떎.");
			} //if-else
		}//loop
	}//method
}//class
