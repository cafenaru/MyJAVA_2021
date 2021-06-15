package icehs.science.chapter10.cars;

public class CarTest {
	public static void main(String[] args) {
		Car[] cars = {
				new Texi(),
				new Truck()
		};
		Washer car = new Car();
		car.wash();
		System.out.print("택시 : ");
		cars[0].wash();
		System.out.print("트럭 : ");
		cars[1].wash();
		
//		cars[0].go(20);
//		
//		cars[0].setOilSize(10);
//		Texi texi = (Texi)cars[0];
//		texi.setMaxNum(4);
//		//((Texi)cars[0]).setMaxNum(4);
//		
//		cars[1].go(30);
//		cars[1].setOilSize(10);
//		((Truck)cars[1]).setMaxWeight(100);
	}
}
