package icehs.science.chapter03;

public class StatisticsCastingEx {
	public static void main(String[] args) {
		double lottoProbability = 0.000001235;
		long population = 6973738433L;
		
		int intLottoProbability = (int)lottoProbability;
		int intPopulation = (int)population;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lottoProbability);
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + intLottoProbability);
		
		System.out.println("�� ������ �α� �� : " + population);
		System.out.println("�� ������ �α� �� int ��ȯ : " + intPopulation);
		
	}
}
