package icehs.science.chapter03;

public class TypeCastingEx {
	public static void main(String[] args) {
		long billWealth = 700000L;
		System.out.println("Origial Value : " + billWealth);
		
		double doubleBillWealth = billWealth;
		System.out.println("double형으로 형변환 : " + doubleBillWealth );
		
		int intBillWealth = (int)billWealth;
		System.out.println("int형으로 강제형변환 : " + intBillWealth);
	}
}
