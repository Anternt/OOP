package ua.khpi.oop.riabov08;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		RecruitAgency recruitagency = new RecruitAgency();
//		recruitagency.add(new Vacancies("Apple","25000","��������� ������ �������","³�������� ����","���� �����,���� ������ 2 ����"));
//		recruitagency.add(new Vacancies("Merots","19000","��������� ����","����� �������","���� �����,���� �� ����'������"));
//		recruitagency.add( new Vacancies("Forest","15000","���-��������","������� ���� �� � �����","���� �����"));
//		recruitagency.add( new Vacancies("Bosty","10000","��������� ��������� ������","������� ���������","���� �����,���� ������ �� 3 ����"));
//		recruitagency.add( new Vacancies("Moresit","27777","Front-end developer","³����� ������","���� �����,������������"));
//		Dir.directoryForDownload();
	    try {
			Menu();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
	
	}
	public static void Menu() throws FileNotFoundException {
		RecruitAgency recruitagency = new RecruitAgency();
		boolean prz = true;
		Scanner scan = new Scanner(System.in);
		
		String phirma = "phirma";
		String price = "price";
		String speciality = "speciality";
		String conditions = "conditions";
		String requirements = "requirements";
		String temp;
		
		while(prz){
		System.out.println("1.Add element\n2.Show data\n3.Save\n4.Download\n5.Delete\n0.End\nInput command id: ");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("Enter name of phirma: ");
			scan.nextLine();
			phirma = scan.nextLine();
			System.out.println("Enter price: ");
			price =  scan.nextLine();
			System.out.println("Enter speciality: ");
			speciality =  scan.nextLine();
			System.out.println("Enter conditions: ");
			conditions =  scan.nextLine();
			System.out.println("Enter requirements: ");
			scan.nextLine();
			requirements = scan.nextLine();
			recruitagency.add(new Vacancies(phirma,price,speciality,conditions,requirements));
			break;
		case 2: 
			recruitagency.print(); 
			break;
		case 3: 
			temp = Dir.directoryForDownload();
			
			if(temp.equals("DONTDOWNLOAD")) {
				System.out.println("You don`t choose file");
				break;
			}
			recruitagency.save(temp);
			
			scan.nextLine();
			break;
		case 4:
			temp = Dir.directoryForDownload();
			
			if(temp.equals("DONTDOWNLOAD")) {
				System.out.println("You don`t choose file");
				break;
				}
			recruitagency.download(temp);
			scan.nextLine();
			break;
		case 5:
			System.out.println("Enter index: ");
			recruitagency.delete(scan.nextInt());
			
			break;
			default:
					System.out.println("End program");
					prz = false;
					
			break;
			}
		}
		scan.close();
	}
	
	
	
	}