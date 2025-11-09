/*9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.


EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.


Explanation:
 Tests inheritance where logic changes depending on product type.
*/
import java.util.*;
public class ManageProduct{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id, Name, Base Price of luxury products");
		int id = sc.nextInt();
		String name = sc.next();
		int basePrice = sc.nextInt();
		
		Product p = new LuxuryProduct();
		p.setValues(id, name, basePrice);
		System.out.println(p.getName()+"\t"+p.getId()+"\t"+p.calcTax());
		
		System.out.println("Enter Id, Name, Base Price of essential products");
		id =sc.nextInt();
		name =sc.next();
		basePrice = sc.nextInt();
		
		p = new EssentialProduct();
		p.setValues(id,name,basePrice);
		System.out.println(p.getName()+"\t"+ p.getId()+"\t"+ p.calcTax());
	}
}
class Product{
	 protected int basePrice;
	 protected String name;
	 protected int id;
	
	void setValues(int id, String name, int basePrice){
		this.id = id;
		this.name = name;
		this.basePrice = basePrice;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getBasePrice(){
		return basePrice;
	}	
	
	double calcTax(){
		return basePrice;
	}
}
class LuxuryProduct extends Product{
	double calcTax(){
		return basePrice + basePrice*0.20;
	}
}

class EssentialProduct extends Product{
	double calcTax(){
		return basePrice + basePrice*0.05;
	}
}