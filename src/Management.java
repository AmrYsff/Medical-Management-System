package project;

public class Management {
	//attributes
	private Queue1 apointment ;
	private Stack1 dischargedPatients ;
	private LinkedList1 patienstList ;
	private EmployeeBST employeeList ;
	private Graph hospitalGraph ;
	
	//constructer
	public Management() {
		this.apointment = new Queue1();
		this.dischargedPatients = new Stack1();
		this.patienstList = new LinkedList1();
		this.employeeList = new EmployeeBST();
		this.hospitalGraph = new Graph(11);
	}
	
	// methods
	public void addPatient(int id , String name ,int age , String aliemnt)
	{
		patienstList.addPatient(new Patient(name, id, age, aliemnt));
		System.out.println("Patient has been added successfully");
	}
	
	public void dischargePatient(int id)
	{
		if(patienstList.findPatientbyID(id) != null) {
			dischargedPatients.push(patienstList.findPatientbyID(id));
			patienstList.removePatient(id);
			System.out.println("Patient has been discharged successfully");
		}
		else
		{
			System.out.println("Patient is not found");
		}	
	}
	
	public void displayActivePatients()
	{
		patienstList.displayPatients();
	}
	
	public void reAdmitPatient() {
		
		if(dischargedPatients.peek() != null)
		{
			patienstList.addPatient(dischargedPatients.pop());
		}
	}
	
	public void sortPatientsInsertionbyId() {
		patienstList.insertionSort();
	}
	
	public void sortPatientsSelectionbyage() {
		patienstList.selectionSort();
	}
	
	public void makeAnApointment(int id) {
		apointment.enqueue(patienstList.findPatientbyID(id));
	}
	public void seeDoctor() {
		if(!apointment.isEmpty())
		{
			System.out.println(apointment.dequeue().name + " its Your turn to see the doctor");
		}
		else
		{
			System.out.println("the queue is empty");
		}
	}
	
	public void addEmployee(int id , String name) {
		Employee emptoadd = new Employee(id,name);
		employeeList.addEmployee(emptoadd);
	}
	
	public void findEmployeebyId(int id) {
		String name = employeeList.findEmployee(id);
		System.out.println(name);
	}
	
	public void displayEmployee() {
		employeeList.inOrderTraversal();
	}
	
	public void definehospitalmap() {
		hospitalGraph.addNode(0, "Room1");
	    hospitalGraph.addNode(1, "Room2");
	    hospitalGraph.addNode(2, "Room3");
	    hospitalGraph.addNode(3, "Room4");
	    hospitalGraph.addNode(4, "Room5");
	    hospitalGraph.addNode(5, "Room6");
	    hospitalGraph.addNode(6, "Room7");
	    hospitalGraph.addNode(7, "Exit1");
	    hospitalGraph.addNode(8, "Exit2");
	    hospitalGraph.addNode(9, "Exit3");
	    hospitalGraph.addNode(10, "Exit4");

	    // Add edges with weights
	    hospitalGraph.addEdge(0, 1, 4);  // Room1 to Room2
	    hospitalGraph.addEdge(0, 2, 3);  // Room1 to Room3
	    hospitalGraph.addEdge(1, 3, 2);  // Room2 to Room4
	    hospitalGraph.addEdge(2, 3, 5);  // Room3 to Room4
	    hospitalGraph.addEdge(2, 4, 7);  // Room3 to Room5
	    hospitalGraph.addEdge(3, 5, 1);  // Room4 to Room6
	    hospitalGraph.addEdge(4, 6, 6);  // Room5 to Room7
	    hospitalGraph.addEdge(5, 6, 2);  // Room6 to Room7
	    hospitalGraph.addEdge(0, 7, 8);  // Room1 to Exit1
	    hospitalGraph.addEdge(1, 7, 6);  // Room2 to Exit1
	    hospitalGraph.addEdge(3, 8, 3);  // Room4 to Exit2
	    hospitalGraph.addEdge(4, 9, 4);  // Room5 to Exit3
	    hospitalGraph.addEdge(6, 10, 5); // Room7 to Exit4
	    hospitalGraph.addEdge(7, 8, 2);  // Exit1 to Exit2
	    hospitalGraph.addEdge(8, 9, 3);  // Exit2 to Exit3
	    hospitalGraph.addEdge(9, 10, 1); // Exit3 to Exit4
	    hospitalGraph.addEdge(5, 7, 4);  // Room6 to Exit1
	    hospitalGraph.addEdge(2, 9, 6);  // Room3 to Exit3
	    hospitalGraph.addEdge(4, 8, 3);  // Room5 to Exit2   
	}
	
	public void printRoomindex() {
		for(int i = 0 ; i < 7 ; i++)
		{
			System.out.println(hospitalGraph.nodes[i] + " it is index is " + i);
		}
	}
	
	public void findclosestExit(int roomIndex) {
		hospitalGraph.findClosestExit(roomIndex);
	}
	
	
}
