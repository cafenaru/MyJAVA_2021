package icehs.science.chapter05;

public class MultipleFiveSumTest {
	public static void main(String[] args) {
		int inx = 1;
		int sum = 0;
		while(sum < 100) {
			int fiveNum = inx * 5;
			sum += fiveNum;
			System.out.println(inx++ +". ( +" + fiveNum +" ) " + sum);
		}
	}
}
