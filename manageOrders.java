/*6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.


Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.


Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.

*/
import java.util.*;
public class ManageOrders{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order id and amount of cod Orders");
		int id = sc.nextInt(),amount = sc.nextInt();
		
		Orders o = new CODOrders();
		o.setAmount(amount);
		System.out.println("cod order total "+o.finalBill());
		
		
		System.out.println("Enter order id and amount of online payment orders");
		id = sc.nextInt();
		amount = sc.nextInt();
		o = new OnlinePaymentOrder();
		o.setAmount(amount);
		System.out.println("online order bill "+o.finalBill());
	}
}

class Orders{
	int amount;
	void setAmount(int amount){
		this.amount = amount;
	}
	
	double finalBill(){
		return amount;
	}
}

class CODOrders extends Orders{
	double finalBill(){
		return amount + 50;
	}
}

class OnlinePaymentOrder extends Orders{
	double finalBill(){
		return amount - amount * 0.05;
	}
}