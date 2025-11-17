/*
Q2. Problem Statement:
Write a Java program to implement the concept of inheritance for different types of vehicles.
 The program must include four classes:
Vehicle – Superclass
Bus – Subclass of Vehicle
Truck – Subclass of Vehicle
Transport – Driver class containing the main() method


The goal is to demonstrate the concept of inheritance, constructor chaining, method overriding, and object-oriented encapsulation.
Detailed Description:
1. Class: Vehicle (Superclass)
Data Members:
String model – Vehicle model
String registrationNumber – Registration number of the vehicle
double speed – Vehicle speed in kilometers per hour
double fuelCapacity – Fuel tank capacity in liters
double fuelConsumption – Fuel consumption in kilometers per liter


Member Methods:
Parameterized Constructor
Initializes all data members with the given values.
Getters and Setters

Provide get and set methods for each data member.

fuelNeeded(double distance)

Accepts distance (in kilometers) as an argument.

Calculates and returns the amount of fuel required for that distance.

distanceCovered(double time)

Accepts time (in hours) as an argument.
Calculates and returns the distance covered based on the vehicle’s speed.
display()

Displays all details of the vehicle, including model, registration number, speed, fuel capacity, and fuel consumption.
2. Class: Truck (Subclass of Vehicle)
Additional Data Member:
double cargoWeightLimit – Cargo carrying capacity in kilograms.
Member Methods:
Parameterized Constructor


Initializes all data members, including those inherited from the Vehicle class (using super()), and cargoWeightLimit.


Overridden display() Method


Must call super.display() to display the base class details,
 and then display the cargo weight limit specific to the truck.
3. Class: Bus (Subclass of Vehicle)
Additional Data Member:
int numberOfPassengers – Total number of passengers the bus can carry.


Member Methods:
Parameterized Constructor


Initializes all data members, including those from the superclass (using super()).


Getters and Setters


Provide getter and setter methods for numberOfPassengers.


Overridden display() Method


Must call super.display() to display base class details,
 and then display the number of passengers specific to the bus.
4. Class: Transport (Driver Class)
Description:
 This class must contain the main() method to test inheritance and method overriding.
Steps to Perform in main() Method:
Create an object of Truck and initialize all its data members with valid values using the parameterized constructor.


Create an object of Bus and initialize all its data members with valid values using the parameterized constructor.


For both objects:


Call the fuelNeeded() method by passing a sample distance (e.g., 500 km).


Call the distanceCovered() method by passing a sample time (e.g., 5 hours).


Call the display() method to display all details.
Concepts Demonstrated:
Inheritance (Superclass → Subclasses)


Constructor Chaining using super()


Method Overriding (display() method)


Encapsulation (Private data members with getters/setters)


Polymorphism (Different display() methods for Bus and Truck)
*/
import java.util.*;
public class Transport{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the model, registration number speed fuel Capacity, fuel Consumption, cargo weight limit of truck");
		String model = sc.next();
		String registrationNumber = sc.next();
		double speed = sc.nextDouble();
		double fuelCapacity = sc.nextDouble();
		double fuelConsumption = sc.nextDouble();
		double cargoWeightLimit= sc.nextDouble();
		
		Vehicle v1 = new Truck(model, registrationNumber, speed, fuelCapacity, fuelConsumption, cargoWeightLimit);
		System.out.println("enter the distance to calculate the fuel used");
		double distance = sc.nextDouble();
		System.out.println("total fuel required: "+v1.fuelNeeded(distance));
		System.out.println("Enter the time to calculate distance travelled");
		double time = sc.nextDouble();
		System.out.println("total Distance covered: "+v1.distanceCovered(time));
		v1.display();
		
		System.out.println("Enter the model, registration number speed fuel Capacity, fuel Consumption, cargo weight limit of truck");
		model = sc.next();
		registrationNumber = sc.next();
		speed = sc.nextDouble();
		fuelCapacity = sc.nextDouble();
		cargoWeightLimit= sc.nextDouble();
		fuelConsumption = sc.nextDouble();
		
		Vehicle v2 = new Truck(model, registrationNumber, speed, fuelCapacity, fuelConsumption, cargoWeightLimit);
		System.out.println("enter the distance to calculate the fuel used");
		distance = sc.nextDouble();
		System.out.println("total fuel required: "+v2.fuelNeeded(distance));
		System.out.println("Enter the time to calculate distance travelled");
		time = sc.nextDouble();
		System.out.println("total Distance covered: "+v2.distanceCovered(time));
		v2.display();
		
		System.out.println("Enter the model, registration number speed fuel Capacity, fuel Consumption, passengers in bus");
		model = sc.next();
		registrationNumber = sc.next();
		speed = sc.nextDouble();
		fuelCapacity = sc.nextDouble();
		fuelConsumption = sc.nextDouble();
		int numberOfPassengers= sc.nextInt();
		
		Vehicle b1 = new Bus(model, registrationNumber, speed, fuelCapacity, fuelConsumption, numberOfPassengers);
		System.out.println("enter the distance to calculate the fuel used");
		distance = sc.nextDouble();
		System.out.println("total fuel required: "+b1.fuelNeeded(distance));
		System.out.println("Enter the time to calculate distance travelled");
		time = sc.nextDouble();
		System.out.println("total Distance covered: "+b1.distanceCovered(time));
		b1.display();
	}
}

class Vehicle{
	protected String model,registrationNumber;
	protected double speed, fuelCapacity,fuelConsumption;
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSpeed() {
		return speed;
	}
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public double getFuelConsumption() {
		return fuelConsumption;
	}

	Vehicle(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption){
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.speed = speed;
		this.fuelCapacity = fuelCapacity;
		this.fuelConsumption = fuelConsumption;
	}
	
	double fuelNeeded(Double distance){
		return (getFuelConsumption()/distance);
	}
	
	double distanceCovered(double time){
		return (getSpeed() * time);
	}
	
	void display(){
		System.out.println("Model: " + getModel());
		System.out.println("Registration Number: " + getRegistrationNumber());
		System.out.println("Speed: " + getSpeed() + " km/h");
		System.out.println("Fuel Capacity: " + getFuelCapacity() + " liters");
		System.out.println("Fuel Consumption: " + getFuelConsumption() + " km/l");
	}
}
class Truck extends Vehicle{
	
	protected double cargoWeightLimit;
	
	public double getCargoWeightLimit() {
		return cargoWeightLimit;
	}
	public void setCargoWeightLimit(double cargoWeightLimit) {
		this.cargoWeightLimit = cargoWeightLimit;
	}	
	Truck(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption,double cargoWeightLimit){
		super(model, registrationNumber, speed, fuelCapacity, fuelConsumption);
		this.cargoWeightLimit = cargoWeightLimit;
	}
	void display(){
		super.display();
		System.out.println("cargo Weight limit: "+ getCargoWeightLimit());
	}
	double fuelNeeded(Double distance){
		return (getFuelConsumption()/distance);
	}
	
	double distanceCovered(double time){
		return (getSpeed() * time);
	}
	
	
}
class Bus extends Vehicle{
	protected int numberOfPassengers;

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	Bus(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption,int numberOfPassengers){
		super(model, registrationNumber, speed, fuelCapacity, fuelConsumption);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	void display(){
		super.display();
		System.out.println("number of passenger: "+getNumberOfPassengers());
	}
	
	double fuelNeeded(Double distance){
		return (getFuelConsumption()/distance);
	}
	
	double distanceCovered(double time){
		return (getSpeed() * time);
	}
	
}

