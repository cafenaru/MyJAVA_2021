package icehs.science.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee maki = new Coffee();
		
		ame.kind = "�Ƹ޸�ī��";
		ame.price= 3500;
		
		latte.kind ="ī���";
		latte.price = 4000;
		
		maki.kind = "�����ƶ�";
		maki.price = 4500;
		
		ame.printCoffeeInfo();
		latte.printCoffeeInfo();
		maki.printCoffeeInfo();
		System.out.println("�� �ݾ� :" + (ame.price+latte.price+ maki.price) + "��");
	}
}
