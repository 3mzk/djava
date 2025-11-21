 package day06.q01;

public class Phone {
	private int fee;
	
	public void initFee() {
		System.out.println("今月の電話料金を初期化します（\\980）");
		int fee =980;
	}
	
	public void csll() {
		System.out.println("電話をかけます（+\\150）");
		fee = fee + 150;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
		
	}
	
	public void getFee() {
		return fee;
	
	}
	
}
