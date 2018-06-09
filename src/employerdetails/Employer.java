package employerdetails;
import java.util.*;
public class Employer {
	Scanner s = new Scanner(System.in);
	EmployerValues empObj = new EmployerValues();
	
	public static void main(String[] args) {
		Employer  Employerobj= new Employer();
		Employerobj.employerDetails();
		
	}
	
	
	public void employerDetails(){
		System.out.println("Enter the Employer Name");
empObj.emName=s.next(); 
System.out.println("Enter the Employer Address");
empObj.emAddress=s.next();
System.out.println("Enter the Employer Department");
empObj.emDepart=s.next();
System.out.println("Enter the Employer Number of Employees");
empObj.emNOE=s.nextInt();
	}
	
	
	
	public void displayEmployerDetails(){
		System.out.println("Employer name is "+empObj.getEmName());
		System.out.println("Employer adress is "+ empObj.getEmAddress());
		System.out.println("Employer Department is "+empObj.getEmDepart());
		System.out.println("Number of Employees are "+empObj.getEmNOE());
	}


}
