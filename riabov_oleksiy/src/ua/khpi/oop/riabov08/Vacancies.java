package ua.khpi.oop.riabov08;

public class Vacancies {
	private String phirma;
	private String price;
	private String speciality;
	private String conditions;
	private String requirements;
	public void setPhirma(String phirma) {
		this.phirma = phirma;
		
	}
	public String getPhirma() {
		return phirma;
	}
	public void setPrice(String price) {
		this.price = price;
		
	}
	public  String getPrice() {
		return price;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
		
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
		
	}
	public String getConditions() {
		return conditions;
	}

    public void setRequirements(String requirements) {
	this.requirements = requirements;
    }
	public String getRequirements() {
		return requirements;
	}
	public void addPrice(String price) {
		this.price = price;
		
	}
	{
		phirma = null;
		price = null;
		speciality = null;
		conditions = null;
		requirements = null;		
	}
	    Vacancies(String phirma,String price,String speciality,String conditions,String requirements){
		this.setPhirma(phirma);
		this.setPrice(price);
		this.setSpeciality(speciality);
		this.setConditions(conditions);
		this.setRequirements(requirements);
	}
}
