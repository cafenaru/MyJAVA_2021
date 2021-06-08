package ws3.java2.entity;

public class Airplane {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int numOfEngine;
	private boolean available;
	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super();
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.numOfEngine = numOfEngine;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}
