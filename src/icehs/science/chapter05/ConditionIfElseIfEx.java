package icehs.science.chapter05;

public class ConditionIfElseIfEx {
	public static void main(String[] args) {
		int age = 15;
		
		if(age >= 19) { 
			System.out.println("�����Դϴ�.");
			System.out.println("�����ϼ���.");
		}else if(age >=13) {
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("���ݸ� ��ٸ�����.");
		}else {
			System.out.println("��� �Դϴ�.");
			System.out.println("������ ������.");
		}
		int year = 2021;
		if(year <= 2000) {
			System.out.println("2õ��밡 �ƴմϴ�.");
			System.out.println("2021��� ���̰� ���� ���׿�.");
			System.out.println("�����մϴ�..");
		}
	}
}
