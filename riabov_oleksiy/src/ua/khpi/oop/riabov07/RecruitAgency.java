package ua.khpi.oop.riabov07;

import java.util.ArrayList;

public class RecruitAgency {
	ArrayList<Vacancies> mass = new ArrayList<Vacancies>();
	public void add(Vacancies vacancies) {
		mass.add(vacancies);
	}
	public void print() {
	for(var phirma : mass) {
		System.out.println("\nPhirma: "+phirma.getPhirma()+"\nPrice: "+ phirma.getPrice() + "\nSpeciality: " +phirma.getSpeciality()+ "\nConditions: " +phirma.getConditions()+"\nRequirements: "+ phirma.getRequirements().toString());
		}
	}
}