/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.


Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/
import java.util.*;
public class EmpManage{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and salary of manager");
		String name = sc.next();
		int salary = sc.nextInt();

		Employee e1 = new Manager();
		e1.setSalary(name, salary);
		System.out.println(e1.calcSalary());
		// Manager m = new Manager();
		// m.setSalary(name, salary);
		// 	System.out.println(m.calcSalary());
		System.out.println("Enter the name and salary of Developer");
		name = sc.next();
		salary =sc.nextInt();
		Developer d= new Developer();
		d.setSalary(name, salary);
		System.out.println(d.calcSalary());
		
	}
}

class Employee
{
	String name;
	int salary;
	void setSalary(String name, int salary){
		this.name = name;
		this.salary= salary;
	}
	
	double calcSalary(){
		return salary;
	}
}

class Manager extends Employee{
	double calcSalary(){
		return salary + salary * 0.20;
	}
	
}

class Developer extends Employee{
	double calcSalary(){
		return salary + salary * 0.10;
	}
}