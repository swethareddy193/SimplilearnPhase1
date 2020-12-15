package Collections;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	int id;
	String name;
	String email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<StudentList> Student=new ArrayList<StudentList>();
	StudentList s1=new StudentList(1,"swetha","swethar839");
	StudentList s2=new StudentList(2,"swathi","swathir839");
	Student.add(s1);
	Student.add(s2);
//	System.out.println(Student.get(1).email);
	for(StudentList studentdata:Student) {
		System.out.println("Id is :"+studentdata.id+ "name is :"+studentdata.name.toString()+ "email is :"+studentdata.email.toString() );
		
	}
//	System.out.println(Student.get(1));
	
	
	
	}
	
	public StudentList () {
		
	}
public StudentList (int id,String name,String email) {
	this.id=id;
	this.name=name;
	this.email=email;
	
	}

}
