package com.april29;
//���Ѱ�?
class Car {
	int gasolineGauge; //���ָ� �ܿ���
	public Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}
}
class HybridCar extends Car { //���̺긮��
	int electricGauge; //���� ���͸� �ܿ���
	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}
class HybridWaterCar extends HybridCar {
	int waterGauge;
	public HybridWaterCar(int gasolineGauge, int electricGauge,int waterGauge) {
		super(gasolineGauge,electricGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ� : " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electricGauge);
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
}

public class S14_1 {
	public static void main(String[] args) {
		HybridWaterCar h = new HybridWaterCar(1,1,1);
		h.showCurrentGauge();
	}

}
