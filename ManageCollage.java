/*Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.
Class Structure:
Parent Class – Person
Data Members:
 int id, String name, String address, String contactNo
Member Methods:
addDetails() – Accept and store basic person details.
displayDetails() – Display details of a person.
updateAddress() – Update the address of a person.
updateContact() – Update contact number.
showBasicInfo() – Display ID, name, and contact number.
Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
Child Class 2 – Faculty extends Person
Additional Data Members:
String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.


Operations to Perform (Sequentially):
Add student details using addDetails() method.
Enter marks for three subjects using enterMarks().
Calculate and store the student’s percentage using calculatePercentage().
Update the student’s contact number using updateContact().
Display all details of the student using displayDetails().
Add faculty details using addDetails() method.
Assign subject to faculty using assignSubject().
Calculate salary increment for the faculty using calculateIncrement().
Update the faculty’s address using updateAddress().
Display complete faculty information using displayFacultyInfo().

Instructions:
Use constructors in all classes for initialization.
Use the super keyword to call parent constructors in child classes.
Apply method overriding for displayDetails() to show specific outputs for each child class.
Perform all 10 operations sequentially in the main() method.
Do not use collections; use arrays or primitive variables only.
*/
import java.util.*;
public class ManageCollage{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name, address, contactNo of student");
		 int id = sc.nextInt();
		 String name = sc.next();
		 String address = sc.next(); 
		 String contactNo = sc.next();
		 
		 Person p = new Student();
		 p.setDetails(id, name, address, contactNo);
		 System.out.println("Enter the marks of Student");
		 int marks[] = new int[3];
		 for(int i=0; i<marks.length; i++){
			 marks[i] = sc.nextInt();
		 }
		 
		 p.enterMarks(marks);
		 p.calculatePercentage();
		System.out.println("Enter new contactNo of student");
		contactNo = sc.next();
		 p.updateContact(contactNo);
		 p.displayDetails();
		 
		 p= new Faculty();
		System.out.println("Enter id, name, address, contactNo of faculty");
		id= sc.nextInt();
		name = sc.next();
		address = sc.next();
		contactNo = sc.next();
		p.setDetails(id, name, address, contactNo);
		System.out.println("Enter salary and experience of faculty");
		
		double salary = sc.nextInt();
		int experience = sc.nextInt();
		p.addDetails(salary, experience);
		p.calculateIncrement();
		System.out.println("Enter new address of teacher");
		address = sc.next();
		p.updateAddress(address);
		p.displayFacultyInfo();
	}
}

class Person{
	protected int id;
	protected String name,address,contactNo;
	protected int marks[];
	String subject;
	double salary;
	int experience;
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getContactNo(){
		return contactNo;
	}
	
	void setDetails(int id, String name, String address, String contactNo){
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	void displayDetails(){
		System.out.println(id + "\t" + name + "\t" + address + "\t" + contactNo);
	}
	
	void updateAddress(String address){
		this.address = address;
	}
	
	void updateContact(String contactNo){
		this.contactNo = contactNo;
	}
	
	void showBasicInfo(){
		System.out.println(id + "\t" + name + "\t" + contactNo);
	}
	public void enterMarks(int []marks)
	{
		this.marks = marks;
	}
	public void calculatePercentage(){
		double sum=0;
		for(double mark:marks){
			sum+=mark;
		}
			
	}
	void assignSubject(String subject)
	{
		this.subject = subject;
	}
	void calculateIncrement()
	{
		if(experience >= 5){
			salary += salary*0.10;
		}
		
	}
	void displayFacultyInfo()
	{
		System.out.println(subject +"\t"+ salary+"\t"+experience);
	}
	void addDetails(double salary, int experience){
		this.salary = salary;
		this.experience = experience; 
	}
	
}

class Student extends Person{
	protected String courseName;
	protected int marks[];
	protected double percentage;
	
	
	public void enterMarks(int []marks)
	{
		this.marks = marks;
	}
	public void calculatePercentage(){
		double sum=0;
		for(int mark:marks){
			sum+=mark;
		}
		percentage = sum*100/marks.length;
		
	}
	
	void displayDetails(){
		System.out.println(id + "\t" + name + "\t" + address + "\t" + contactNo +"\t"+ percentage);
	}
	
	void updateAddress(String address){
		this.address = address;
	}
	
	void updateContact(String contactNo){
		this.contactNo = contactNo;
	}
	
	void showBasicInfo(){
		System.out.println(id + "\t" + name + "\t" + contactNo);
	}
}
class Faculty extends Person{

	void addDetails(double salary, int experience){
		this.salary = salary;
		this.experience = experience;
	}
	
	void displayDetails(){
		System.out.println(id + "\t" + name + "\t" + address + "\t" + contactNo);
	}
	
	void updateAddress(String address){
		this.address = address;
	}
	
	void updateContact(String contactNo){
		this.contactNo = contactNo;
	}
	
	void showBasicInfo(){
		System.out.println(id + "\t" + name + "\t" + contactNo);
	}
	
	void assignSubject(String subject)
	{
		this.subject = subject;
	}
	void calculateIncrement()
	{
		if(experience >= 5){
			salary += salary*0.10;
		}
		
	}
	void displayFacultyInfo()
	{
		System.out.println(subject +"\t"+ salary+"\t"+experience);
	}
}