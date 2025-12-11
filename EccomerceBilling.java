/*Q3. E-Commerce Order Billing – Abstract Billing Class
Abstract class: Order
Fields:
id, price

Method:
abstract double finalPrice()

Child classes:
ElectronicsOrder
GST = 18%
If price > 50,000 → add luxury tax = 5%

GroceryOrder
GST = 5%
If member = true → 3% discount
FashionOrder
GST = 12%
If price > 5,000 → discount = 10%

Task:
Create 9 orders.
Calculate final price of each.

Print:
total bill
order with minimum final price

Explanation:
Uses :
Abstract class with only one abstract method
Complex logical conditions inside child implementations
Summation and min-value detection
*/
import java.util.*;
public class EccomerceBilling{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Order []o = new Order[5];
		double minFinPrice = Integer.MAX_VALUE;
		int minId;
		for(int i=0; i<o.length; i++){
			System.out.println("Enter the choice");
			System.out.println("1.Electronics Order \n2.Grocery Order \n3.Fashion Order");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter id and Price of electronics order");
					int id = sc.nextInt();
					double price = sc.nextDouble();
					o[i] = new ElectronicsOrder(id, price);
					double finalPrice = o[i].finalPrice();
					if(minFinPrice > finalPrice){
						minFinPrice = finalPrice;
						minId = o[i].id;
					}
					System.out.println("Your Final Bill Is : "+finalPrice);
					break;
					
				case 2:
					System.out.println("Enter id and Price and id Member (true or false) of Grocery order");
					id = sc.nextInt();
					price = sc.nextDouble();
					boolean flag = sc.nextBoolean();
					o[i] = new GroceryOrder(id, price, flag);
					finalPrice = o[i].finalPrice();
					
					if(minFinPrice > finalPrice){
						minFinPrice = finalPrice;
						minId = o[i].id;
					}
					System.out.println("Your Final Bill Is : "+finalPrice);
					
					break;
					
				case 3:
					System.out.println("Enter id , price of Fashion items");
					id = sc.nextInt();
					price = sc.nextDouble();
					o[i] = new FashionOrder(id , price);
					
					finalPrice = o[i].finalPrice();
					if(minFinPrice > finalPrice){
						minFinPrice = finalPrice;
						minId = o[i].id;
					}
					System.out.println("Your Final Bill Is : "+finalPrice);
					
					break;
					
				default:
					i--;
					System.out.println("Wrong choice");
			}
		}
		System.out.println("Minimum bill is : "+ minFinPrice+" with id " + minId);
		
	}
	
}

abstract class Order{
	int id;
	double price;
	Order(int id, double price){
		this.id = id;
		this.price = price;
	}
	abstract double finalPrice();
}

class ElectronicsOrder extends Order{
	ElectronicsOrder(int id, double price){
		super(id, price);
	}
	public double finalPrice(){
		double finalPrice= price * 1.18;
		if(price > 50000)
			finalPrice += finalPrice * 0.05;
		return finalPrice;
	}	
}

class GroceryOrder extends Order{
	
	boolean isMember;
	GroceryOrder(int id, double price, boolean isMember){
		super(id, price);
		this.isMember  = isMember;
	}
	
	public double finalPrice(){
		double finalPrice= price * 1.05;
		if(isMember)
			finalPrice -= finalPrice * 0.03;
		return finalPrice;
	}
	
}

class FashionOrder extends Order{
	FashionOrder(int id, double price){
		super(id, price);
	}
	public double finalPrice(){
		double finalPrice= price * 1.12;
		if(price > 5000)
			finalPrice += finalPrice * 0.10;
		return finalPrice;
	}
}
