
//【ConsoleReaderクラス】
//inputIdメソッドを以下の要件に従い実装しなさい。
//・戻り値の型：int
//・メソッド名：inputId
//・引数：なし
//・throws IOException
//処理：コンソールから入力を行い、整数に変換する。
//    変換した整数をreturnする。
// cf. p58 メソッド


package day05.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputId() throws IOException {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	String str = reader.readLine();
	int id = Integer.parseInt(str);
		
	
		return id;
		
	}
	
}
	
	
	




