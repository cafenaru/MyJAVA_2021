package icehs.science.chapter05;

import java.util.Scanner;

public class BBumBBaiCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cha = 0;
		int sum = 0;
		int money = 0; //�պ��̸Ӵ�
		int numOfMember = 0;
		
		System.out.print("������ �������� ����Ǿ�����? : ");
		cha = scan.nextInt();
		
		System.out.println("==================================");
		System.out.println("�� ������ �� ����� �Է��ϼ���.");
		for(int i = 1; i <=cha ;i++) {
			System.out.print(i+"�� ��� : ");
			sum += scan.nextInt();
		}

		System.out.println("�� ����� " + sum +"���Դϴ�.");
		System.out.println("==================================");
		System.out.print("���� �ο����� �Է��ϼ���.");
		numOfMember = scan.nextInt();
		System.out.println("==================================");
		money = sum / numOfMember;
//		int i = 1;
//		for(; i <numOfMember; i++) {
//			sum -= money;
//			System.out.println(i+":" + money);
//		}
//		System.out.println(i+ ":" + sum);
//	
		for(int i =1 ; i<=numOfMember; i++) {
			if(i<numOfMember) {
				System.out.println(i+":" + money);
				sum-= money;
			}else {
				System.out.println(i+":" + sum);
			}
		}
	}
}
