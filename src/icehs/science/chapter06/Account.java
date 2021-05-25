package icehs.science.chapter06;

public class Account {
	String accName;
	String accNumber;
	int balance;//잔액
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("[에러]금액은 음수를 입력할 수 없습니다.");
		}else {		
			this.balance += money; //balance = balance + money
		}
		this.printBalance();
	}
	
	int withdraw(int money) {
		if(money < 0) {
			System.out.println("[에러]금액은 음수를 입력할 수 없습니다.");
		}else if(money > balance) {
			System.out.println("[에러]잔액이 부족합니다.");
		}else {
			this.balance -= money;
			return money;
		}
		this.printBalance();
		return 0;
	}
	
	void printAccountInfo() {
		System.out.println("계좌 " + this.accNumber + "( 예금주 : " + this.accName + " )");
		System.out.println("잔액 : "  + this.balance +"원");
	}
	
	void printBalance() {
		System.out.println("잔액 : "  + this.balance +"원");
	}
}
