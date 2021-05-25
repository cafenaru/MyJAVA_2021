package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	void moveElevator() {
		System.out.println(this.totalFloor + "층까지 엘리베이터를 운행합니다.");
	}
	
	void changeAddress(String newAddress) {
		this.address = newAddress;
	}
	
	void printBuildingInfo() {
		System.out.println("빌딩명 : " + this.name);
		System.out.println("주소 :" + this.address);
		System.out.println("층수 : " + this.totalFloor);
	}
}
