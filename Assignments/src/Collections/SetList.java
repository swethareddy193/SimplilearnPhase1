package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Set<SetList> sa=new HashSet<SetList>();
		SetList s1=new SetList(1,"sweth");
		SetList s2 =new SetList(2,"karthik");
		sa.add(s1);
		sa.add(s2);
		for(SetList displayset:sa) {
			System.out.println("id is" +displayset.id+ "name is" +displayset.name);
		}
		Set<SetList> sl=new TreeSet<SetList>();
		SetList s3=new SetList(1,"sweth");
		SetList s4 =new SetList(2,"karthik");
		sa.add(s1);
		sa.add(s2);
		for(SetList displayset:sl) {
			System.out.println("id is" +displayset.id+ "name is" +displayset.name);
		}		
		Set<SetList> linkset=new LinkedHashSet<SetList>();
		SetList linkhash1=new SetList(1 ,"karthikreddypesaru" );
		SetList linkhash2=new SetList(1 ,"swethareddypesaru" );
		SetList linkhash3=new SetList(1 ,"swethareddypesaru" );
		linkset.add(linkhash1);
		linkset.add(linkhash2);
		linkset.add(linkhash3);
		for(SetList slist:linkset) {
			System.out.println("id is"+slist.id+" "+"name is"+" "+slist.name);
			
		}
		
		
		
		

	}
	int id;
	String name;
	public SetList() {
		
	}
public SetList(int id,String name) {
	this.id=id;
	this.name=name;
		
	}

}
