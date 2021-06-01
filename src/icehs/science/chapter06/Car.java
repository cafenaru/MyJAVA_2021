package icehs.science.chapter06;

public class Car {
	String name;
	
	double driveDistance;
	int oilSize;
	
	void addOil(int oil) {
		oilSize += oil;
		System.out.println("휘발유 " + oil +"L 주유합니다");
	}
	
	void driveCar(String start, String end, double distance) {
		System.out.println(start +"에서 " + end +"까지 " + distance+"km 주행하였습니다.");
		this.driveDistance += distance;
		this.oilSize -= (double)(distance / 20);
	}
	void enableDrive() {
		double drive = this.oilSize * (double)20;
		System.out.println("주행 가능한 거리는 약 " + drive +"km입니다.");
	}
	void printCarInfo() {
		System.out.println("[" + this.name+"] 남은 기름의 양:" + this.oilSize +
				"L, 총 주행거리: " + this.driveDistance +"km");
	}
}
