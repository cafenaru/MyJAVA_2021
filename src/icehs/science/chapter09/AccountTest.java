package icehs.science.chapter09;

public class AccountTest {
	public static void main(String[] args) {
		FundAccount[] fundAcc = {
				new FundAccount("111-2222","ȫ�浿", 5000000,4.7),
				new FundAccount("666-7777", "ȫ���", 1000000,2.9)
				
		};

		for(int i = 0; i <fundAcc.length; i++ ) {
			fundAcc[i].openAccount();
			System.out.println("���ͷ� : " +fundAcc[i].getEarningRate() +"%");
			System.out.println("������ �߻��߽��ϴ�.");
			System.out.println();
		}
		
		for(FundAccount fundA: fundAcc) {
			fundA.openAccount();
			System.out.println("���ͷ� : " +fundA.getEarningRate() +"%");
			System.out.println("������ �߻��߽��ϴ�.");
		}


				
	}
}
