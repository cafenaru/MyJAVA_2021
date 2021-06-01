package icehs.science.chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car scienceCar = new Car();
		scienceCar.name ="ICE 카~";
		scienceCar.oilSize = 5;
		scienceCar.driveDistance = 140;
		scienceCar.printCarInfo();
		scienceCar.addOil(10);
		scienceCar.printCarInfo();
		scienceCar.driveCar("IT센터", "인천공항", 10.17);
		scienceCar.printCarInfo();
		scienceCar.driveCar("인천공항", "곤지암리조트", 60.21);
		scienceCar.printCarInfo();
		
		scienceCar.enableDrive();
		
	}
}
