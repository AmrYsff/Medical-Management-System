package project;

public class Patient {
	
	//attributes
	String name ;
	int patientID ;
	int age ;
	private String ailment ;
	
	//constucter
	public Patient(String name ,int id , int age , String ailment) 
	{
		this.name = name ;
		this.patientID = id ;
		this.age = age ;
		this.ailment = ailment ;
	}
	
	//methods
	public String toString() {
        return "Patient[ID=" + patientID + ", Name=" + name + ", Age=" + age + ", Ailment=" + ailment + "]";
    }
}
