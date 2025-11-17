/*recalling java*/
/*Q. Write a java program to check number Is armstrong number or not armstrong using 
function.*/
import java.util.*;
public class armStrong{
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nuber to check armstrong or not");
		int num = sc.nextInt();
		ArmStrong a = new ArmStrong();
		a.isArmStrong(num);
	}
}
class  ArmStrong{
	void isArmStrong(int num){
		int temp = num, count = 0;
		while(num!=0){
			num%10;
			++count;
			num/10;
		}
		num = temp;
		int digit=0;
		int result=0;
		while(num!=0){
			digit = num%10;
			result += power(digit, count);
			num/=10;
		}
		if(result == temp){
			System.out.println("Number is Arm Strong");
		}
		else{
			System.out.println("Number is not Arm Strong");
		}
	}
	
	int power(int digit, int power){
		if(power == 0)
			return 1;
		int sum =1;

		for(int i = power; i>0; i--){
			sum *= digit;
		}
		return sum;
	}
}