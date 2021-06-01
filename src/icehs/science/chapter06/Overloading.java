package icehs.science.chapter06;

public class Overloading {
	void addition(double num11, int num22) {
		System.out.println(num11 + num22);
	}
	
	void addition(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	void addition(String str1, String str2) {
		System.out.println(str1 + str2);
	}
}
