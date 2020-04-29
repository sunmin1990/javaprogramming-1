package Study_workshop;

//���� Ŭ���� ������ ������ �����ڸ� �����غ���. ���� ��� ���踦 ����Ͽ� �� Ŭ���� ���� �ʿ��� �����ڸ� �����ؾ��Ѵ�. 

class Car { //�⺻ ���� �ڵ���
	int gasolineGauge; //���ָ� �ܿ��� 
	public Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car { // ����	�긮�� �ڵ���
	int electricGauge; //���� ���͸� �ܿ���
	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar { // ���̺긮�� ����ī
	int waterGauge; //������ ��ȯ�� ���� �ܿ���
	public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
		super(gasolineGauge,electricGauge);
		this.waterGauge = waterGauge;
	}
	
	public void showCurrentGauge() {  // ��� ����� �ִ� �޼��� 
		System.out.println("�ܿ� ���ָ�:" + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ:" + electricGauge);
		System.out.println("�ܿ� ���ͷ�:" + waterGauge);
	}
}

public class HybridWaterCar2 { // static �� ����ϱ� �����µ� �� ������ �ϴ���? 
	public static void main(String[] args) {
			HybridWaterCar c = new HybridWaterCar(10, 20, 30); // HybridWaterCar
			c.showCurrentGauge();
	}
}


