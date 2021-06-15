package icehs.science.chapter10;

import java.util.ArrayList;

public class MyListTest {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		
		System.out.println(myList.get(2));
	}
}
