package icehs.science.chapter03;

public class StringEx {
	public static void main(String[] args) {
		String name = "������";
		String name2 = new String("���а�");
		String name3 = new String("������");
		String name4 = "������";
		String name5 = new String("������");
 		System.out.println(name == name3);
 		System.out.println(name == name4);
 		System.out.println(name3 == name5);
 		if(name.equals(name3)) {
 			System.out.println("name == name3�� true�� ���ɴϴ�.");
 		}
		
	}
}
