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
		System.out.println("����: " + this.name);
		System.out.println("�й�: " + this.stdID);
		System.out.println("����: " + this.korScore);
		System.out.println("����: " + this.engScore);
		System.out.println("����: " + this.mathScore);
		System.out.println("���: " + this.calculateAverge());
		
	}
}
