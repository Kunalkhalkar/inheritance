/*8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.


CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.


Explanation:
 Tests inheritance with customized formula calculations.
*/
import java.util.*;
public class ManageBank{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount and years of loan for home");
		int amount = sc.nextInt();
		int years = sc.nextInt();
		Loan l = new HomeLoan();
		l.setValues(amount , years);
		l.calculateEMI();
		
		l = new CarLoan();
		System.out.println("Enter the amount and years of loan for home");
		amount = sc.nextInt();
		years = sc.nextInt();
		l.setValues(amount, years);
		l.calculateEMI();
	}
}
class Loan{
	protected int amount;
	protected int years;
	
	void setValues(int amount, int years){
		this.amount = amount;
		this.years =years;
	}
	
	void calculateEMI(){
		System.out.println(amount+" "+years+" "+ (amount /(years * 12)));
	}
}

class HomeLoan extends Loan{
	void calculateEMI(){
		System.out.println("Emi for home loan "+amount +" for "+ years + " is "+(amount + (amount*0.07))/(years * 12));
	}
}

class CarLoan extends Loan{
	void calculateEMI(){
		System.out.println("Emi for car loan "+amount +" for "+ years + " is "+(amount + (amount*0.09))/(years * 12));
	}
}
