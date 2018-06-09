package classdetailed;

public class Retrieve {

	
	public void Printsubjects(){
		System.out.println("press 1 for Physics");
		System.out.println("press 2 for Chemistry");
		System.out.println("press 3 for Mathematics");
		System.out.println("press 4 for Biology");
	}
	public void Printgrades(){
		System.out.println("press 1 for A");
		System.out.println("press 2 for B");
		System.out.println("press 3 for C");
		System.out.println("press 4 for D");
	}
	
	
	DataFiles df = new DataFiles();
	
	public void getthesubject(int a){
		
		switch(a){
		
		case 1:
			System.out.println("People enrolled in Physics are :");
			df.Readsub(a);
		   break;
		case 2:
			System.out.println("People enrolled in Chemistry are :");
			df.Readsub(a);
		   break;
		case 3:
			System.out.println("People enrolled in Mathematics are :");
			df.Readsub(a);
		   break;
		case 4:
			System.out.println("People enrolled in Biology are :");
			df.Readsub(a);
		   break;
		default :
			System.out.println("sorry wrong selection");	
		}
		
	}
	
public void gettheGrade(int a){
		
		switch(a){
		
		case 1:
			System.out.println("People who achieved A are :");
			df.Readgra(a);
		   break;
		case 2:
			System.out.println("People who achieved B are :");
			df.Readgra(a);
		   break;
		case 3:
			System.out.println("People who achieved C are :");
			df.Readgra(a);
		   break;
		case 4:
			System.out.println("People who achieved D are :");
			df.Readgra(a);
		   break;
		default :
			System.out.println("sorry wrong selection");	
		}
		
	}
	
}
