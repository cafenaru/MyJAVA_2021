package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat(3, "페르시안", "야옹이");
		cat1.printCatInfo();
		//cat1.printAnimalInfo();
		cat1.run();
		cat1.hunt();
		cat1.play();
	}
}
