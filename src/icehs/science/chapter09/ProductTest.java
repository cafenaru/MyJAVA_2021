package icehs.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product pro1 = new Product("�뵹��", 450000, 8);
		
		System.out.println("=======��ǰ ����=======");
		pro1.printProductInfo();
		
		System.out.println("=====================");
		Television tv1 = new Television("�ó׸� TV", 3500000,10, "ȭ��ũ�� 151cm");
		tv1.printProductInfo();
		System.out.println("��� : " + tv1.getDescription());
		
		System.out.println();
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		System.out.println();
		pro1.setDiscountRate(15);
		tv1.setDiscountRate(15);
		
		System.out.println(pro1.getName() +" �ǸŰ� : " + pro1.calculateDiscountRate());
		System.out.println(tv1.getName() + " �ǸŰ� : " + tv1.calculateDiscountRate());
	}
}
