package Javaup2;

import java.io.FileWriter;
import java.io.IOException;
import Javaup.InputClass;
import Javaup.RunExchangeClass;

public class Exchange2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RunExchangeClass2 print = new RunExchangeClass2();
		InputClass2 inputClass = new InputClass2();
		FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\bb.txt",true);
		String data = "날짜" + "," + "요청금액" + "," + "환전금액" + "," + "화폐종류" + "," + "거슴름돈" + "," + "달러잔액" + "," + "유로잔액" + "," +"엔화잔액" + "\n";
		fw.write(data);
		fw.close();
		int won = 0;
		int input_Menu = 0;
		
		do {
			input_Menu = inputClass.inputFromConsoleType();
			won = inputClass.inputFromConsoleWon();
			if(input_Menu == ConstValueClass2.CHANGE_TYPE_USD) {
				print.changeToUSD(won);
			} else if(input_Menu == ConstValueClass2.CHANGE_TYPE_EUR) {
				print.changeToEUR(won);
			} else if(input_Menu == ConstValueClass2.CHANGE_TYPE_JPY) {
				print.changeToJPY(won);
				}
			System.out.println();
		
		}while(input_Menu != 0);
	}
}
