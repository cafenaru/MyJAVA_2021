package icehs.science.chapter08;

public class AccountCaculatorTest {
	public static void main(String[] args) {
		Account[] acc= new Account[5];
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account("111-2222-555"+(i+1),10000 * (i + 1), 4.5);
			acc[i].printAccountInfo();
		}
		
		System.out.println("������ �����մϴ�.");
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterestRate(3.7);
			acc[i].calculateRate();
			System.out.println("���¹�ȣ :" + acc[i].getNumber() + 
					" / ���� : " +acc[i].getInterestRate() + "% / " +acc[i].getBalance());
		
			
		}
	}
	
}
