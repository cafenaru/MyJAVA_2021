package icehs.science.chapter06;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.accName = "ȫ�浿";
		acc1.accNumber = "123-456789";
		acc1.balance = 10000;

		acc1.printAccountInfo();
		System.out.println("20000�� �Ա��մϴ�.");
		acc1.deposit(20000);
		System.out.println("-20000�� �Ա��մϴ�.");
		acc1.deposit(-20000);
		System.out.println("-20000�� ����մϴ�.");
		acc1.withdraw(-20000);
		System.out.println("45000���� ����մϴ�.");
		int money = acc1.withdraw(45000);		
	}
}
