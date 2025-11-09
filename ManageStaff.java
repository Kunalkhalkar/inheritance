/*5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.


For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.


Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
 */
 import java.util.*;
 public class ManageStaff{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of Teaching Staff");
		int salary = sc.nextInt();
		Staff s = new TeachingStaff();
		s.setSalary(salary);
		System.out.println(s.incrementSalary());
		
		System.out.println("Enter salary of Non-Teaching Staff");
		salary = sc.nextInt();
		s = new NonTeachingStaff();
		s.setSalary(salary);
		System.out.println(s.incrementSalary());
		
	}
 }
 
 class Staff{
	 int salary;
	 
	 void setSalary(int salary){
		 this.salary = salary;
	 }
	 
	 double incrementSalary(){
		 return salary;
	 }
 }
 
 class NonTeachingStaff extends Staff{
	 double incrementSalary(){
		 return salary + salary*0.10;
	 }	 
}

class TeachingStaff extends Staff{
		 double incrementSalary(){
		 return salary + salary*0.15;
	 }
} 
 
 