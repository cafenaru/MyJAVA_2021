package icehs.science.chapter08;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] books = {
			new Book("������ ��", 16000),
			new Book("�� ��ó", 12000),
			new Book("7�� ��", 13500)
		};
		
		for(int i = 0; i< books.length; i++) {
			books[i].printBookInfo();
		}
		
		System.out.println();
		
		for(Book myBook : books) {
			myBook.printBookInfo();
		}
	}
}
