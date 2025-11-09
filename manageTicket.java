/*7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.


BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.


Explanation:
 Tests method overriding with percentage-based calculations.
*/
import java.util.*;
public class ManageTicket{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of movie ticket");
		int price = sc.nextInt();
		Ticket t = new MovieTicket();
		t.setPrice(price);
		System.out.println(t.calculatePrice());
		
		System.out.println("Enter the price of Bus ticket");
		price = sc.nextInt();
		t = new BusTicket();
		t.setPrice(price);
		System.out.println(t.calculatePrice());
	}	
}
class Ticket {
	protected int price;
	void setPrice(int price){
		this.price = price;
	}
	
		double calculatePrice(){
			return price;
		}
}

class MovieTicket extends Ticket{
	double calculatePrice(){
		return price+ price *0.18;
	}
}

class BusTicket extends Ticket{
	double calculatePrice(){
		return price+ price *0.05;
	}
}