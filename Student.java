//Student.java

class Student{
	private String name;
	private long prn;
	private int age;
	private float cgpa;
	
	public Student(String name, long prn,int age,float cgpa){
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
	
	public void setAGE(long age){
		this.age = age;
	}
	
	public long getAGE(){
		return age;
	}
	
	public void setCGPA(long cgpa){
		this.cgpa = cgpa;
	}
	
	public long getCGPA(){
		return cgpa;
	}
	
	public void display(){
		System.out.println("Name: " + getName()+ "\nPRN: " + getPRN() + "\nAge: " + getAGE() + "\nCGPA: " + getCGPA);
}
}
