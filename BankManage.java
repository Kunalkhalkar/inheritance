/*2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/
import java.util.*;
public class BankManage{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bank balance of Savings Account");
		int bankBalance = sc.nextInt();
		BankBalance b = new SavingsAccount();
		b.setBankBalance(bankBalance);
		System.out.println(b.calculateInterest());
		
		b = new CurrentAccount();
		System.out.println("Enter bank balance of current Account");
		bankBalance = sc.nextInt();
		b.setBankBalance(bankBalance);
		System.out.println(b.calculateInterest());
		
	}
}

class BankBalance{
	int bankBalance;
	
	void setBankBalance(int balance){
		bankBalance = balance;
	}
	
	double calculateInterest(){
		return bankBalance;
	}
}

class SavingsAccount extends BankBalance{
	double calculateInterest(){
		return bankBalance + sbankBalance*0.05;
	}
}

class CurrentAccount extends BankBalance{
	double calculateInterest(){
		return bankBalance + bankBalance * 0.03;
	}
}