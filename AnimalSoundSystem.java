/*
Q2. Animal Sound System – Abstract Behavior
Abstract class: Animal

Methods:
abstract void sound()
abstract String category()

Child classes:
Dog → sound: “Bark”, category: “Pet”
Lion → sound: “Roar”, category: “Wild”
Snake → sound: “Hiss”, category: “Reptile”

Task:
Store 10 animals (mixed types).
Print sound + category for each.
Count how many animals belong to category “Pet”.

Explanation:
Tests:
Abstract methods needing compulsory override
Multiple child classes
Logical counting based on return values
Runtime polymorphism

*/
import java.util.*;
public class AnimalSoundSystem{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int count= 0;
		Animal []ani = new Animal[5];
		for(int i=0; i<ani.length; i++){
			System.out.println("Enter the choice");
			System.out.println("1.add Dog \n2.add Lion \n3.add Snake");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					ani[i] = new Dog();
					ani[i].sound();
					System.out.println(ani[i].category());
					count++;
					break;
					
				case 2:
					ani[i] = new Lion();
					ani[i].sound();
					System.out.println(ani[i].category());
					break;
				
				case 3:
					ani[i] = new Snake();
					ani[i].sound();
					System.out.println(ani[i].category());
					break;
					
				default:
					i--;
					System.out.println("Wrong choice");
					
			}
		}
		System.out.println("Number of pet animal is : "+count);
		
	}
}

abstract class Animal{
	abstract void sound();
	abstract String category();
}

class Dog extends Animal{
	void sound(){
		System.out.println("bark");
	}
	String category(){
		System.out.println("pet");
		return "pet";
	}
}

class Lion extends Animal{
	void sound(){
		System.out.println("Roar");
	}
	String category(){
		return "wild";
	}
}

class Snake extends Animal{
	void sound(){
	}
	
	String category(){
		return "reptile";
	}
}