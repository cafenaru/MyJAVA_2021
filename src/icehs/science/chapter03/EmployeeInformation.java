package icehs.science.chapter03;

public class EmployeeInformation {
	public static void main(String[] args) {
		String name ="홍길동";
		String enterYear= "2002";
		
		int intEnterYear = Integer.parseInt(enterYear);
		int thisYear = 2021;
		int empYear = thisYear - intEnterYear;
		
		System.out.println("이름 : " + name);
		System.out.println("입사년도: " + enterYear);
		System.out.println("근무년수: " + empYear);
	}
}
