package Javaup2;

import java.io.IOException;

public class OutputClass2 {

	public WriteClass2 wr = null;
	
	public OutputClass2() {
		wr = new WriteClass2();
	}
	
	private void printResultUSD(int realdollar,int Output_USD100, 
							    int Output_USD50, int Output_USD10, 
							    int Output_USD5, int Output_USD1) {
		
		System.out.println("dollarȯ�� ���: " + realdollar + "�޷�");
		System.out.println("100�޷�: "+ Output_USD100+ "��");
		System.out.println("50�޷�: " + Output_USD50 + "��");
		System.out.println("10�޷�: " + Output_USD10 + "��");
		System.out.println("5�޷�: " + Output_USD5 + "��");
		System.out.println("1�޷�: " + Output_USD1 + "��");
	}
	
	private void printResultEUR(int realeur,int Output_eur100, 
							    int Output_eur50, int Output_eur10, 
							    int Output_eur5, int Output_eur1) {
		System.out.println("euro ȯ�� ���: " + realeur + "����");
		System.out.println("100���� :" + Output_eur100 + "��");
		System.out.println("50���� :" + Output_eur50 + "��");
		System.out.println("10���� :" + Output_eur10 + "��");
		System.out.println("5���� :" + Output_eur5 + "��");
		System.out.println("1���� :" + Output_eur1 + "��");
	}
	
	private void printResultJPY(int realjpy, int Output_YEN10000, int Output_YEN5000, 
							    int Output_YEN2000, int Output_YEN1000) {
		System.out.println("jpy ȯ�� ���: " + realjpy + "��");
		System.out.println("10000��: " + Output_YEN10000 + "��");
		System.out.println("5000��: " + Output_YEN5000 + "��");
		System.out.println("1000��: " + Output_YEN1000 + "��");
	}
	
	public void printResultWON(int changekr, int Output_WON1000, int Output_WON100, 
							   int Output_WON50, int Output_WON10) {
		System.out.println("�Ž��е�: " + changekr + "��");
		System.out.println("1000��: " + Output_WON1000 + "��");
		System.out.println("100��: " + Output_WON100 + "��");
		System.out.println("50��: " + Output_WON50 + "��");
		System.out.println("10��: " + Output_WON10 + "��");
	}
	
	public void printBalanceUSD(double balanceUSD) {
		System.out.println("�޷��ܾ�: " + balanceUSD );
	}
	
	public void printBalanceEUR(double balanceEUR) {
		System.out.println("�����ܾ�: " + balanceEUR); 
	}
	
	public void printBalanceJPY(double balanceJPY) {
		System.out.println("��ȭ�ܾ�: " + balanceJPY);
	}
	
	public void printErrorMessage(int errorCode) {
		if(errorCode == ConstValueClass2.ERR_BALANCE_USD) {
			System.out.println("�޷��ݾ��� �����մϴ�");
		} else if(errorCode == ConstValueClass2.ERR_BALANCE_EUR) {
			System.out.println("���αݾ��� �����մϴ�");
		} else if(errorCode == ConstValueClass2.ERR_BALANCE_JPY) {
			System.out.println("��ȭ�ݾ��� �����մϴ�");
		}
	}
	
	public void outputResultUSD(double won, int realdollar) throws IOException {
		int Output_USD100, Output_USD50, Output_USD10, 
			Output_USD5, Output_USD1;
		Output_USD100 = realdollar / ConstValueClass2.GET_ALL100;
		Output_USD50 = (realdollar % ConstValueClass2.GET_ALL100) 
						/ ConstValueClass2.GET_ALL50;
		Output_USD10 = ((realdollar % ConstValueClass2.GET_ALL100) 
						% ConstValueClass2.GET_ALL50) 
						/ ConstValueClass2.GET_ALL10;
		Output_USD5 = (((realdollar % ConstValueClass2.GET_ALL100) 
						% ConstValueClass2.GET_ALL50) 
						% ConstValueClass2.GET_ALL10) 
						/ ConstValueClass2.GET_ALL5;
		Output_USD1 = ((((realdollar % ConstValueClass2.GET_ALL100) 
						% ConstValueClass2.GET_ALL50) 
						% ConstValueClass2.GET_ALL10) 
						% ConstValueClass2.GET_ALL5) 
						/ ConstValueClass2.GET_ALL1;
		
		printResultUSD(realdollar, Output_USD100, 
			   		   Output_USD50,  Output_USD10, 
			   		   Output_USD5,  Output_USD1);
		wr.writeUSD(won, realdollar);
	
	}
	
	public void outputResultEUR(double won, int realeur) throws IOException {
		int Output_eur100, Output_eur50, Output_eur10, 
		   	Output_eur5, Output_eur1;
		Output_eur100 = realeur / ConstValueClass2.GET_ALL100;
		Output_eur50 = (realeur % ConstValueClass2.GET_ALL100) / ConstValueClass2.GET_ALL50;
		Output_eur10 = ((realeur % ConstValueClass2.GET_ALL100) 
						% ConstValueClass2.GET_ALL50) 
						/ ConstValueClass2.GET_ALL10;
		Output_eur5 = (((realeur % ConstValueClass2.GET_ALL100) 
						% ConstValueClass2.GET_ALL50) 
						% ConstValueClass2.GET_ALL10) 
						/ ConstValueClass2.GET_ALL5;
		Output_eur1 = ((((realeur % ConstValueClass2.GET_ALL100) 
						% ConstValueClass2.GET_ALL50) 
						% ConstValueClass2.GET_ALL10) 
						% ConstValueClass2.GET_ALL5) 
						/ ConstValueClass2.GET_ALL1;
		printResultEUR(realeur, Output_eur100, 
								Output_eur50, Output_eur10, 
								Output_eur5, Output_eur1);
		wr.writeEUR(won, realeur);
	}
	
	public void outputResultJPY(double won, int realjpy) throws IOException {
		int Output_YEN10000, Output_YEN5000, Output_YEN2000, Output_YEN1000;
		Output_YEN10000 = realjpy / 10000;
		Output_YEN5000 = (realjpy % 10000) / 5000;
		Output_YEN2000 = ((realjpy % 10000) % 5000) / 2000;
		Output_YEN1000 = (((realjpy % 10000) % 5000) % 2000) / 1000;
		printResultJPY(realjpy, Output_YEN10000, Output_YEN5000, 
					   Output_YEN2000, Output_YEN1000);
		wr.writeJYP(won, realjpy);
	}
	
	public void outputResultWON(int changekr) throws IOException {
		int Output_WON1000, Output_WON100, 
		   	Output_WON50, Output_WON10;
		Output_WON1000 = changekr / ConstValueClass2.GET_WON1000;
		Output_WON100 = (changekr % ConstValueClass2.GET_WON1000) / ConstValueClass2.GET_WON100;
		Output_WON50 = ((changekr % ConstValueClass2.GET_WON1000) % ConstValueClass2.GET_WON100) 
						/ ConstValueClass2.GET_WON50;
		Output_WON10 = (((changekr % ConstValueClass2.GET_WON1000) 
						% ConstValueClass2.GET_WON100) 
						% ConstValueClass2.GET_WON50) 
						/ ConstValueClass2.GET_WON10;
		printResultWON(changekr, Output_WON1000, Output_WON100, 
				   	   Output_WON50, Output_WON10);
		wr.writechange(changekr);
	}
}