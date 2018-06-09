package classdetailed;
import java.util.*;
import java.lang.*;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int abc = 0;
		do{
			System.out.println("If you want to Enroll the details press 1");
			System.out.println("If you want to Get the details press 2");
			System.out.println("If you are done press 3");
			int i = input.nextInt();
			if( i==1 ){
				Enroll g = new Enroll();
				DataFiles df = new DataFiles();
				System.out.println("Enter the Name");
				System.out.println();
				String a = input.nextLine();
				g.setName(a);
				df.namee();
				System.out.println("Enter the Subject Number");
				System.out.println("Physics - 1\nChemistry - 2\nMathematics - 3\nBiology-4");
				int b = input.nextInt();
				if(b==1||b==2||b==3||b==4){
				g.setSubject(b);
				df.sub();
				}
				else{
					System.out.println("sorry wrong option");
				}
				System.out.println("Enter the Grade in Uppercase");
				g.setGrade(input.nextLine());
				df.gra();
				
			}else if(i == 2){
				Retrieve r = new Retrieve();
				System.out.println("Select 1 for subject info");
				System.out.println("Select 2 for student info");
				System.out.println("Select 3 for grade info");
				int z = input.nextInt();
				if(z==1){
					r.Printsubjects();
					int a = input.nextInt();
					r.getthesubject(a);
					
				}else if(z==2){
					System.out.println("Enter the name of the person");
					String b = input.nextLine();
					DataFiles df1 = new DataFiles();
					df1.Readnam(b);
				}else if(z==3){
					System.out.println("Enter the grade you want");
					r.Printgrades();
					int c = input.nextInt();
					r.gettheGrade(c);
					
				}else {
					System.out.println("Sorry chosen wrong option");
				}	
			}
			else if(i==3){
			System.out.println("Thank you");
			abc++;
			}else{
				System.out.println("sorry wrong input");
			}
		}while(abc==0);
	
	}
	
}
