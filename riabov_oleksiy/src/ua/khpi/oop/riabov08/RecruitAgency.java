package ua.khpi.oop.riabov08;

import java.util.ArrayList;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
	
	public void save(String fileName) throws FileNotFoundException {
		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)));
		encoder.writeObject(mass);
		encoder.close(); 
		System.out.println("Serialization successful\n");
	}
	
	@SuppressWarnings("unchecked")
	public void download(String fileName) throws FileNotFoundException {
		XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(fileName)));
		mass = (ArrayList<Vacancies>) d.readObject();
		d.close();
		System.out.println("Serialization successful\n");
	}
	
	void delete(int n) {
		if(n<mass.size())
		mass.remove(n);
		else
			System.out.println("Element don`t exists");
	}
	
	public RecruitAgency() {
		super();
		// TODO Auto-generated constructor stub
	}
}