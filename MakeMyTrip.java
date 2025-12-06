/*Q5. Transportation Booking System – Fare Calculation
Parent class: Transport
Fields: distance, baseFare
Child classes:
Bus
Fare = baseFare + (distance × 5)
If AC = true → add 20%

Train
Fare = baseFare + (distance × 4)
If sleeper → add 15%

Flight
Fare = baseFare + (distance × 10)
Add airport tax = ₹750
If businessClass → add 40%

Task:
Create 10 bookings.
Calculate final fare via overriding.

Print:
Total revenue
Bookings where fare > 20,000
Count bookings of each type

Concepts
Polymorphism
Multiple child classes
Logical filtering
Summation operations
*/
import java.util.*;
public class MakeMyTrip{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Transport []t = new Transport[3];
		int distance;
		double baseFare;
		boolean isAC, isSleeper, isBusinessClass;
		int bCount =0, tCount =0, fCount =0;
		
		for(int i =0; i<t.length; i++){
			System.out.println("Enter the choice\n1.bus\n2.train \n3.flight");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter the distance, base Fare and ac or not(true for AC false for Non-AC) for bus");
					distance = sc.nextInt();
					baseFare = sc.nextDouble();
					isAC = sc.nextBoolean();
					t[i] = new Bus(distance, baseFare, isAC);
					bCount++;
					break;
					
					
				case 2:
					System.out.println("Enter the distance, base Fare and sleeper or not(true for sleeper false for Non-sleeper) for train");
					distance = sc.nextInt();
					baseFare = sc.nextDouble();
					isSleeper = sc.nextBoolean();
					t[i] = new Train(distance, baseFare, isSleeper);
					tCount++;
					break;
					
				case 3:
					System.out.println("Enter the distance, base Fare and Business class or not(true for business class false for Non-business class) for flight");
					distance = sc.nextInt();
					baseFare =sc.nextDouble();
					isBusinessClass  = sc.nextBoolean();
					t[i] = new Flight(distance, baseFare, isBusinessClass);
					fCount++;
					break;
					
					
				default:
					i--;
					System.out.println("Wrong choice");
			}
			
		}
		/*Print:
Total revenue
Bookings where fare > 20,000
Count bookings of each type
*/
		double totalRevenue =0;
		for(Transport show : t){
			double fare = show.fare();
			totalRevenue += fare;
			if(fare > 20000){
				System.out.println(fare);
			}
		}
		System.out.println("total revenue from all booking : "+ totalRevenue);
		System.out.println("number of bookings \n bus\t train\tflight\n"+bCount+"\t"+tCount+"\t"+fCount);
	}
}
class Transport{
	int distance;
	double baseFare;
	
	Transport(int distance, double baseFare){
		this.distance = distance;
		this.baseFare = baseFare;
	}
		
	public double fare(){
		return baseFare;
	}
}
/*Bus
Fare = baseFare + (distance × 5)
If AC = true → add 20%
*/
class Bus extends Transport{
	boolean isAC;
	Bus(int distance, double baseFare, boolean isAC){
		super(distance, baseFare);
		this.isAC = isAC;
	}
	public double fare(){
		double fare = baseFare + distance * 5;
		if(isAC){
			return fare + fare * 0.20;
		}
		return fare;
	}
}
/*Train
Fare = baseFare + (distance × 4)
If sleeper → add 15%
*/
class Train extends Transport{
	boolean isSleeper;
	Train(int distance, double baseFare, boolean isSleeper){
		super(distance , baseFare);
		this.isSleeper = isSleeper;
	}
	public double fare(){
		double fare = baseFare + distance * 4;
		if(isSleeper){
			return fare + fare * 0.15;
		}
		return fare;
	}
}
/*Flight
Fare = baseFare + (distance × 10)
Add airport tax = ₹750
If businessClass → add 40%
*/
class Flight extends Transport{
	boolean isBusinessClass;
	
	Flight(int distance, double baseFare, boolean isBusinessClass){
		super(distance, baseFare);
		this.isBusinessClass = isBusinessClass;
		
	}
	public double fare(){
		double fare = baseFare + 750 + distance * 5;
		if(isBusinessClass){
			return fare + fare * 0.40;
		}
		return fare;
	}
}