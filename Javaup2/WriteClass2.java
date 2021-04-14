package Javaup2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteClass2 {
	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("YYYYMMdd");
	public void writeUSD (double won, int realdollar) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\bb.txt",true);
		String data = sf.format(date) + "," + (int)won + "," + realdollar + "," + "USD" +",";
		fw.write(data);
		fw.close();
	}
	
	public void writeEUR (double won, int realeur) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\bb.txt",true);
		String data = sf.format(date) + "," + (int)won + "," + realeur + "," + "EUR" +",";
		fw.write(data);
		fw.close();
	}
	
	public void writeJYP (double won, int realjpy) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\bb.txt",true);
		String data = sf.format(date) + "," + (int)won +"," + realjpy + "," + "JPY" + ",";
		fw.write(data);
		fw.close();
	}
	
	public void writechange (int changekr) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\bb.txt",true);
		String data = changekr +"," + ConstValueClass2.BALANCE_USD + "," + ConstValueClass2.BALANCE_EUR + "," + ConstValueClass2.BALANCE_JPY + "\n";
		fw.write(data);
		fw.close();
	}
}
