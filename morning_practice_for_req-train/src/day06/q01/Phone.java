 package day06.q01;

public class Phone {
	private int fee;
	int tfee;
	

	public int getFee() {// 1get
		return fee;
	}
	
	public void setFee(int fee) {  //2get
		this.fee = fee;
		//System.out.println("今月の電話料金は\\" + this.fee);　mainにかく
	}
	
	public  void initFee() {
		System.out.println("今月の電話料金を初期化します（\\980）");
		this.fee =980;
	}
	
	public void call() {
		System.out.println("電話をかけます（+\\150）");
		
		//int fee =980;
		//fee = fee + 150; 加算
		this.fee += 150;
	}
	
}
