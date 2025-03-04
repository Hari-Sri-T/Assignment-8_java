// Main.java

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter PRN: ");
		long prn = Long.parseLong(scan.nextLine());
		
		System.out.println("Enter AGE: ");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter CGPA: ");
		double cgpa = Double.parseDouble(scan.nextLine());
		
		StudentOperations operations = new StudentOperations();
		Student student = new Student(name,prn,age,cgpa);
		operations.addStudent(student);
		operations.displayStudents();
		
		operations.searchStudent();
		
		operations.deleteStudent();
	}
}