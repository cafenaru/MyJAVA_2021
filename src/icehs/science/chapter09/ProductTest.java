package icehs.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product pro1 = new Product("통돌이", 450000, 8);
		
		System.out.println("=======제품 정보=======");
		pro1.printProductInfo();
		
		System.out.println("=====================");
		Television tv1 = new Television("시네마 TV", 3500000,10, "화면크기 151cm");
		tv1.printProductInfo();
		System.out.println("비고 : " + tv1.getDescription());
		
		System.out.println();
		System.out.println("[공지] 할인율을 모두 15%로 변경합니다.");
		System.out.println();
		pro1.setDiscountRate(15);
		tv1.setDiscountRate(15);
		
		System.out.println(pro1.getName() +" 판매가 : " + pro1.calculateDiscountRate());
		System.out.println(tv1.getName() + " 판매가 : " + tv1.calculateDiscountRate());
	}
}
