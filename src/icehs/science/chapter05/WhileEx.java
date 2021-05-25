package icehs.science.chapter05;

public class WhileEx {
	public static void main(String[] args) {
		int sum = 0;
		int inx = 1;
		while(sum < 10) {
			sum += inx;
			System.out.println(inx++ + " : " + sum);
			//System.out.println(inx + " : " + sum);
			//inx++;                           
		}
	}
}
