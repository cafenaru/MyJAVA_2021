package icehs.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	
	int calculateTotalPrice(int count) {
		return count * price;
	}
	
	int calculateTotalPrice(int count, int discount) {
		return count * price *(100 - discount) / 100;
	}
	
	void changeChocolateInfo(String newName, int newPrice) {
		this.name = newName;
		this.price = newPrice;
		printChocolateInfo();
	}
	
	void changeChocolateInfo(String newName, String newType, int newPrice) {
		this.name = newName;
		this.type = newType;
		this.price = newPrice;
		this.printChocolateInfo();
	}
	
	void printChocolateInfo() {
		System.out.println("이름 : " + this.name + ", 종류 : " + this.type +", 가격 : " +this.price);
	} 
}
