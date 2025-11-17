/*10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.


ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.


Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/
import java.util.*;
public class ManageEmployee{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of permanent Employee");
		int salary = sc.nextInt();
		Employee e = new PermanentEmployee();
		e.setSalary(salary);
		System.out.println(e.calculateBonus());
		
		System.out.println("Enter the salary of contract Employee");
		salary = sc.nextInt();
		e = new ContractEmployee();
		e.setSalary(salary);
		System.out.println(e.calculateBonus());
		
	}
}

class Employee{
	protected int salary;
	void setSalary(int salary){
		this.salary = salary;
	}
	
	double calculateBonus(){
		return salary;
	}
}

class PermanentEmployee extends Employee{
	double calculateBonus(){
		return salary * 0.25;
	}
}

class ContractEmployee extends Employee{
	double calculateBonus(){
		return salary * 0.10;
	}
}