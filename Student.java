//Student.java

class Student{
	private String name;
	private long prn;
	private int age;
	private double cgpa;
	
	public Student(String name, long prn,int age,double cgpa){
		setName(name);
		setPRN(prn);
		setAGE(age);
		setCGPA(cgpa);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPRN(long prn){
		this.prn = prn;
	}
	
	public long getPRN(){
		return prn;
	}
	
	public void setAGE(int age){
		this.age = age;
	}
	
	public int getAGE(){
		return age;
	}
	
	public void setCGPA( double cgpa){
		this.cgpa = cgpa;
	}
	
	public double getCGPA(){
		return cgpa;
	}
	
	public void display(){
		System.out.println("Name: " + getName()+ "\nPRN: " + getPRN() + "\nAge: " + getAGE() + "\nCGPA: " + getCGPA());
}
}
