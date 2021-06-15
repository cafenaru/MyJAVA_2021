package icehs.science.chapter10.mobile;

public class IPhone extends Mobile {
	private String color;
	public IPhone() {
		super("iPhone", 0);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println(this.getProduction() + " : " + this.color);
	}

	@Override
	public void charge(int time) {
		System.out.println(this.getProduction() + " : " + time +"분 충전했더니 Full!!!");
	}
}
