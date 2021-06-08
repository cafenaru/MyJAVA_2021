package icehs.science.chapter08;

public class ScoreArrayTest {
	public static void main(String[] args) {
		int[] scores = {93, 87, 90};//new int[3];
		String[] subjects = {"국어","영어","수학"};
//		subjects[0] = "국어"; //subjects[0] = new String("국어");
//		subjects[1] = "영어";
//		subjects[2] = "수학";
		
//		System.out.println(subjects[0] +" : " + scores[0]);
//		System.out.println(subjects[1] +" : " + scores[1]);
//		System.out.println(subjects[2] +" : " + scores[2]);
		
		
//		double average = (double)(scores[0] +scores[1]+ scores[2]) / scores.length;
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(subjects[i] +" : " + scores[i]);
			sum += scores[i];
		}
		
		double average = (double)sum / subjects.length;
		
		System.out.println("평균 : " + average);
		
	}
}
