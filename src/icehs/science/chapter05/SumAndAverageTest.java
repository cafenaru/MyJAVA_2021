package icehs.science.chapter05;

public class SumAndAverageTest {
 public static void main(String[] args) {
	int sum = 0;
	double average = 0;
	int i = 1;
	for( ; i <= 500; i++ ) {
			sum += i;
	}
	average = (double)sum / (i-1);
	System.out.println("?հ? :" + sum);
	System.out.println("???? : "  + average);
 }
}
