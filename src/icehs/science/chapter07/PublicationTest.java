package icehs.science.chapter07;

public class PublicationTest {
	public static void main(String[] args) {
		Publication pub1 = new Publication();
		System.out.println("====출판물 정보를 세팅합니다.=====");
		pub1.setPrice(-1500);
		pub1.setPage(-200);
		pub1.setPrice(5000);
		pub1.setPage(300);
		pub1.setTitle("만화 삼국지");
		pub1.printPublicationInfo();

	}
}
