/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
import java.util.*;
public class ArrayToArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int []a = new int[5];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =0; i<a.length; i++){
			 
			al.add(a[i]);
		}
		for(int ob:a){
			System.out.println(ob);
		}
		System.out.println("Array List Element");
		for(int obj:al){
			System.out.println(obj);
		}
		
	}
}