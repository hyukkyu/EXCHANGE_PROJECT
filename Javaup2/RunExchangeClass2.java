package Javaup2;

import java.io.IOException;
import Javaup.OutputClass;

public class RunExchangeClass2 {
	
	OutputClass2 outClass = null;
	
	public RunExchangeClass2() {
		outClass = new OutputClass2();
	}
	
	private boolean checkBalanceUSD(int requestUSD) {
		if(requestUSD <= ConstValueClass2.BALANCE_USD) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkBalanceEUR(int requestEUR) {
		if(requestEUR <= ConstValueClass2.BALANCE_EUR) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkBalanceJPY(int requestJPY) {
		if(requestJPY <= ConstValueClass2.BALANCE_JPY) {
			return true;
		} else {
			return false;
		
		}
	}
	
	public void changeToUSD(double won) throws IOException {
		double dollar;
		double chkr;
		int realdollar;
		int changekr;
		
		dollar = won / ConstValueClass2.Cu_USD;
		realdollar = (int)dollar;
		//돈이 있나?
		if(checkBalanceUSD(realdollar)) {
		//있으면
			outClass.outputResultUSD(won, realdollar);
			
			chkr = dollar - realdollar;
			chkr = chkr * ConstValueClass2.Cu_USD;
			chkr = (int)chkr / 10;
			chkr = (int)chkr * 10;
			changekr = (int)chkr;
			
			
			outClass.outputResultWON(changekr);
			
			ConstValueClass2.BALANCE_USD -= realdollar;
			outClass.printBalanceUSD(ConstValueClass2.BALANCE_USD);
		} else {//없으면
			outClass.printErrorMessage(ConstValueClass2.ERR_BALANCE_USD);
		}
	}
	
	public void changeToEUR(double won) throws IOException {
		double eur;
		double chkr;
		int realeur;
		int changekr;
		
		eur = won / ConstValueClass2.Cu_EURO;
		realeur = (int)eur;
		
		if(checkBalanceEUR(realeur)) {
			outClass.outputResultEUR(won, realeur);
			
			chkr = eur - realeur;
			chkr = chkr * ConstValueClass2.Cu_EURO;
			chkr = (int)chkr / 10;
			chkr = (int)chkr * 10;
			changekr = (int)chkr;
			
			outClass.outputResultWON(changekr);
			ConstValueClass2.BALANCE_EUR -= realeur;
			outClass.printBalanceEUR(ConstValueClass2.BALANCE_EUR);
		} else {
			outClass.printErrorMessage(ConstValueClass2.ERR_BALANCE_EUR);
		}
	}
	
	public void changeToJPY(double won) throws IOException {
		double jpy;
		double chkr;
		int realjpy;
		int changekr;
		
		jpy = won / ConstValueClass2.Cu_JPY;
		realjpy = (int)(jpy - (jpy % 1000));
		if(checkBalanceJPY(realjpy)) {
			outClass.outputResultJPY(won, realjpy);
			
			chkr = (jpy - realjpy) * ConstValueClass2.Cu_JPY;
			
			changekr = (int)chkr;
			
			outClass.outputResultWON(changekr);
			ConstValueClass2.BALANCE_JPY -= realjpy;
			outClass.printBalanceJPY(ConstValueClass2.BALANCE_JPY);
		} else {
			outClass.printErrorMessage(ConstValueClass2.ERR_BALANCE_JPY);
		}
	}
}
