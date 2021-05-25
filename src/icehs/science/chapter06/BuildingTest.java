package icehs.science.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		Building build1 = new Building();
		Building build2 = new Building();
		Building build3 = new Building();
		
		build1.name ="국내선타워";
		build1.address="공항동";
		build1.totalFloor = 12;
		
		build2.name ="IT타워";
		build2.address="김포동";
		build2.totalFloor = 8;
		
		build3.name ="국제선타워";
		build3.address="운서동";
		build3.totalFloor = 5;
		
		build1.moveElevator();
		build2.moveElevator();
		build3.moveElevator();
		
		build1.printBuildingInfo();
		System.out.println();
		build2.printBuildingInfo();
		System.out.println();
		build3.printBuildingInfo();
		
	}
}
