package icehs.science.chapter08;

public class AccountCaculatorTest {
	public static void main(String[] args) {
		Account[] acc= new Account[5];
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account("111-2222-555"+(i+1),10000 * (i + 1), 4.5);
			acc[i].printAccountInfo();
		}
		
		System.out.println("이율을 변경합니다.");
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterestRate(3.7);
			acc[i].calculateRate();
			System.out.println("계좌번호 :" + acc[i].getNumber() + 
					" / 이율 : " +acc[i].getInterestRate() + "% / " +acc[i].getBalance());
		
			
		}
	}
	
}
