package icehs.science.chapter07;

public class Publication {
	private String title;
	private int price;
	private int page;
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		if(price < 0) {
			System.out.println("[에러] 가격 정보는 음수를 입력할 수 없습니다.");
		}else {
			this.price = price;
		}
	}
	
	public int getPage() {
		return this.page;
	}
	
	public void setPage(int page) {
		if(page < 0 ) {
			System.out.println("[에러] 페이지 정보는 음수를 입력할 수 없습니다.");
		}else {
			this.page = page;
		}
	}
	public void printPublicationInfo() {
		System.out.println("출판물 정보 : " + this.title + "( " + this.price +" 원, " + this.page + "page )");
	}
}
