package day05.q02;
//【Validationクラス】
//checkIdメソッドを以下の要件に従い実装しなさい。
//・戻り値の型：boolean
//・メソッド名：checkId
//・引数：int型
//処理：引数の値が1111または2222の場合はtrue、
//上記以外の数字の場合はfalseをreturnする。
//※boolean型の変数をreturnしてもよい。

public class Validation {
	
	//boolean t = true;
	boolean f = false;
	 
	 int id;
	 public boolean checkId(int i) {
	 
	 if ( (id == 1111)||(id == 2222)) {
		 return true;
	 } else {
		 return f;
	 }
	 }
}


