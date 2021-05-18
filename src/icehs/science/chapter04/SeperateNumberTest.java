package icehs.science.chapter04;

public class SeperateNumberTest {
	public static void main(String[] args) {
		int number = 456;
		int number100 = number / 100;
		int number10 = (number % 100) / 10;
		int number1 = number % 10; 
		System.out.println("숫자 : " + number);
		System.out.println("백의 자리 수 : " + number100);
		System.out.println("십의 자리 수 : "  + number10);
		System.out.println("일의 자리 수 : " + number1);
		
	}
}
