package icehs.science.chapter09;

public class Cat extends Animal {
	private String name;
	public Cat(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void hunt() {
		System.out.println("?㸦 ????????!!");
	}
	
	public void play() {
		System.out.println("???? ???̰? ???ƿ?~");
	}
	
	@Override
	public void printAnimalInfo() {
		System.out.println("?̸? : "  + this.name);
		super.printAnimalInfo();
	}

	
}
