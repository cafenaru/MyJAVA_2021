package icehs.science.chapter07;

public class PublicationTest {
	public static void main(String[] args) {
		Publication pub1 = new Publication();
		System.out.println("====���ǹ� ������ �����մϴ�.=====");
		pub1.setPrice(-1500);
		pub1.setPage(-200);
		pub1.setPrice(5000);
		pub1.setPage(300);
		pub1.setTitle("��ȭ �ﱹ��");
		pub1.printPublicationInfo();

	}
}
