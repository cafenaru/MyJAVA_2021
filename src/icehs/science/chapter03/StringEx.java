package icehs.science.chapter03;

public class StringEx {
	public static void main(String[] args) {
		String name = "구병국";
		String name2 = new String("과학고");
		String name3 = new String("구병국");
		String name4 = "구병국";
		String name5 = new String("구병국");
 		System.out.println(name == name3);
 		System.out.println(name == name4);
 		System.out.println(name3 == name5);
 		if(name.equals(name3)) {
 			System.out.println("name == name3가 true가 나옵니다.");
 		}
		
	}
}
