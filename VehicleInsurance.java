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
		
	}
}
class Vehicle{
	private String brand;
	private int model;
	private double basePrice;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setModel(int model){
		thid.moedel = model;
	}
	public void setBasePrice(double basePrice){
		this.basePrice = basePrice;
	}
	
	public String getBrand(){
		return brand;
	}
	public int getModel(){
		return model;
	}
	public getBasePrice(){
		return basePrice;
	}
}