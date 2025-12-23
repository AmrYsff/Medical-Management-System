# 🏥 Medical Management System  
**Data Structures & Algorithms – Course Project**

## 📌 Project Overview
This project implements a **Medical Management System** designed to manage core hospital operations using fundamental **data structures and algorithms**.  
It is developed as part of the **Data Structures & Algorithms (40201201)** course at **Al-Hussein Technical University (HTU)** for the academic year **2024–2025**.

The system demonstrates the practical application of Abstract Data Types (ADTs) to solve real-world problems such as patient registration, appointment management, emergency handling, and administrative operations.

---

## 🎯 Objectives
- Apply **Abstract Data Types (ADTs)** in a real-world scenario  
- Implement core **data structures from scratch** using Java  
- Analyze and compare **algorithm performance and complexity**  
- Demonstrate searching, sorting, stack, queue, tree, and graph algorithms  
- Fulfill BTEC learning outcomes (LO1 – LO4)

---

## 🛠️ Technologies Used
- **Programming Language:** Java  
- **Programming Paradigm:** Object-Oriented Programming (OOP)  
- **Data Structures & Algorithms:**
  - Linked List  
  - Queue  
  - Stack  
  - Binary Search Tree (BST)  
  - Graph (Dijkstra & Bellman-Ford)  
  - Sorting Algorithms  

---

## 📂 System Features & Used Data Structures

### 1️⃣ Patient Registration – Linked List
- Stores patient data (ID, name, age, ailment)
- Allows patient registration and discharge
- Ensures only active patients remain in the system

### 2️⃣ Appointment Management – Queue
- Manages regular (non-emergency) appointments
- First-Come, First-Served (FCFS) order
- Implemented using a circular array or doubly linked list

### 3️⃣ Discharge & Re-Admission – Stack
- Temporarily discharged patients are pushed onto a stack
- Re-admission follows Last-In, First-Out (LIFO) order

### 4️⃣ Patient Sorting – Sorting Algorithms
- Sorting patients by **ID** and **Age**
- Algorithms used:
  - Selection Sort
  - Insertion Sort
  - Bubble Sort
  - Merge Sort
- Execution time measured in **nanoseconds**
- Best-case and worst-case comparison included

### 5️⃣ Emergency Exit Navigation – Graph
- Hospital layout represented as a weighted graph
- Shortest path algorithms used:
  - Dijkstra’s Algorithm
  - Bellman-Ford Algorithm
- Finds the nearest exit during emergencies

### 6️⃣ Administration Management – Binary Search Tree (BST)
- Stores employee records
- Supports fast search by ID or name
- Trade-off comparison with sorted arrays discussed

---

## ⚠️ Error Handling
The system handles common runtime errors such as:
- Invalid or duplicate IDs
- Empty stack or queue operations
- Invalid input values
- Out-of-bound access

---

## 📊 Performance & Analysis
- Sorting algorithm performance comparison
- Asymptotic analysis using Big-O notation
- Critical evaluation of searching, sorting, and graph algorithms
- Discussion of ADT trade-offs

---

## How to Run
Open the project in IntelliJ or Eclipse
Run the 'Main' class

## Author
Yousef Amro
