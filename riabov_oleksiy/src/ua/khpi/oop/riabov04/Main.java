package ua.khpi.oop.riabov04;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		for(var str : args) {
			if(str.equals("-h") || str.equals("-help")) 
		System.out.println("�����: ����� ������\n������ ������� �����. ������� �� �� �����: �����, ������� ���� ����� �� �������; �����, ������� ���� �� ����� ��������. ������� ����� �� �� ������� �� ������\n�������� \"-h\" �� \"-help\": ������������ ���������� ��� ������ ��������, ����������� (������������ ��������), ��������� ���� ������ ������ (������ ���� �� ��������� ���������� �����);\r\n" + 
				"�������� \"-d\" �� \"-debug\": � ������ ������ �������� ������������� �������� ���, �� ���������� ������������ �� �������� ������������� ��������: ���������� �����������, ������ �������� ������, �������� ���������� ������ �� ��.");
			
		if(str.equals("-d") || str.equals("-debag"))
			Help.debagMod(true);
		}
		Menu();
	}
	public static void Menu() {
		boolean prz = true;
		Scanner scan = new Scanner(System.in);
		StringBuilder line= null;
		while(prz){
		System.out.println("1.Enter line\n2.Show data\n3.Start\n4.Show result\n5.End\nCommand id: ");
		switch (scan.nextInt()) {
		case 1:
			scan.nextLine();
			line = new StringBuilder(scan.nextLine());
			break;
		case 2:
			System.out.println(line);
			break;
		case 3:
			Help.start(line);
			break;
		case 4:
			Help.printline();
			break;
		case 5:
			prz = false;
			break;
		default:
			break;
		}
	}
		scan.close();
	}
	
}