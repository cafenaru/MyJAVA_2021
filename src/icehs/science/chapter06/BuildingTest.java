package icehs.science.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		Building build1 = new Building();
		Building build2 = new Building();
		Building build3 = new Building();
		
		build1.name ="������Ÿ��";
		build1.address="���׵�";
		build1.totalFloor = 12;
		
		build2.name ="ITŸ��";
		build2.address="������";
		build2.totalFloor = 8;
		
		build3.name ="������Ÿ��";
		build3.address="���";
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
