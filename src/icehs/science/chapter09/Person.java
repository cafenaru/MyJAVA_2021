package icehs.science.chapter09;

public class Person {
	private String name;
	private String phoneNumber;
	public void eat() {
		
		System.out.println("밥을 먹어요.");
	}
	public void sleep() {
		System.out.println("잠을 자요.");
		
	}
}

class Student extends Person{
	private String department;
	
	public void study() {
		System.out.println("공부를 해요.");
	}
	
	public void eat() {
		super.eat();
		System.out.println("조별로 먹어요.");
	}
}

class Teacher extends Person{
	private String subject;
	public void teach() {
		System.out.println("가르쳐요");
	}
	
	public void eat() {
		super.eat();
		System.out.println("다같이 먹어요.");
	}
}
class Staff extends Person{
	public void work() {
		System.out.println("일을 해요.");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("사무실에서 먹어요.");
	}
}