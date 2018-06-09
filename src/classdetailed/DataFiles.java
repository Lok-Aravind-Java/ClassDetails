package classdetailed;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
public class DataFiles {
	
	Enroll en = new Enroll();
	private Formatter d;
	File abc = new File("datafile.txt");
	
	        public void namee(){
	        	if(!abc.exists())
                 	try {
						d = new Formatter ("datafile.txt");
					      d.format("%s \t",en.getName());
					      d.close();
                 	} catch (FileNotFoundException e) {
						e.printStackTrace();
					}catch(NullPointerException e){
						e.printStackTrace();
					}
	        	else{
	        		try{
	        		 d.format("%s \t",en.getName());
	        		 d.close();
	        		}catch(NullPointerException e){
	        			e.printStackTrace();
	        		}
	        	}
	        }
	        public void sub(){
	        	if(!abc.exists())
                 	try {
						  d = new Formatter ("datafile.txt");
					      d.format("%s \t",en.getSubject());
					      d.close();
                 	} catch (Exception e) {
						e.printStackTrace();
					}
	        	else{
	        		 d.format("%s \t",en.getSubject() );
	        	     d.close();
	        	}
	        }
	        public void gra(){
	        	if(!abc.exists())
                 	try {
						d = new Formatter ("datafile.txt");
					      d.format("%s \t",en.getGrade());
					      d.close();
                 	} catch (Exception e) {
						e.printStackTrace();
					}
	        	else{
	        		 d.format("%s \t",en.getGrade() );
	        		 d.close();
	        	}
	  }

	        
	        
          private Scanner sc;
          
          public void Readnam(String a){
             
        	  try {
			sc = new Scanner(new File("datafile.txt"));
			
			     while(sc.hasNext()){
			    	 String d = sc.next();
			    	 String e = sc.next(); 
			    	 String f = sc.next();
			    	 
			    	 if (a == d){
			    		 System.out.printf("%s %s %s ",d,e,f);
			    	 }
			    	 
			     }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
          
          }
          
          
          public void Readsub(int i){
        	  try {
      			sc = new Scanner(new File("datafile.txt"));
      			if(i == 1 ){
      			while (sc.hasNext()){
      				String a = sc.next();
      				String b = sc.next();
      				String c = sc.next();
      				if ( b == "Physics"){
      				}
      				System.out.printf("%s",a);
      				}
      			}else if(i==2){
      			while (sc.hasNext()){
          				String a = sc.next();
          				String b = sc.next();
          				String c = sc.next();
          				if ( b == "Chemistry"){
          				}
          				System.out.printf("%s",a);
          				}
      				
      			}else if(i == 3){
      				while (sc.hasNext()){
          				String a = sc.next();
          				String b = sc.next();
          				String c = sc.next();
          				if ( b == "Mathematics"){
          				}
          				System.out.printf("%s",a);
          				}
      			}else if(i == 4){
      				while (sc.hasNext()){
          				String a = sc.next();
          				String b = sc.next();
          				String c = sc.next();
          				if ( b == "Biology"){
          				}
          				System.out.printf("%s",a);
          				}
      			}
      			
      			
      		} catch (FileNotFoundException e) {
      			e.printStackTrace();
      		}
          }
           
          public void Readgra(int s){
        	 
        	  try {
      			sc = new Scanner(new File("datafile.txt"));
      			if(s == 1 ){
          			while (sc.hasNext()){
          				String a = sc.next();
          				String b = sc.next();
          				String c = sc.next();
          				if ( c == "A"){
          				}
          				System.out.printf("%s",a);
          				}
          			}else if(s==2){
          			while (sc.hasNext()){
              				String a = sc.next();
              				String b = sc.next();
              				String c = sc.next();
              				if ( c == "B"){
              				}
              				System.out.printf("%s",a);
              				}
          				
          			}else if(s == 3){
          				while (sc.hasNext()){
              				String a = sc.next();
              				String b = sc.next();
              				String c = sc.next();
              				if ( c == "C"){
              				}
              				System.out.printf("%s",a);
              				}
          			}else if(s == 4){
          				while (sc.hasNext()){
              				String a = sc.next();
              				String b = sc.next();
              				String c = sc.next();
              				if ( c == "D"){
              				}
              				System.out.printf("%s",a);
              				}
      		} 
      			
        	  }catch (FileNotFoundException e) {
      			e.printStackTrace();
      		}
          
          }
}
