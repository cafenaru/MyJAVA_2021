package icehs.science.chapter06;

public class Account {
	String accName;
	String accNumber;
	int balance;//�ܾ�
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�.");
		}else {		
			this.balance += money; //balance = balance + money
		}
		this.printBalance();
	}
	
	int withdraw(int money) {
		if(money < 0) {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�.");
		}else if(money > balance) {
			System.out.println("[����]�ܾ��� �����մϴ�.");
		}else {
			this.balance -= money;
			return money;
		}
		this.printBalance();
		return 0;
	}
	
	void printAccountInfo() {
		System.out.println("���� " + this.accNumber + "( ������ : " + this.accName + " )");
		System.out.println("�ܾ� : "  + this.balance +"��");
	}
	
	void printBalance() {
		System.out.println("�ܾ� : "  + this.balance +"��");
	}
}
