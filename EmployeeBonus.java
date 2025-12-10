/*Q5. Employee Bonus Calculation - Interface with Multiple Rule Classes
Interface: BonusRules
Method:
double getBonus(double salary)
Implementing Classes:

PermanentEmployee
Bonus = 20% of salary

ContractEmployee
Bonus = 10%

Intern
Bonus = fixed ₹2000

Task:
Add 7 employees with different types.
Calculate and print final salary including bonus.
Count how many employees get bonus above 5000.

Explanation:
Covers:
Interface usage
Multiple implementations
Percentage vs fixed logic
Counting based on a condition
*/
import java.util.*;
public class EmployeeBonus{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		BonusRules []br = new BonusRules[5];
		double bonus =0, salary=0, totalSalary=0, count =0;
		for(int i = 0; i<br.length; i++){
			System.out.println("Enter the choice");
			System.out.println("1. permanent Employee \n2. contract Employee \n3. Intern");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter the Employee Salary");
					salary = sc.nextDouble();
					br[i] = new PermanentEmployee();
					bonus = br[i].getBonus(salary);
					totalSalary = bonus + salary;
					if(bonus > 5000)
						count++;
					System.out.println("salary after adding the bonus is : "+ totalSalary);
					break;
					
				case 2:
					System.out.println("Enter the salary of contract employee");
					salary = sc.nextDouble();
					br[i] = new ContractEmployee();
					bonus = br[i].getBonus(salary);
					totalSalary = bonus + salary;
					if(bonus > 5000)
						count++;
					System.out.println("total salary of the contract employee is : "+ totalSalary);
					break;
					
				case 3:
					System.out.println("Enter the salary of Intern");
					salary = sc.nextDouble();
					br[i] = new Intern();
					bonus = br[i].getBonus(salary);
					totalSalary = bonus + salary;
					
					if(bonus > 5000)
						count++;
					
					System.out.println("Total salary of intern is : "+ totalSalary);
					break;
					
				default:
					i--;
					System.out.println("Wrong chice");
			}
		}
		
		System.out.println("total employee get bonus more than 5000 is : "+count);
	}
}
interface BonusRules{
	double getBonus(double salary);
}

class PermanentEmployee implements BonusRules{
	public double getBonus(double salary){
		return salary * 1.20;
	}
}
class ContractEmployee implements BonusRules{
	public double getBonus(double salary){
		return salary * 1.10;
	}
}

class Intern implements BonusRules{
	public double getBonus(double salary){
		return 2000;
	}
}