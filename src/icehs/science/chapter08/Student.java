package icehs.science.chapter08;

public class Student {
	private String name;
	private String stdID;
	private String phoneNo;
	
	public Student(String name, String stdID, String phoneNo) {
		super();
		this.name = name;
		this.stdID = stdID;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStdID() {
		return stdID;
	}
	public void setStdID(String stdID) {
		this.stdID = stdID;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void printStudentInfo() {
		System.out.println(this.name + "(" +this.stdID +") / 전화번호 : " + this.phoneNo);
	}
}
