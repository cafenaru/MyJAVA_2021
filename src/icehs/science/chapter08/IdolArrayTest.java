package icehs.science.chapter08;

public class IdolArrayTest {
	public static void main(String[] args) {
		Idol[] idols = new Idol[4];
		idols[0] = new Idol("�ҳ�ô�", "�¿�");
		idols[1] = new Idol("����Ÿ", "����");
		idols[2] = new Idol("���", "���巡��");
		idols[3] = new Idol("��Ʈ","��伷");
		
		/*
		 * idols[0].printIdolInfo(); idols[1].printIdolInfo(); idols[2].printIdolInfo();
		 * idols[3].printIdolInfo();
		 */
		for(int i = 0; i < idols.length; i++) {
			idols[i].printIdolInfo();
		}
		
		System.out.println();
		
		for(Idol myIdol : idols) {
			myIdol.printIdolInfo();
		}
		
	}
}
