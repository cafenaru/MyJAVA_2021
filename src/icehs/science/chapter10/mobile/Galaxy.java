package icehs.science.chapter10.mobile;

public class Galaxy extends Mobile implements GooPlay {
	private String osVersion;
	public Galaxy() {
		super("Galaxy",0);
	}
	
	@Override
	public void charge(int time) {
		System.out.println(this.getProduction() + " : �������͸� " + time +"�� ����");
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
		System.out.println(this.getProduction() +" : "  + this.osVersion);
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println(this.getProduction() + " : " + kind +"���� " + price +"���� �����߽��ϴ�.");
		
	}
}
