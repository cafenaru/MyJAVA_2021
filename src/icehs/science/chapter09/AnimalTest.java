package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat(3, "�丣�þ�", "�߿���");
		cat1.printAnimalInfo();
		
		cat1.run();
		cat1.hunt();
		cat1.play();
		System.out.println();
		
		Dog dog1 = new Dog(2, "�ú������㽺Ű", "�۸���");
		dog1.printAnimalInfo();
		dog1.run();
		dog1.hunt();
	}
}
