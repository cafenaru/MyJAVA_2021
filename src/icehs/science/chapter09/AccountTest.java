package icehs.science.chapter09;

public class AccountTest {
	public static void main(String[] args) {
		FundAccount[] fundAcc = {
				new FundAccount("111-2222","홍길동", 5000000,4.7),
				new FundAccount("666-7777", "홍길순", 1000000,2.9)
				
		};

		for(int i = 0; i <fundAcc.length; i++ ) {
			fundAcc[i].openAccount();
			System.out.println("수익률 : " +fundAcc[i].getEarningRate() +"%");
			System.out.println("수익이 발생했습니다.");
			System.out.println();
		}
		
		for(FundAccount fundA: fundAcc) {
			fundA.openAccount();
			System.out.println("수익률 : " +fundA.getEarningRate() +"%");
			System.out.println("수익이 발생했습니다.");
		}


				
	}
}
