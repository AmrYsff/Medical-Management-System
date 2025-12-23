package project;

public class Stack1 {
	
	//attributes
    private Node top;  
    private int size;  

    // Constructor
    public Stack1() {
        top = null;
        size = 0;
    }
    
    //methods
    public void push(Patient patient) {
        Node newNode = new Node(patient);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Patient pop() {
        if (isEmpty()) {
        	System.out.println("There is zero patients in the stack");
        	return null ;
        }
        Patient poppedPatient = top.patient;
        top = top.next;
        size--;
        System.out.println("Patient " + poppedPatient.name + " has been reAdmitted successfully");
        return poppedPatient;
    }

    public Patient peek() {
        if (isEmpty()) {
            System.out.println("There is zero patients in the stack");
            return null ;
        }
        return top.patient;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    
    public void displayStack() {
        System.out.println("Current stack contents (top to bottom):");
        Node current = top;
        while (current != null) {
            System.out.println(current.patient);
            current = current.next;
        }
    }
}

