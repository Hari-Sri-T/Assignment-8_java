# Student Management System (With Custom Exceptions)

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
# Custom Exceptions for Student Management System

## 1. **InvalidNameException**
   - **Use**: Thrown when the student's name is invalid (e.g., contains non-letter characters).

## 2. **InvalidPRNException**
   - **Use**: Thrown when the PRN (Permanent Registration Number) is invalid (e.g., not 10 digits long).

## 3. **InvalidAgeException**
   - **Use**: Thrown when the student's age is outside the valid range (e.g., not between 16 and 100).

## 4. **InvalidCGPAException**
   - **Use**: Thrown when the student's CGPA is invalid (e.g., outside the range of 0 to 10).

## 5. **DuplicatePRNException**
   - **Use**: Thrown when attempting to add a student with a PRN that already exists in the system.

## 6. **StudentNotFoundException**
   - **Use**: Thrown when a student cannot be found by their PRN or name.

## 7. **EmptyStudentListException**
   - **Use**: Thrown when there are no students in the system to perform an operation (e.g., display or delete).

## 8. **InvalidSearchChoiceException**
   - **Use**: Thrown when an invalid choice is made during the student search operation.

## 9. **InvalidPositionException**
   - **Use**: Thrown when an invalid index position is provided for accessing a student's record.

## 10. **InvalidMenuChoiceException**
   - **Use**: Thrown when a user selects an invalid option from the menu.

## 11. **NullStudentException**
   - **Use**: Thrown when attempting to add a null student object to the system.

## 12. **TooManyStudentsException**
   - **Use**: Thrown when trying to add more than the allowed number of students (e.g., 100).

## 13. **EditNotAllowedException**
   - **Use**: Thrown when an edit operation is not allowed for a student’s details.

## 14. **DeletionNotAllowedException**
   - **Use**: Thrown when attempting to delete a student’s record when deletion is not permitted.

## 15. **EmptyNameException**
   - **Use**: Thrown when the student's name is empty or null.

## 16. **NegativeValueException**
   - **Use**: Thrown when a value (e.g., age, PRN, CGPA) is negative, which is invalid in the system.

---

##  How to Run the Program
1. Compile all `.java` files:
   ```sh
   javac Main.java

2. Run the Code
   ```sh
   java Main
