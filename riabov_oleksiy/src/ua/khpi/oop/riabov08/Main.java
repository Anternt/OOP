package ua.khpi.oop.riabov08;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		RecruitAgency recruitagency = new RecruitAgency();
//		recruitagency.add(new Vacancies("Apple","25000","Розробник андроїд програм","Відсутність шуму","Вища освіта,стаж роботи 2 роки"));
//		recruitagency.add(new Vacancies("Merots","19000","Розробник ігор","Новітні прилади","Вища освіта,стаж не обов'зковий"));
//		recruitagency.add( new Vacancies("Forest","15000","Веб-дизайнер","Великий вибір їжі в буфеті","Вища освіта"));
//		recruitagency.add( new Vacancies("Bosty","10000","Розробник захистних систем","Веселий коллектив","Вища освіта,стаж роботи від 3 років"));
//		recruitagency.add( new Vacancies("Moresit","27777","Front-end developer","Вільний графік","Вища освіта,працелюбність"));
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