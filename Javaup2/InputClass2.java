package Javaup2;

import java.util.Scanner;

public class InputClass2 {
	Scanner sc = null;
	
	public InputClass2() {
		sc = new Scanner(System.in);
	}
	public int inputFromConsoleType() {
		int input_Menu;
		System.out.println("� ������ ȯ��?\n" 
				   + "1:USD\n\n"
				   + "2:EUR\n\n"
				   + "3:JPY");
		input_Menu = sc.nextInt();
		return input_Menu;
	}
	public int inputFromConsoleWon() {
		int won;
		System.out.print("��ȭ �Է�: ");
		won = sc.nextInt();
		return won;
	}
}
