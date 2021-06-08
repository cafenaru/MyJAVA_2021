package icehs.science.chapter09;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person();
		Student student1 = new Student();
		Teacher teacher1 = new Teacher();
		Staff staff1 = new Staff();
		person1.eat();
		person1.sleep();
		System.out.println();
		
		student1.eat();
		student1.sleep();
		student1.study();
		System.out.println();
		teacher1.eat();
		teacher1.sleep();
		teacher1.teach();
		System.out.println();
		staff1.eat();
		staff1.sleep();
		staff1.work();
	}
}
