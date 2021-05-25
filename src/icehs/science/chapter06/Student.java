package icehs.science.chapter06;

public class Student {
	String name;
	String stdID;
	int korScore;
	int engScore;
	int mathScore;
	
	double calculateAverge() {
		int sum = korScore + engScore + mathScore ;
		double average = (double)sum/3;
		return average;
	}
	
	void changeStudentID(String newStdID) {
		stdID = newStdID;
	}
	void printStudentInfo() {
		System.out.println("성명: " + this.name);
		System.out.println("학번: " + this.stdID);
		System.out.println("국어: " + this.korScore);
		System.out.println("영어: " + this.engScore);
		System.out.println("수학: " + this.mathScore);
		System.out.println("평균: " + this.calculateAverge());
		
	}
}
