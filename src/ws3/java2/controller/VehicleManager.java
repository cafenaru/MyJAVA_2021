package ws3.java2.controller;

import ws3.java2.entity.*;

public class VehicleManager {
	Vehicle[] vehicleArr= {
			new Airplane("����747",1300, 300, 4),
			new Airplane("F-15",1600,1,1),
			new Car("�׷���",180,5,10),
			new Car("����ũ", 130, 4,15),
			new Car("��Ÿ����", 150, 10,11),
			new Ship("ũ����2", 30,400, 35000 ),
			new Ship("��ƿ����", 25, 150, 15000)
	};
	
	public VehicleManager() {

		
	



	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < vehicleArr.length ; inx++) {
			vehicleArr[inx].displayInfo();
			vehicleArr[inx].setAvailable(true);;
		}	
		
		System.out.println();
	}
}

