package icehs.science.chapter10.cars;

public class Texi extends Car{
	private int maxNum;

	public int getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
		System.out.println("�ý� ���� : " + this.maxNum +"��");
	}
	@Override
	public void go(int distance) {
		System.out.println("�ýø� Ÿ�� " + distance +"km �̵��մϴ�.");
	}
}
