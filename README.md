# Student Management System

##  Description
This Java-based **Student Management System** allows users to **add, search, edit, delete, and display** student records using a **menu-driven program**.  
It uses **Object-Oriented Programming (OOP)** principles and performs **CRUD operations** on student data.

---

##  Files & Classes Overview

### 1) Student.java
This file defines the **Student class**, which represents a student with attributes and methods.  

### 2️) StudentOperations.java
This file contains methods to **manage students**, including adding, searching, editing, deleting, and displaying students.  

### 3️) Main.java
This file contains the **main method**, which runs the menu-based program, allowing users to interact with the system.

---

##  Classes & Methods

### Student.java
Defines a **Student** object with attributes and methods.

| Method        | Description |
|--------------|------------|
| `Student(String name, long prn, int age, double cgpa)` | Constructor to initialize a Student object. |
| `setName(String name)` | Sets the student's name. |
| `getName()` | Returns the student's name. |
| `setPrn(long prn)` | Sets the student's PRN. |
| `getPrn()` | Returns the student's PRN. |
| `setAge(int age)` | Sets the student's age. |
| `getAge()` | Returns the student's age. |
| `setCgpa(double cgpa)` | Sets the student's CGPA. |
| `getCgpa()` | Returns the student's CGPA. |
| `display()` | Displays student details. |

---

###  StudentOperations.java
Handles **CRUD operations** on student records.

| Method        | Description |
|--------------|------------|
| `StudentOperations()` | Constructor that initializes an `ArrayList` of students. |
| `addStudent(Student student)` | Adds a student to the list. |
| `displayStudents()` | Displays all students in the list. |
| `searchStudent()` | Provides options to search by PRN, name, or position. |
| `searchByPrn(long prn)` | Searches for a student using PRN. |
| `searchByName(String name)` | Searches for a student using name (case-insensitive). |
| `searchByPosition(int pos)` | Searches for a student at a specific position in the list. |
| `deleteStudent()` | Deletes a student by PRN. |
| `editStudent()` | Edits student details (name, age, CGPA) based on PRN. |

---

### Main.java
Contains the **main method**, displaying a menu-driven interface.

| Option | Description |
|--------|------------|
| **1** | Add a new student. |
| **2** | Display all students. |
| **3** | Search for a student (by PRN, Name, or Position). |
| **4** | Delete a student (by PRN). |
| **5** | Edit student details (by PRN). |
| **6** | Exit the program. |

---

##  How to Run the Program
1. Compile all `.java` files:
   ```sh
   javac Main.java

2. Run the Code
   ```sh
   java Main
