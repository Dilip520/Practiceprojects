import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args)
	{
		        Map<String, Integer> age = new HashMap<>();
		        Map<String, Integer> salary = new TreeMap<>();
		        age.put("harsha", 21);
		        age.put("subbu", 22);
		        age.put("dinkar", 32);
		        System.out.println("Map: " + age);
		        System.out.println("Keys: " + age.keySet());
		        System.out.println("Values: " +age.values());
		        System.out.println("Entries: " + age.entrySet());
		        int value = age.remove("dinkar");
		        System.out.println("Removed Value: " + value);
		        salary.put("harsha", 2100);
		        salary.put("subbu", 22000);
		        System.out.println("treeMap: " + salary);
		        
	}

}
