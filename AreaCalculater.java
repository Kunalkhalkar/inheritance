/*Q4. Area Calculator – Geometric Shapes
Interface: Shape
Method:
double area()

Implementing Classes:
Circle → π × r²
Rectangle → l × b
Triangle → ½ × base × height

Task:
Create 9 shapes (3 of each type).
Print area of each.
Find shape with maximum area.

Explanation:
Strengthens:
Interface polymorphism
Math logic per shape
Maximum value logic using loops
Usage of interface array
*/
import java.util.*;
public class AreaCalculater{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);	
	double area=0, maxArea =0;
	
	
	Shape []s = new Shape[5];
	for(int i =0; i<s.length; i++){
		System.out.println("Enter the choice");
		System.out.println("1.cicle \n2.rectangle\n3.triangle");
		int ch = sc.nextInt();
		switch(ch){
			case 1:
				System.out.println("Enter the radius of circle");
				int radius =  sc.nextInt();
				s[i] = new Circle(radius);
				area = s[i].area();
				
				if(maxArea <area ){
					maxArea = area;
				}
				break;
				
			case 2:
				System.out.println("Enter the length and breadth");
				int length = sc.nextInt();
				int breadth = sc.nextInt();
				s[i] = new Rectangle(length, breadth);
				
				area = s[i].area();
				if(maxArea < area ){
					maxArea = area;
				}
				break;
				
			case 3:
				System.out.println("Enter the base and height of triangle");
				int base = sc.nextInt();
				int height = sc.nextInt();
				
				s[i] = new Triangle(base , height);
				area = s[i].area();
				if(maxArea < area ){
					maxArea = area;
				}
				break;
				
			default:
				i--;
				System.out.println("Wrong choice");
		}
		
		}
		System.out.println("the maximum area is : "+ maxArea);
		
	}
	
}
interface Shape{
	double area();// by default public abstract double area();
}

class Circle implements Shape{
	int radius;
	double PI = 3.14;
	Circle(int radius){
		this.radius = radius;
	}
	public double area(){
		double area = (double)(radius * radius * PI);
		System.out.println("Area of circle is : "+area);
		return area;
	}
}
class Rectangle implements Shape{
	int length, breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public double area(){
		double area = (double)(length * breadth);
		System.out.println("Area of Reactangle is : "+area);
		return area;
	}
	
}
class Triangle implements Shape{
	int base, height;
	
	Triangle(int base, int height){
		this.height = height;
		this.base = base;
	}
	public double area(){
		double area = (double)(0.5 * (base * height));
		System.out.println("Area of Triangle is : "+ area);
		return area;
	}
}
