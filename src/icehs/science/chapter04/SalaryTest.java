package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		int monthSalary = 1000000;
		int annualBonus = monthSalary * 20 / 100 * 4;
		int monthTax = monthSalary * 10 / 100;
		int annualBonusTax = annualBonus * 55 / 1000;
		int annualSalary = monthSalary * 12;
		int annualSalaryTax = monthTax * 12;
		int annualSalaryAfterTax = annualSalary - annualSalaryTax;
		int annualBonusAfterTax = annualBonus - annualBonusTax;
		
		int annualIncome = annualSalaryAfterTax + annualBonusAfterTax;
		
		System.out.println("���� : " + annualSalary + ", " + "���� ���� : " + annualSalaryAfterTax);
		System.out.println("���ʽ� : " + annualBonus + ", " + "���� ���ʽ� : " + annualBonusAfterTax);
		
		System.out.println("���޾� : " + annualIncome);
	}
}
