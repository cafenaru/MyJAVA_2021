package icehs.science.chapter10.animals;

public class AnimalTest {
	public static void main(String[] args) {
		Bird eagle = new Bird("독수리", 3, "바위산 등");
		System.out.println(eagle.getKind() + "(" + eagle.getAge() +"살) : " + eagle.getHabitat());
		eagle.spreadWings();
		eagle.fly();
	}
}
