/*Q3. University Admission System – Priority Ranking
Base class: Applicant
Fields: name, score

 Method: getRankScore() → returns score directly

Child classes:
SportsQuota: adds +15 to score

DefenseQuota: adds +10 to score

General: no extra

NRIQuota: +20 but fee is 3× normal

Task:
Take 12 applicants (mix of all categories).
Override getRankScore() in each child.
Sort applicants by rank score (high to low).
Print top 3 shortlisted candidates.

Concepts
Overriding
Sorting array of objects
Multiple child classes
Priority logic
*/
import java.util.*;
public class Addmission{
	String name;
	int score;
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Applicant []stud = new Applicant[3];
		String name;
		int score;
		for(int i = 0; i< stud.length; i++){
			
		System.out.println("1. SportsQuota student\n2. DefenseQuota student\n3.General student\n4.NRIQuota student");
		int ch = sc.nextInt();
		switch(ch){
			case 1:
				System.out.println("Enter the name and score of SportsQuota student");
				 name = sc.next();
				 score = sc.nextInt();
				 stud[i] = new SportsQuota(name, score);
				break;
				
			case 2:
				System.out.println("Enter the name and score of DefenseQuota student");
				 name = sc.next();
				 score = sc.nextInt();
				 stud[i] = new DefenseQuota(name, score);
				 
				break;
				
			case 3:
				System.out.println("Enter the name and score of General student");
				 name = sc.next();
				 score = sc.nextInt();
				 stud[i] = new General(name, score);
				 
				break;
				
			case 4:
				System.out.println("Enter the name and score of NRIQuota student");
				 name = sc.next();
				 score = sc.nextInt();
				 stud[i] = new NRIQuota(name, score);
				 
				break;
				
			default: 
				i--;
				System.out.println("Wrong choice");
		}
		
		}
		for(int i = 0; i<stud.length; i++){
			for(int j=0; j<stud.length; j++){
				if(stud[j].score < stud[i].score){
					Applicant temp = stud[j];
					stud[j] = stud[i];
					stud[i] = temp;
				}
			}
		}
		System.out.println("-----------------------------");
		System.out.println("high to low Score");
		for(Applicant a:stud ){
			System.out.println(a.name +"\t"+a.score);
		}
		System.out.println("-----------------------------");
		System.out.println("top 3");
		for(int i = 0; i<3; i++){
			System.out.println(stud[i].name +"\t"+stud[i].score);
			
		}
	}
}

class Applicant{
	String name;
	int score;
	
	Applicant(String name, int score){
		this.name = name;
		this.score = score;
	}
	int getRankScore(){
		return score;
	}
	
}
//SportsQuota: adds +15 to score
class SportsQuota extends Applicant{
	SportsQuota(String name, int score){
		super(name, score);
	}
	int getRankScore(){
		return score + 15;
	}
}
//DefenseQuota: adds +10 to score
class DefenseQuota extends Applicant{
	
	DefenseQuota(String name, int score){
		super(name, score);
	}
	
	int getRankScore(){
		return score + 10;
	}
}
//General: no extra
class General extends Applicant{
	General(String name, int score){
		super(name, score);
	}
	int getRankScore(){
		return score;
	}
}
//NRIQuota: +20 but fee is 3× normal
class NRIQuota extends Applicant{
	NRIQuota(String name, int score){
		super(name, score);
	}
	int getRankScore(){
		return score + 20;
	}
}