package icehs.science.chapter09;

public class AccountTest {
	public static void main(String[] args) {
		FundAccount fundAcc = new FundAccount("111-2222","ȫ�浿", 5000000,4.7);
		fundAcc.openAccount();
		System.out.println("���ͷ� : " +fundAcc.getEarningRate() +"%");
		System.out.println("������ �߻��߽��ϴ�.");
				
	}
}
