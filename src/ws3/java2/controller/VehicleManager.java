package ws3.java2.controller;

import ws3.java2.entity.*;

public class VehicleManager {
	Vehicle[] vehicleArr= {
			new Airplane("보잉747",1300, 300, 4),
			new Airplane("F-15",1600,1,1),
			new Car("그랜저",180,5,10),
			new Car("스파크", 130, 4,15),
			new Car("스타렉스", 150, 10,11),
			new Ship("크루즈2", 30,400, 35000 ),
			new Ship("노틸러스", 25, 150, 15000)
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

