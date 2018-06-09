package employerdetails;

import java.util.Scanner;

public class AscendingOrder {
	int i,j,temp;
	int a[];
	
	public void value(){
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s1.nextInt();
		a=new int [n];
		System.out.println("Enter array values");
		for(i=0;i<n;i++){
			a[i]=s1.nextInt();
			
		}
	}
	void arrangeValues(){
		System.out.println("descending order");
		int n=a.length;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	void displayValues(){
		for(int i=0;i<a.length;i++)
			System.out.println("Elements in descending order" +a[i]);

	}
	public static void main(String[] args) {
		AscendingOrder obj= new AscendingOrder();
		//obj.setValues();
		obj.arrangeValues();
		obj.displayValues();
	}
}
