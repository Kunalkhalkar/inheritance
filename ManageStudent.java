/*4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.
 */
 import java.util.*;
 public class ManageStudent{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of Student to check result");
		int marks = sc.nextInt();
		Student s= new EngineeringStudent();
		s.setMarks(marks);
		System.out.println("Engineering student "+s.showResult());
		
		s = new MedicalStudent();
		s.setMarks(marks);
		System.out.println("medical Student "+s.showResult());
		
		
	}
 }
 
 class Student {
	 int marks;
	 void setMarks(int mark){
		 marks = mark;
	 }
	 
	 String showResult(){
			 return "error";// student type is not declared so return error
	 }
 }
 
 class EngineeringStudent extends Student{
	 String showResult(){
		if(marks >=50)
			return "pass";// returning ressult
		else
			return "fail";
	 }
 }
 
 class MedicalStudent extends Student{
	  String showResult(){
		if(marks >=50)
			return "pass";// returning ressult
		else
			return "fail";
	 }
 }