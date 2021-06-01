package icehs.science.chapter06;

public class Car {
	String name;
	
	double driveDistance;
	int oilSize;
	
	void addOil(int oil) {
		oilSize += oil;
		System.out.println("�ֹ��� " + oil +"L �����մϴ�");
	}
	
	void driveCar(String start, String end, double distance) {
		System.out.println(start +"���� " + end +"���� " + distance+"km �����Ͽ����ϴ�.");
		this.driveDistance += distance;
		this.oilSize -= (double)(distance / 20);
	}
	void enableDrive() {
		double drive = this.oilSize * (double)20;
		System.out.println("���� ������ �Ÿ��� �� " + drive +"km�Դϴ�.");
	}
	void printCarInfo() {
		System.out.println("[" + this.name+"] ���� �⸧�� ��:" + this.oilSize +
				"L, �� ����Ÿ�: " + this.driveDistance +"km");
	}
}
