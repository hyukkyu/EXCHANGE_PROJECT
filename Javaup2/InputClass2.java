package Javaup2;

import java.util.Scanner;

public class InputClass2 {
	Scanner sc = null;
	
	public InputClass2() {
		sc = new Scanner(System.in);
	}
	public int inputFromConsoleType() {
		int input_Menu;
		System.out.println("어떤 돈으로 환전?\n" 
				   + "1:USD\n\n"
				   + "2:EUR\n\n"
				   + "3:JPY");
		input_Menu = sc.nextInt();
		return input_Menu;
	}
	public int inputFromConsoleWon() {
		int won;
		System.out.print("원화 입력: ");
		won = sc.nextInt();
		return won;
	}
}
