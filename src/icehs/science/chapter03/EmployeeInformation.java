package icehs.science.chapter03;

public class EmployeeInformation {
	public static void main(String[] args) {
		String name ="ȫ�浿";
		String enterYear= "2002";
		
		int intEnterYear = Integer.parseInt(enterYear);
		int thisYear = 2021;
		int empYear = thisYear - intEnterYear;
		
		System.out.println("�̸� : " + name);
		System.out.println("�Ի�⵵: " + enterYear);
		System.out.println("�ٹ����: " + empYear);
	}
}