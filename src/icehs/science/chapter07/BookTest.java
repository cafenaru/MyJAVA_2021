package icehs.science.chapter07;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title ="데이터과학";
		book1.price = 10000;
		
		Book book2 = new Book("해리포터", 8000);
	}
}
