package project;

public class LinkedList1 {
	
    private Node head;
    int size = 0 ;

    void addPatient(Patient patient) {
        Node newNode = new Node(patient);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    boolean removePatient(int patientID) {
        if (head == null) {
            return false;
        }

        if (head.patient.patientID == patientID) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.patient.patientID != patientID) {
            current = current.next;
        }

        if (current.next == null) {
            return false ;
        } else {
            current.next = current.next.next;
            size--;
            return true ;
        }
    }

    void displayPatients() {
        if (head == null) {
            System.out.println("No patients in the system.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.patient.toString());
            current = current.next;
        }
    }
    
    Patient findPatientbyID(int patientID)
    {
    	if (head == null) {
            return null;
        }

        if (head.patient.patientID == patientID) {
            return head.patient;
        }

        Node current = head;
        while (current.next != null && current.next.patient.patientID != patientID) {
            current = current.next;
        }

        if (current.next == null) {
            return null ;
        } else {
            return current.next.patient ;
        }
    }
    
    private Patient[] changeToArray() {
    	int size = this.size ;
    	Patient [] patients = new Patient[size];
    	Node current = head ;
    	int index = 0 ;
    	while(current!= null)
    	{
    		patients[index++] = current.patient ;
    		current = current.next ;
    	}
    	return patients ;
	}
    
    
    
    public void insertionSort() {
    	Patient[] patients = changeToArray();
        for (int i = 1; i < patients.length; i++) {
            Patient key = patients[i];
            int j = i - 1;

            while (j >= 0 && patients[j].patientID > key.patientID) {
                patients[j + 1] = patients[j];
                j--;
            }
            patients[j + 1] = key;
        }
        
        head = null;
        for (Patient patient : patients) {
            addPatient(patient);
        }
    }
    
    
    public void selectionSort() {
    	Patient[] patients = changeToArray();
        for (int i = 0; i < patients.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < patients.length; j++) {
                if (patients[j].age< patients[minIndex].age) {
                    minIndex = j;
                }
            }

            Patient temp = patients[minIndex];
            patients[minIndex] = patients[i];
            patients[i] = temp;
            
              
        }
        
        head = null;
        for (Patient patient : patients) {
            addPatient(patient);
        }
    }


}

