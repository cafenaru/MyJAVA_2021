package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반의 학생수는 : ");
		int numOfStudents = scan.nextInt();
		int sum = 0;
		double average = 0;
		
		for(int i = 1; i <= numOfStudents; i++) {
			System.out.print(i +"번 점수 : ");
			sum += scan.nextInt(); //sum = sum + scan.nextInt()
		}
		average = (double)sum / numOfStudents;
		
		System.out.println("===================================");
		System.out.println(numOfStudents+"명의 총점 : " + sum);
		System.out.println(numOfStudents+"명의 평균 : " + average +"점");
	
	}
}
