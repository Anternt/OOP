package ua.khpi.oop.riabov03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Input line: ");
	
		Help.start(new StringBuilder(scan.nextLine()));
		scan.close();
		
	}
}
