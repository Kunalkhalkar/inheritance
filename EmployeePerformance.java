/*Q4. Employee Performance System – Abstract Score Calculation
Abstract class: Employee
Fields:
name, id

Method:
abstract int performanceScore()

Child classes:
Developer
Score = completedTasks × 10

Tester
Score = bugsFound × 5

Manager
Score = teamHandled × 20 + projectsDelivered × 15

Task:
Create 8 employees of mixed types.
Calculate score for each user.
Print employees who have score ≥ 80.

Explanation:
Demonstrates:
Abstract method implemented differently
Logical operations based on multiple fields
Filtering objects with conditions
*/
import java.util.*;
public class EmployeePerformance{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Employee []e = new Employee[5];
		for(int i=0; i< e.length; i++){
			System.out.println("Enter the choice");
			System.out.println("1.add developer \n2.add Tester \n3.add Manager");
			int ch = sc.nextInt();
			
			switch(ch){
				case 1:
					System.out.println("Enter the name, id, task completed by developer");
					String name = sc.next();
					int id= sc.nextInt();
					int task = sc.nextInt();
					e[i] = new Developer(name, id, task);
					e[i].performanceScore();
					break;
					
				case 2:
					System.out.println("Enter the name, id, bug Found by tester");
					name = sc.next();
					id= sc.nextInt();
					int bugFind = sc.nextInt();
					e[i] = new Tester(name, id, bugFind);
					e[i].performanceScore();
					break;
					
				case 3:
					System.out.println("Enter the name, id, team handled and project delivered by manager");
					name = sc.next();
					id= sc.nextInt();
					int teamHandled =sc.nextInt();
					int projectDelivered = sc.nextInt();
					e[i] = new Manager(name, id, teamHandled, projectDelivered);
					e[i].performanceScore();
					break;
					
				default:
					i--;
					System.out.println("Wrong choice");
			}
		}
		System.out.println("name \tid \tscore");
		for(Employee emp : e){
			System.out.println(emp.name +"\t"+ emp.id+"\t" +emp.score);
		}
		System.out.println("Employees with more than 80 score");
		for(Employee emp : e){
			if(emp.score > 80)
			System.out.println(emp.name +"\t"+ emp.id+"\t" +emp.score);
		}
		
	}
}
 
abstract class Employee{
	String name;
	int id;
	int score;
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	abstract int performanceScore();
}
class Developer extends Employee{
	int completedTask;
	
	Developer(String name, int id, int completedTask){
		super(name, id);
		this.completedTask = completedTask;
	}
	
	public int performanceScore(){
		this.score = completedTask * 10;
		return this.score;
	}
}
class Tester extends Employee{
	int bugFind;
	Tester(String name, int id, int bugFind){
		super(name, id);
		this.bugFind = bugFind;
	}
	public int performanceScore(){
		this.score = bugFind * 5;
		return this.score;
	}
}

class Manager extends Employee{
	int teamHandeled, projectDelivered;
	Manager(String name, int id, int TeamHandeled, int projectDelivered){
		super(name, id);
		this.teamHandeled = teamHandeled;
		this.projectDelivered = projectDelivered;
	}
	
	public int performanceScore(){
		this.score = teamHandeled * 20 + projectDelivered * 15;
		return this.score;
	}
	
}
