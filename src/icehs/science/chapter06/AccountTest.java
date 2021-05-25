package icehs.science.chapter06;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.accName = "홍길동";
		acc1.accNumber = "123-456789";
		acc1.balance = 10000;

		acc1.printAccountInfo();
		System.out.println("20000원 입금합니다.");
		acc1.deposit(20000);
		System.out.println("-20000원 입금합니다.");
		acc1.deposit(-20000);
		System.out.println("-20000원 출금합니다.");
		acc1.withdraw(-20000);
		System.out.println("45000원을 출금합니다.");
		int money = acc1.withdraw(45000);		
	}
}
