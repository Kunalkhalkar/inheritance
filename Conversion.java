/*Q2. Temperature Conversion – Interface for Calculation
Interface: Converter
Method:
convert(double value)

Implementing Classes:
CelsiusToFahrenheit → F = C × 9/5 + 32
FahrenheitToCelsius → C = (F – 32) × 5/9
CelsiusToKelvin → K = C + 273.15

Task:
Convert 10 values using mixed converters.
Print conversions in tabular form.
Find highest converted value.

Explanation:
Demonstrates:
Math logic in implementing classes
Common interface method
Use of interface-type array
Max value calculation
*/

import java.util.*;
public class Conversion{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Converter []c = new Converter[5];
		int temp;
		for(int i =0; i<c.length; i++){
			System.out.println("Enter choice \n1.Celsius To Fahrenheit\n2.Fahrenheit To Celsius\n3.Celsius To Kelvin");
			int ch = sc.nextInt();
			switch (ch){
				case 1:
					System.out.println("Enter the tempreture in celcius");
					temp = sc.nextInt();
					c[i] = new CelsiusToFahrenheit();
					
			}
		}
	}
}
interface Converter{
	double convert(double value);
}
//F = C × 9/5 + 32
class CelsiusToFahrenheit implements Converter{
	double convert(double c){
		return (c*(9/5)+32);
	}
}
//FahrenheitToCelsius → C = (F – 32) × 5/9
class FahrenheitToCelsius implements Converter{
	double convert(double f){
		return ((f-32)*(5/9));
	}
}
//CelsiusToKelvin → K = C + 273.15
class CelsiusToKelvin implements Converter{
	
	double convert(double c){
		return c + 273.15;
	}
}
