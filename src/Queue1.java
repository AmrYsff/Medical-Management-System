package project;

public class Queue1 {
    // Attributes
    Patient[] arr;
    int size;
    int front;
    int rear;

    // Constructor
    public Queue1() {
        arr = new Patient[100];
        this.front = 0;
        this.size = 0;
        this.rear = 0;
    }

    
    // methods
    public void enqueue(Patient patient) {
        if (size < arr.length) {
            arr[rear] = patient;
            size++;
            rear = (rear + 1) % arr.length;
        } else {
            resize();
            enqueue(patient);
        }
    }

    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else {
            Patient returnValue = arr[front];
            front = (front + 1) % arr.length;
            size--;
            return returnValue;
        }
    }
    
    public Patient peak() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else {
            Patient returnValue = arr[front];
            return returnValue;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private void resize() {
        int newLength = arr.length * 2;
        Patient[] newArr = new Patient[newLength];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size;
    }

    public void displayQueue() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[(front + i) % arr.length]);
        }
    }
}


