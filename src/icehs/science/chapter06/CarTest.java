package icehs.science.chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car scienceCar = new Car();
		scienceCar.name ="ICE ī~";
		scienceCar.oilSize = 5;
		scienceCar.driveDistance = 140;
		scienceCar.printCarInfo();
		scienceCar.addOil(10);
		scienceCar.printCarInfo();
		scienceCar.driveCar("IT����", "��õ����", 10.17);
		scienceCar.printCarInfo();
		scienceCar.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		scienceCar.printCarInfo();
		
		scienceCar.enableDrive();
		
	}
}
