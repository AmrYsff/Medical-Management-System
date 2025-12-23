package project;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Management hospital1 = new Management();
		
		hospital1.addPatient(1, "Hamada", 99, "sickness");
		hospital1.addPatient(2, "lolyan", 77, "mareed");
		hospital1.addPatient(3, "Abu hameid", 88, "sickness");
		hospital1.addPatient(4, "Habbib",66, "mareed");
		hospital1.addPatient(5, "Emada", 55, "sickness");
		hospital1.addPatient(6, "Lara", 44, "mareed");
		hospital1.addPatient(7, "Ali", 18, "sickness");
		hospital1.addPatient(8, "Sameera", 15, "mareed");
		
		hospital1.addEmployee(15, "yousef");
		hospital1.addEmployee(83, "ali");
		hospital1.addEmployee(21, "Layan");
		hospital1.addEmployee(9931, "hamza");
		hospital1.addEmployee(231, "soaad");
		
		
		hospital1.displayEmployee();
		hospital1.definehospitalmap();
		hospital1.printRoomindex();
		
		hospital1.findclosestExit(6);
		hospital1.displayActivePatients();
		
		
	}

}
   