package icehs.science.chapter08;

public class CoffeArrayTest {
	public static void main(String[] args) {
		Chocolate[] chocos = {
				new Chocolate("아마도라", "다크", 2200),
				new Chocolate("카페 키리쉬", "다크", 2500),
				new Chocolate("트피플 블랑", "화이트", 2300)
		};
		
//		chocos[0] = new Chocolate("아마도라", "다크", 2200);
//		chocos[1] = new Chocolate("카페 키리쉬", "다크", 2500);
//		chocos[2] = new Chocolate("트피플 블랑", "화이트", 2300);
		
//		
//		chocos[0].printCoffeeInfo();
//		chocos[1].printCoffeeInfo();
//		chocos[2].printCoffeeInfo();
		int sum = 0;
		for(int i = 0 ; i < chocos.length; i++) {
			if((chocos[i].getType()).equals("화이트")) {
				int tempPrice = (int)(chocos[i].getPrice() * 0.8);
				sum += tempPrice; // sum += (int)(chocos[i].getPrice() * 0.8);
			}else {
				sum += chocos[i].getPrice();
			}
			
			chocos[i].printCoffeeInfo();
		}
		
		System.out.println("하나씩 구매했을 때 총 가격 : " + sum);
	}
}
