package icehs.science.chapter10.animals;

public class AnimalTest {
	public static void main(String[] args) {
		Bird eagle = new Bird("������", 3, "������ ��");
		System.out.println(eagle.getKind() + "(" + eagle.getAge() +"��) : " + eagle.getHabitat());
		eagle.spreadWings();
		eagle.fly();
	}
}
