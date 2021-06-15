package icehs.science.chapter09;

public class FundAccount extends Account {
	private double earningRate;

	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}

	@Override
	public void openAccount() {
		System.out.println("���¸� �����մϴ�.");
		System.out.println("�ݵ� ���� ��ȣ : " + super.getNumber());
		System.out.println("������ : " + super.getName());
		System.out.println("�ܾ� : " + super.getBalance() +"��");
	}
	
	
	
}
