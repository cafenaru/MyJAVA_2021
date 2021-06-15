package icehs.science.chapter10;

public class Person {
	private String name;
	private String phoneNumber;
	public void eat() {
		
		System.out.println("���� �Ծ��.");
	}
	public void sleep() {
		System.out.println("���� �ڿ�.");
		
	}
}

class Student extends Person{
	private String department;
	
	public void study() {
		System.out.println("���θ� �ؿ�.");
	}
	
	public void eat() {
		super.eat();
		System.out.println("������ �Ծ��.");
	}
}

class Teacher extends Person{
	private String subject;
	public void teach() {
		System.out.println("�����Ŀ�");
	}
	
	public void eat() {
		super.eat();
		System.out.println("�ٰ��� �Ծ��.");
	}
}
class Staff extends Person{
	public void work() {
		System.out.println("���� �ؿ�.");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("�繫�ǿ��� �Ծ��.");
	}
}