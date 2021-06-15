package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat(3, "其福矫救", "具克捞");
		cat1.printAnimalInfo();
		
		cat1.run();
		cat1.hunt();
		cat1.play();
		System.out.println();
		
		Dog dog1 = new Dog(2, "矫海府救倾胶虐", "港港捞");
		dog1.printAnimalInfo();
		dog1.run();
		dog1.hunt();
	}
}
