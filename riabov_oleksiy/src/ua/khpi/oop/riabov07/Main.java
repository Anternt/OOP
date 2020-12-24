package ua.khpi.oop.riabov07;

public class Main {
	
	public static void main(String[] args) {
		RecruitAgency recruitagency = new RecruitAgency();
		recruitagency.add(new Vacancies("Apple","25000","Розробник андроїд програм","Відсутність шуму","Вища освіта,стаж роботи 2 роки"));
		recruitagency.add(new Vacancies("Merots","19000","Розробник ігор","Новітні прилади","Вища освіта,стаж не обов'зковий"));
		recruitagency.add( new Vacancies("Forest","15000","Веб-дизайнер","Великий вибір їжі в буфеті","Вища освіта"));
		recruitagency.add( new Vacancies("Bosty","10000","Розробник захистних систем","Веселий коллектив","Вища освіта,стаж роботи від 3 років"));
		recruitagency.add( new Vacancies("Moresit","27777","Front-end developer","Вільний графік","Вища освіта,працелюбність"));
		recruitagency.print();
		}
	}
