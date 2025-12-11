/*Q1. Bank Interest Calculation – Abstract Class
Abstract class: BankAccount
Fields:
accountNumber
balance

Methods:
abstract double calculateInterest()
void deposit(double amt)
void withdraw(double amt)

Child classes:
SavingAccount → interest = balance × 6%
CurrentAccount → interest = balance × 4%
FixedDepositAccount → interest = balance × 7.5%

Task:
Create an array of 6 accounts (mix of all three types).
For each, calculate interest and update balance.
Find the account with the highest interest earned.

Explanation:
This checks:
Abstract class with normal + abstract methods
Different calculation logic in child classes
Using polymorphism to store mixed objects
Finding maximum value
*/
import java.util.*;
public class Bank{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		BankAccount []ba = new BankAccount[5];
		double highestInterest =0;
		for(int i=0; i<ba.length; i++){
		System.out.println("Enter the choice");
		System.out.println("1.savings account \n2.current account \n3.fixed deposit account");
		int ch = sc.nextInt();
		switch(ch){
			case 1:
				System.out.println("Enter bank acoount number and balance of the savings account");
				int accountNumber = sc.nextInt();
				double balance = sc.nextInt();
				ba[i] = new SavingAccount(accountNumber, balance);
				double interest = ba[i].calculateInterest();
				if(interest > highestInterest)
					highestInterest = interest;
				System.out.println(interest + "\nThis amount will credited to your balance");
				break;
				
			case 2:
				System.out.println("Enter bank acoount number and balance of the current account");
				accountNumber = sc.nextInt();
				balance = sc.nextInt();
				ba[i] = new CurrentAccount(accountNumber, balance);
				interest = ba[i].calculateInterest();
				if(interest > highestInterest)
					highestInterest = interest;
				System.out.println(interest + "\nThis amount will credited to your balance");
				break;
				
			case 3:
				System.out.println("Enter bank acoount number and balance of the fixed Deposit account");
				accountNumber = sc.nextInt();
				balance = sc.nextInt();
				ba[i] = new FixedDepositAccount(accountNumber, balance);
				interest = ba[i].calculateInterest();
				if(interest > highestInterest)
					highestInterest = interest;
				System.out.println(interest+ "\nThis amount will credited to your balance");
				break;
				
			default:
				i--;
				System.out.println("This is wrong choice");
		}
		}
		System.out.println("account number\t current balance");
		for(BankAccount balance:ba){
			System.out.println(balance.AccountNumber + "\t"+ balance.balance);
		}
		
	}
}

abstract class BankAccount{
	int AccountNumber;
	double balance;
	
	BankAccount(int AccountNumber, double balance){
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}
	
	abstract double calculateInterest();
	
	void deposit(double amount){
		balance += amount;
	}
	void withdraw(double amount){
		if(balance > amount){
			balance -= amount;
		}
	}
}
class SavingAccount extends BankAccount{
	SavingAccount(int accountNumber, double balance){
		super(accountNumber, balance);
	}
	
	public double calculateInterest(){
		double amount = this.balance * 0.06;
		super.deposit(amount);
		return amount;
	}
}

class CurrentAccount extends BankAccount{
	CurrentAccount(int accountNumber, double balance){
		super(accountNumber, balance);
	}
	
	public double calculateInterest(){
		double amount = balance * 0.04;
		super.deposit(amount);
		return amount;
		
	}
}

class FixedDepositAccount extends BankAccount{
	FixedDepositAccount(int accountNumber, double balance){
		super(accountNumber, balance);
	}
	
	public double calculateInterest(){
		double amount = balance * 0.075;
		super.deposit(amount);
		return amount;
	}
}