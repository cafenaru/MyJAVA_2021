package icehs.science.chapter05;

public class ValuationBasisTest {
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 20;
		int thirdNum = 40;
		int forthNum = 50;
		int fifthNum = 80;
		
		double result = firstNum * secondNum / 2 * 0.6;
		result += (thirdNum + forthNum) / 2 * 0.13;
		result += fifthNum * 0.27;
		
		System.out.println("평가 점수 : " + result);
		
		if(result > 100 || result < 0) {
			System.out.println("오류입니다.");
		}else if(result >= 95) {
			System.out.println("Special Class입니다.");
		}else if(result >= 90) {
			System.out.println("Gold Class입니다.");
		}else if(result >= 85) {
			System.out.println("Silver Class입니다.");
		}else if(result >= 00) {
			System.out.println("Bronze Class입니다.");
		}else {
			System.out.println("Member Class입니다.");
		}
		
	}
}
