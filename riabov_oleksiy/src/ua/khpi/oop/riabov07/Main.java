package ua.khpi.oop.riabov07;

public class Main {
	
	public static void main(String[] args) {
		RecruitAgency recruitagency = new RecruitAgency();
		recruitagency.add(new Vacancies("Apple","25000","��������� ������ �������","³�������� ����","���� �����,���� ������ 2 ����"));
		recruitagency.add(new Vacancies("Merots","19000","��������� ����","����� �������","���� �����,���� �� ����'������"));
		recruitagency.add( new Vacancies("Forest","15000","���-��������","������� ���� �� � �����","���� �����"));
		recruitagency.add( new Vacancies("Bosty","10000","��������� ��������� ������","������� ���������","���� �����,���� ������ �� 3 ����"));
		recruitagency.add( new Vacancies("Moresit","27777","Front-end developer","³����� ������","���� �����,������������"));
		recruitagency.print();
		}
	}
