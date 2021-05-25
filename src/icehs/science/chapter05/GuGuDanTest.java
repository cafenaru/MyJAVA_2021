package icehs.science.chapter05;

public class GuGuDanTest {
	public static void main(String[] args) {
		for(int dan = 1; dan <10; dan++) {
//			if(dan == 5) {
//				continue;
//			}
			for(int i = 2; i < 10; i++) {
				//if(i == 5) continue;
				//System.out.print(dan + " * " + i +" = " + (dan * i) + "\t");
				System.out.print(i + " * " + dan +" = " + (dan * i) + "\t");
				
			}
			System.out.println();
		}
	}
}
