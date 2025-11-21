package day05.q01;

public class CashRegister {
	double cash;
	int icash =  (int)cash;
	
	
	
	@SuppressWarnings("unused")
	public void calcprice (double c) {
		cash = c * 1.1;
		int icash =  (int)cash;
		int ic = (int)c;
		System.out.println("税抜き価格" + ic);
		 System.out.println("税込み価格" + icash);
		
		
	}
	
}
