package icehs.science.chapter10.mobile;

public class Galaxy extends Mobile implements GooPlay {
	private String osVersion;
	public Galaxy() {
		super("Galaxy",0);
	}
	
	@Override
	public void charge(int time) {
		System.out.println(this.getProduction() + " : 보조배터리 " + time +"분 충전");
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
		System.out.println(this.getProduction() + " : " + kind +"앱을 " + price +"원에 구입했습니다.");
		
	}
}
