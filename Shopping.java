/*Q4. Shopping Discount System – Multiple Inheritance Style (via classes)
Parent class: Product
Fields: name, price
 Method: getFinalPrice()
 
Child classes:
Electronics
If price > 20,000 → 18% discount
Else 10%

Clothing
If seasonalSale → 30% discount
Else 5%

Groceries
No discount unless member = true → 3%

Task:
Accept 15 items.
Apply discounts via overridden methods.

Print:
Item with minimum final price
Total bill for all items
Items where discount given > 1000.
Concepts
Overriding discount logic
Boolean logic + arithmetic
Aggregation and filtering
*/
import java.util.*;
public class Shopping{
	
	public static void main(String x[]){
		String name;
		double price;
		boolean seasonalSale, isMember;
		Scanner sc = new Scanner(System.in);
		
		Product []b = new Product[3];
		for(int i = 0; i< b.length; i++){
		System.out.println("Enter the choice \n1. add Electronics \n2.add clothing \n3.add Grocceries");
		int ch = sc.nextInt();
		switch(ch){
			case 1:
				System.out.println("Enter the name and price of electronics item");
				name =sc.next();
				price = sc.nextDouble();
				b[i] = new Electronics(name, price);
				break;
				
			case 2: 
				System.out.println("Enter the name, price, seasonalSale(enter false for 'NO', true for 'YES') for clothing item");
				name = sc.next();
				price = sc.nextDouble();
				seasonalSale = sc.nextBoolean();
				b[i] = new Clothing(name, price, seasonalSale);
				break;
				
			case 3:
				System.out.println("Enter the name, price, isMember(enter false for 'NO', true for 'YES') for Groceries item ");
				name = sc.next();
				price = sc.nextDouble();
				isMember = sc.nextBoolean();
				b[i] = new Groceries(name, price, isMember);
				break;
				
			default:
				i--;
				System.out.println("Wrong choice select again \n");
			}
			
		}
		double finalPrice = b[0].getFinalPrice();
		 name = b[0].name;
		 int i=0;
		 Product []p = new Product[12];
		for(Product pr:b){
			System.out.println(pr.name+"\t"+pr.price);
			double result = pr.getFinalPrice();
			if(result < finalPrice){
				finalPrice = result;
				name = pr.name;
			}
			if((pr.price - result) > 1000){
				p[i] = pr;
				i++;
			}
		}
		System.out.println("minium final price " +name +" is "+ finalPrice);
		
		double finalBill = 0;
		for(Product p1: b){
			finalBill += p1.getFinalPrice();
		}
		System.out.println("Final amount of all product is : " + finalBill);
		System.out.println("product with more than 1000 discount");
		double finPrice;
		for(int j =0; j<i; j++){
			finPrice = p[j].getFinalPrice();
			System.out.println(p[j].name + "\t"+ p[j].price + "\t" +finPrice);
		}
	}
}
class Product{
	String name;
	double price;
	
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public double getFinalPrice(){
		
		return price;
		
	}
}

//Electronics
// If price > 20,000 → 18% discount
// Else 10%
class Electronics extends Product{
	Electronics(String name, double price){
		super(name, price);
	}
	public double getFinalPrice(){
		if(price > 20000){
			return (price - (price*0.18));
		}
		return (price - (price*0.10));
	}
}
// Clothing
// If seasonalSale → 30% discount
// Else 5%
class Clothing extends Product{
	boolean seasonalSale;
	Clothing(String name, double price, boolean seasonalSale){
		super(name, price);
		this.seasonalSale = seasonalSale;
	}
	public double getFinalPrice(){
		if(seasonalSale){
			return price - price * 0.30;
		}
		return price - price * 0.05;
	}
}
// Groceries
// No discount unless member = true → 3%

class Groceries extends Product{
	boolean isMember;
	Groceries(String name, double price, boolean isMember){
		super(name, price);
		this.isMember = isMember;
	}
	public double getFinalPrice(){
		
		if(isMember){
			return price - price * 0.03;
		}
		return price;
	}
}
