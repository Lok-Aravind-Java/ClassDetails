package classdetailed;

public class Enroll {
	
	
	private String Name;
	private String Subject;
	private String Grade;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(int subject) {
		 
		if(subject == 1){
			Subject = "Physics";
			
		}else if(subject == 2){
			Subject = "Chemistry";
		}else if(subject == 3){
			Subject = "Mathematics";
		}else if(subject == 4){
			Subject = "Biology";
		}
		
		 
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	

}
