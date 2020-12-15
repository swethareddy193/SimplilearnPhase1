package Constructor;

public class PracticeConstructor {
	
	int id;
	String rollno;
	String name;
	public void Getemployee() {
		System.out.println("the name is:"+name+ "the id is:" +id+ "the rollno is:" +rollno);
	} 
	public PracticeConstructor() {
		
	}
	public PracticeConstructor(String name) {
		this.name=name;
		
	}
	public PracticeConstructor(String rollno,int id) {
		this.rollno=rollno;
		this.id=id;
		
	}

}
