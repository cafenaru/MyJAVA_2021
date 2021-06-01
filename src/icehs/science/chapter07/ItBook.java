package icehs.science.chapter07;

public class ItBook {
	static int objectCount  = 0;
	private String title;
	private int price;
	private double discount;
	
	public ItBook(String title, int price, double discount) {
		super();
		objectCount++;
		this.title = title;
		this.price = price;
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	private int calcResult() {
		return (int)(this.price *(100-discount) / 100);
	}
	
	public void printBookInfo() {
		System.out.println("제목 : " + this.title +", 정가 : " + this.price +", 할인률 : " +this.discount+ "%, 할인가 : " + calcResult() +"원");
	}
}
