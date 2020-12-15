package Collections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Linkedlist> listadd=new LinkedList<Linkedlist>();
		Linkedlist info1=new Linkedlist("karthik",190000.68);
		Linkedlist info2=new Linkedlist("swetha",125000.68);
		
		listadd.add(info1);
		listadd.add(info2);
		for(Linkedlist list:listadd) {
			System.out.println("Name is"+ list.name+ "email is:"+ list.salary);
		} 
		
		

	}
public String name;
public double salary;


	public Linkedlist() {
		
	}
public Linkedlist(String name,double salary) {
	
		this.name=name;
		this.salary=salary;
	}
}
