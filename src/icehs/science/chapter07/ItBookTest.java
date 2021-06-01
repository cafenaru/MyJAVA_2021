package icehs.science.chapter07;

public class ItBookTest {
	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		System.out.println(sql.objectCount);
		ItBook java = new ItBook("Java 2.0", 28000, 3.2);
		System.out.println(java.objectCount);
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9);
		System.out.println(jsp.objectCount);
		System.out.println(sql.objectCount);
		System.out.println(ItBook.objectCount);
		sql.printBookInfo();
		java.printBookInfo();
		jsp.printBookInfo();
		
		System.out.println("SQL Plus 정가와 할인율을 변경합니다.");
		sql.setPrice(55000);
		sql.setDiscount(9.5);
		sql.printBookInfo();
		
		System.out.println("Java 2.0 정가를 변경합니다.");
		java.setPrice(33000);
		java.printBookInfo();
		
		System.out.println("JSP Serlvet의 제목과 할인율을 변경합니다.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscount(12.6);
		jsp.printBookInfo();
	}
}
