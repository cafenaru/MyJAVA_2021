package icehs.science.chapter07;

public class ProductTest {
	public static void main(String[] args) {
		Product coffeeMix = new Product("Ŀ�ǹͽ�", 12000, 20);
		Product paperCup = new Product("������", 3000);
		
		coffeeMix.printProductInfo();
		paperCup.printProductInfo();
	}
}
