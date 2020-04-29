package Study_workshop;

//다음 클래스 각각에 적절한 생성자를 삽입해보자. 물론 상속 관계를 고려하여 각 클래스 별로 필요한 생성자를 삽입해야한다. 

class Car { //기본 연료 자동차
	int gasolineGauge; //가솔린 잔여랑 
	public Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car { // 하이	브리드 자동차
	int electricGauge; //전기 배터리 잔여량
	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar { // 하이브리드 워터카
	int waterGauge; //에너지 전환용 물의 잔여량
	public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
		super(gasolineGauge,electricGauge);
		this.waterGauge = waterGauge;
	}
	
	public void showCurrentGauge() {  // 출력 기능이 있는 메서드 
		System.out.println("잔여 가솔린:" + gasolineGauge);
		System.out.println("잔여 전기량:" + electricGauge);
		System.out.println("잔여 워터량:" + waterGauge);
	}
}

public class HybridWaterCar2 { // static 을 지우니까 나오는데 왜 지워야 하는지? 
	public static void main(String[] args) {
			HybridWaterCar c = new HybridWaterCar(10, 20, 30); // HybridWaterCar
			c.showCurrentGauge();
	}
}


