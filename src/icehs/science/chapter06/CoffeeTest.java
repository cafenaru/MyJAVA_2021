package icehs.science.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee maki = new Coffee();
		
		ame.kind = "아메리카노";
		ame.price= 3500;
		
		latte.kind ="카페라떼";
		latte.price = 4000;
		
		maki.kind = "마끼아또";
		maki.price = 4500;
		
		ame.printCoffeeInfo();
		latte.printCoffeeInfo();
		maki.printCoffeeInfo();
		System.out.println("총 금액 :" + (ame.price+latte.price+ maki.price) + "원");
	}
}
