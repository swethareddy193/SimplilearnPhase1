import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class MapsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Map<String,String> Rollno=new HashMap<String,String>();
		Rollno.put("swetha", "56");
		Rollno.put("karthik", "93");
		Set<String> allkeys=Rollno.keySet();
		for(String keys:allkeys) {
		System.out.println(keys+":->" +" " +Rollno.get(keys));
			
		}
		
	}
	
}
