package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student hong = new Student(); //���̽��� ��� hong = Student() 
		hong.name ="ȫ�浿";
		hong.stdID ="S001";
		hong.korScore = 94;
		hong.engScore = 80;
		hong.mathScore = 89;
		
		hong.printStudentInfo();
		System.out.println();
		
		hong.changeStudentID("STU0001");
		hong.printStudentInfo();
	}
}
