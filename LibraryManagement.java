/*Q3. Library Fine Calculation – Interface with Rules
Interface: FineCalculator
Method:
calculateFine(int daysLate)

Implementing Classes:
Book
Fine = ₹2 × daysLate

Magazine
Fine = ₹3 × daysLate

ResearchPaper
Fine = ₹5 × daysLate
If daysLate > 10 → add extra ₹50

Task:
Accept 8 items (mix of all types).
Calculate fine and print details.
Find total fine collected.

Explanation:
Covers:
Interface method overriding
Logical conditions inside implementing classes
Summation of results
Mixing different classes via interface reference
*/
import java.util.*;
public class LibraryManagement{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		FineCalculator [] fc = new FineCalculator[5];
		int totalFine = 0, daysLate = 1;
		double fine = 0;
		for(int i =0; i< fc.length; i++){
			System.out.println("Enter the choice");
			System.out.println("1. Book fine \n2. magazine fine \n3.research Paper fine");
			int ch = sc.nextInt();
			switch (ch){
				case 1:
					fc[i] = new Book();
					System.out.println("Enter the days late for book");
					daysLate = sc.nextInt();
					fine = fc[i].calculateFine(daysLate);
					System.out.println("the fine is for book is :"+ fine);
					totalFine += fine;
					break;
					
				case 2:
					fc[i] = new Magazine();
					System.out.println("Enter the days late for magazine");
					daysLate = sc.nextInt();
					fine = fc[i].calculateFine(daysLate);
					System.out.println("the fine is for magazine is :"+ fine);
					totalFine += fine;
					break;
					
				case 3:
					fc[i] = new ResearchPaper();
					System.out.println("Enter the days late for research paper");
					daysLate = sc.nextInt();
					fine = fc[i].calculateFine(daysLate);
					System.out.println("the fine is for research paper is :"+ fine);
					totalFine += fine;
					break;
					
				default:
					i--;
					System.out.println("Wrong choice");
			}
		}
		System.out.println("The total fine calculated from library is : "+ totalFine);
		System.out.println();
	}
}
interface FineCalculator{
	
	double calculateFine(int daysLate);
}

class Book implements FineCalculator{
	public double calculateFine(int daysLate){
		return 2* daysLate;
	}
}

class Magazine implements FineCalculator{
	
	public double calculateFine(int daysLate){
		return 3* daysLate;
	}
}

class ResearchPaper implements FineCalculator{

		public double calculateFine(int daysLate){
			if(daysLate >10){
				return ( 5 * daysLate)+50;
			}
			return 5 * daysLate;
		}
}
