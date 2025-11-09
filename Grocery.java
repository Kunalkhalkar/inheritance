/*3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
*/
import java.util.*;
public class Grocery{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id, Name, Price of electronics product");
		int id = sc.nextInt();
		String name = sc.next();
		int price = sc.nextInt();
		Electronics e = new Electronics(id, name, price);
		System.out.println(e.calcPrice());
		
		System.out.println("Enter the id, Name, Price of Clothing product");
		id = sc.nextInt();
		name = sc.next();
		price = sc.nextInt();
		Clothing c = new Clothing(id, name, price);
		System.out.println(c.calcPrice());
		
		
		
	}
}
class Product{
	int id,price;
	String name;
	
	Product(int id, String name, int price){
		this.id = id;
		this.name= name;
		this.price= price;
	}
	
	double calcPrice(){
		return price;
	}
	
}

class Electronics extends Product{
	Electronics(int id, String name, int price){
		super(id,name,price);
	}
	double calcPrice(){
		return price - price * 0.01;
	}
}
class Clothing extends Product{
	Clothing(int id, String name, int price){
		super(id,name,price);
	}
	
	double calcPrice(){
		return price - price * 0.02;
	}
}
