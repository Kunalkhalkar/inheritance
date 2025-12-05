/*Q1. Vehicle Insurance System – Premium Calculation
Create the following class structure:
Parent class: Vehicle
 Fields: brand, model, basePrice
 Methods: calculatePremium() → returns basePrice * 0.05
Child classes:
Car → premium increases by 12% if the car has airbags, otherwise 5%
Bike → premium increases by 8% if bike has ABS, otherwise 3%
Task:
Accept details for 5 vehicles (mix of Car and Bike).
Calculate premium using overridden logic.
Display the vehicle with the highest insurance premium.
Concepts Used
Method overriding
Polymorphism
Logical conditions
Finding maximum from object array
*/
import java.util.*;
public class VehicleInsurance{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Vehicle []c = new Vehicle[5];
		for(int i = 0; i< c.length-2; i++){
			
		System.out.println("Enter the brand, model, base price, Number of airbags of car ");
		String brand = sc.next();
		int model = sc.nextInt();
		Double basePrice = sc.nextDouble();
		int airbag = sc.nextInt();
			c[i] = new Car();
			c[i].setBrand(brand);
			c[i].setModel(model);
			c[i].setBasePrice(basePrice);
		}
		System.out.println("Enter the brand, model, base price, Number of abs brake of bike");
		String brand = sc.next();
		int model = sc.nextInt();
		Double basePrice = sc.nextDouble();
		int abs = sc.nextInt();
		c[4] = new Bike();
		c[4].setBrand(brand);
		c[4].setModel(model);
		c[4].setBasePrice(basePrice);
		c[4].setAbs(abs);
		
		System.out.println("Enter the brand, model, base price, Number of abs brake of bike");
		String brand1 = sc.next();
		int model1 = sc.nextInt();
		Double basePrice1 = sc.nextDouble();
		int abs1 = sc.nextInt();
		c[5] = new Bike();
		c[5].setBrand(brand1);
		c[5].setModel(model1);
		c[5].setBasePrice(basePrice1);
		c[5].setAbs(abs1);
		
		
		Vehicle v = new Vehicle();
		v.setVehicle(c);
	}
	
}
class Vehicle{
	private String brand;
	private int model;
	private double basePrice;
	private int airbag, abs;
	public Vehicle []v1;
	
	public void setVehicle(Vehicle[] v1){
		this.v1 = v1;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setModel(int model){
		this.model = model;
	}
	public void setBasePrice(double basePrice){
		this.basePrice = basePrice;
	}
	public void setAirbag(int airbag){
		this.airbag = airbag;
	}
	public void setAbs(int abs){
		this.abs = abs;
	}
	
	public String getBrand(){
		return brand;
	}
	public int getModel(){
		return model;
	}
	public double getBasePrice(){
		return basePrice;
	}
	public int getAirbag(){
		return airbag;
	}
	public int getAbs(){
		return abs;
	}
	
	double calculatePremium(){
		return getBasePrice() * 0.05;
	}
	
}

class Car extends Vehicle{
	
	double calculatePremium(){
		for(int i =0; i<v1.length-2; i++){
		if(v1[i].getAirbag() > 0){
			return getBasePrice() * 0.12;
		}
		}
		return getBasePrice() * 0.05;
	}
	
}

class Bike extends Vehicle{
	double calculatePremium(){
		
		for(int i = v1.length-2; i<v1.length; i++){
		if(v1[i].getAbs() > 0){
			return getBasePrice() * 0.08;
		}
		}
		return getBasePrice() * 0.03;
		
	}
	
} 