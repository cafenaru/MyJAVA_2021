package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	void moveElevator() {
		System.out.println(this.totalFloor + "������ ���������͸� �����մϴ�.");
	}
	
	void changeAddress(String newAddress) {
		this.address = newAddress;
	}
	
	void printBuildingInfo() {
		System.out.println("������ : " + this.name);
		System.out.println("�ּ� :" + this.address);
		System.out.println("���� : " + this.totalFloor);
	}
}
