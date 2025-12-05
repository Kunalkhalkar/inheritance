/*Q2. Employee Payroll System – Multiple Child Classes
Create:
Parent class: Employee
Fields: id, name, baseSalary
 Method: calculateSalary()
Child classes:

Manager:
Allowance = 40% of baseSalary
Bonus = ₹10,000 if teamSize > 10

Developer:
Allowance = 30%
Extra pay = ₹2000 × numberOfProjects

Intern:
Stipend = 50% of baseSalary

Task:
Create an array of 10 employees (mix of all types).
Implement salary calculation using overrides.
Display:
Employee with maximum salary
Count how many employees earn above 60,000.
Concepts Used
Inheritance + overriding
Polymorphism with reference array
Logical operations for filtering and counting
*/
import java.util.*;
public class EmployeeManage{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int id=-1, noOfProjects=-1, teamSize=-1;
		String name="null";
		double baseSalary = -1;
		
		Employee []e = new Employee[3];
		for(int i=0; i<e.length; i++){
			System.out.println("1.Manager \n2.Developer \n3.Intern");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter the id, name, base Salary, teamsize of manager");
					id= sc.nextInt();
					name= sc.next();
					baseSalary = sc.nextDouble();
					teamSize = sc.nextInt();
					e[i] = new Manager(id, name, baseSalary, teamSize);

					break;
					
				case 2:
					System.out.println("Enter the id, name, base Salary, number of project of developer");
					id= sc.nextInt();
					name= sc.next();
					baseSalary = sc.nextDouble();
					noOfProjects =sc.nextInt();
					e[i] = new Developer(id, name, baseSalary, noOfProjects);
					break;
					
				case 3:
					System.out.println("Enter the id, name, base Salary of intern");
					id= sc.nextInt();
					name= sc.next();
					baseSalary = sc.nextDouble();
					e[i] = new Intern(id, name, baseSalary);
					break;
					
				default: 
					i--;
					System.out.println("Error");
			}
		}
		for(Employee a:e){
		System.out.println(a.id + "\t" +a.name+"\t"+ a.baseSalary);
	}
	}
}
class Employee{
	 int id;
	 String name;
	 double baseSalary;
	
	Employee(int id, String name, double baseSalary){
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public double calculateSalary(){
		
		return baseSalary;
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(int id, String name, double baseSalary, int teamSize){
		super(id, name, baseSalary);
		this.teamSize = teamSize;
	}
	public double calculateSalary(){
		if(teamSize > 10){
			return (baseSalary + baseSalary * 0.40) + 10000;
		}
		
		return (baseSalary + baseSalary * 0.40);
	}
}
class Developer extends Employee{
	int noOfProject;
	
	Developer(int id, String name, double baseSalary, int noOfProject){
		super(id, name, baseSalary);
		this.noOfProject = noOfProject;
	}
	public double calculateSalary(){
		if(noOfProject >= 1){
		return (baseSalary + baseSalary * 0.30)+(noOfProject * 2000);	
		}
		return (baseSalary + baseSalary * 0.30);
	}
	
}
class Intern extends Employee{
	
	Intern(int id, String name, double baseSalary){
		super(id, name, baseSalary);
	}
	public double calculateSalary(){
		return (baseSalary+ baseSalary * 0.50);
		
	}
}