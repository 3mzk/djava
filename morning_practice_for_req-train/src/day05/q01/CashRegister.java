package day05.q01;

public class CashRegister {
	double cash;
	int icash; // =  (int)cash;
	
	
	
	@SuppressWarnings("unused")
	public int calcprice (int c) { //void→int
		cash = c * 1.1;
		icash =  (int)cash;
	
		
		return icash ; //intでリターン
	
		
	}
	
}
