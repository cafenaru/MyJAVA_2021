package icehs.science.chapter05;

public class NumberCheckTest {
	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 3;
		int result = number1 * number2;
		if(result >= 0 && result < 10) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result < 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result >= 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� �� �̻� �Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		number1 = 4;
		number2 =5;
		result = number1 * number2;
		if(result >= 0 && result < 10) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result < 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result >= 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� �� �̻� �Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		number1 = 23;
		number2 = 96;
		result = number1 * number2;
		if(result >= 0 && result < 10) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result < 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result >= 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� �� �̻� �Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		number1 = 4;
		number2 = -3;
		result = number1 * number2;
		if(result >= 0 && result < 10) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result < 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� ���Դϴ�.");
		}else if(result >= 100) {
			System.out.println(number1 +" * " + number2 + ": ���ڸ� �� �̻� �Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		
		
	}
}
