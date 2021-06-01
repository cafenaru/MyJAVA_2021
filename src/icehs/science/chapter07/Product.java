package icehs.science.chapter07;

public class Product {
	String name;
	int price;
	int discount;
	
	public Product(String name, int price, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	void printProductInfo() {
		System.out.println("=====" + this.name +"=====");
		System.out.println("���� : " + this.price +"��");
		if(discount > 0) {
			System.out.println("������ : " + this.discount +"%");
		}else {
			System.out.println("������ : �������� ����");
		}
	}
			
			
}
