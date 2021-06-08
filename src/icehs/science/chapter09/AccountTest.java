package icehs.science.chapter09;

public class AccountTest {
	public static void main(String[] args) {
		FundAccount fundAcc = new FundAccount("111-2222","홍길동", 5000000,4.7);
		fundAcc.openAccount();
		System.out.println("수익률 : " +fundAcc.getEarningRate() +"%");
		System.out.println("수익이 발생했습니다.");
				
	}
}
