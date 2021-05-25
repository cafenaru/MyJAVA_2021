package icehs.science.chapter05;

import java.util.Scanner;

public class BBumBBaiCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cha = 0;
		int sum = 0;
		int money = 0; //뿜빠이머니
		int numOfMember = 0;
		
		System.out.print("모임은 몇차까지 진행되었나요? : ");
		cha = scan.nextInt();
		
		System.out.println("==================================");
		System.out.println("각 차수에 쓴 비용을 입력하세요.");
		for(int i = 1; i <=cha ;i++) {
			System.out.print(i+"차 비용 : ");
			sum += scan.nextInt();
		}

		System.out.println("총 비용은 " + sum +"원입니다.");
		System.out.println("==================================");
		System.out.print("모임 인원수를 입력하세요.");
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
