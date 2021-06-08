package icehs.science.chapter08;

public class Chocolate {
	private String name;
	private String type;
	private int price;
	
	public Chocolate(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printCoffeeInfo() {
		System.out.println("이름 : " + this.name +", 종류 : " + this.type +", 가격 : " + this.price);
	}
	
}
