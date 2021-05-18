package icehs.science.chapter05;

public class SwitchScoreTest {
	public static void main(String[] args) {
		int score = 87;
		switch(score/10) {
		case 10 :
		case 9 : System.out.println("A학점입니다.");break;
		case 8 : System.out.println("B학점입니다.");break; 
		case 7 : System.out.println("C학점입니다."); break;
		case 6 : System.out.println("D학점입니다."); break;
		default: System.out.println("F학점이거나 학점을 알 수 없습니다.");
		}
	}
}
