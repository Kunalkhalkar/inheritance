/*Q1. Online Payment System – Using Interface
Interface: Payment
Methods:
processPayment(double amount)
getCharges()
Classes Implementing Interface:
UPI – No extra charges
CreditCard – 2% processing fee
DebitCard – 1% processing fee

Task:
Take 5 payments (mix of UPI, credit, debit).
Print final amount after adding charges.
Count how many payments used CreditCard.

Explanation:
This question checks:
How class implements an interface
Polymorphism using interface reference
Logic to add percentage charges
Filtering and counting items
*/
import java.util.*;
public class MakeMyPayment{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Payment []p = new Payment[5];
		for(int i =0; i<p.length; i++){
			System.out.println("Enter the choice\n1.UPI \n2.debit Card\n3.credit Card");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter the amount");
					p[i] = new UPT();
					p[i].processPayment(amount);
			}
		}
	}
	
}

interface Payment{
	double processPayment(double amount);
	double getCharges();
}

class UPI implements Payment{
	double charge;
	public double processPayment(double amount){
		charge = amount * 0.1;
		return amount + charge;
	}
	
	public double getCharges(){
		return charge;
	}
}
class CreditCard implements Payment{
	public double processPayment(double amount){
		return amount * 1.02;
	}
	
	public double getCharges(){
		return 0.2;
	}
}
class DebitCard implements{
	public double processPayment(double amount){
		return amount * 1.01;
	}
	
	public double getCharges(){
		return 0.1;
	}
}