package Returntype;

import java.util.Scanner;

public class ReturntypesAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	System.out.println("enter the two numbers");
	
	int a=s.nextInt();
	System.out.println("enter the two numbers");
	int b=s.nextInt();
		ReturntypesAssignments da=new ReturntypesAssignments();
		da.Add(a, b);
		
		da.Returnfloat(a, b);

	}
	public int Add(int a,int b) {
		int c=a+b;
		System.out.println("the addition is:"+c);
return c;
	}
	public String Returnstring(String name) {
		
		System.out.println("the name is:"+name);
		return name;
	}
	public float Returnfloat(float c,float d) {
		float e=c-d;
		System.out.println("the substraction is:"+e);
return c;
	}

}
