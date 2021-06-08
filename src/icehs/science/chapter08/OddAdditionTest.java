package icehs.science.chapter08;

public class OddAdditionTest {
	public static void main(String[] args) {
		int[] numbers= {10, 21, 33, 42, 51, 64, 79, 80};
		int OddSum = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0) {
				OddSum += numbers[i];
				System.out.print(numbers[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("훌수들의 합계는 " + OddSum +"입니다.");
	}
}
