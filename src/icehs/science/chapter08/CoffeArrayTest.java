package icehs.science.chapter08;

public class CoffeArrayTest {
	public static void main(String[] args) {
		Chocolate[] chocos = {
				new Chocolate("�Ƹ�����", "��ũ", 2200),
				new Chocolate("ī�� Ű����", "��ũ", 2500),
				new Chocolate("Ʈ���� ���", "ȭ��Ʈ", 2300)
		};
		
//		chocos[0] = new Chocolate("�Ƹ�����", "��ũ", 2200);
//		chocos[1] = new Chocolate("ī�� Ű����", "��ũ", 2500);
//		chocos[2] = new Chocolate("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
//		
//		chocos[0].printCoffeeInfo();
//		chocos[1].printCoffeeInfo();
//		chocos[2].printCoffeeInfo();
		int sum = 0;
		for(int i = 0 ; i < chocos.length; i++) {
			if((chocos[i].getType()).equals("ȭ��Ʈ")) {
				int tempPrice = (int)(chocos[i].getPrice() * 0.8);
				sum += tempPrice; // sum += (int)(chocos[i].getPrice() * 0.8);
			}else {
				sum += chocos[i].getPrice();
			}
			
			chocos[i].printCoffeeInfo();
		}
		
		System.out.println("�ϳ��� �������� �� �� ���� : " + sum);
	}
}
