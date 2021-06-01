package icehs.science.chapter07;

public class Book {
	String title;
	String author;
	int price;
	
	Book(){
		
	}
	Book(String title) {
		this.title = title;
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	Book(String title, String author){
		this(title);
		this.author = author;
	}
	
	Book(String title, String author, int price){
		this(title, author);
		this.price = price;
	}
	
	public void printBookInfo() {
		System.out.println(this.title);
		System.out.println(this.price);
	}
}
