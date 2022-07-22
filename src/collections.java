import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class collections 
{
	public static void main(String[] args) 
	{
		 ArrayList<String> animals = new ArrayList<String>();
	        // Add elements
	        animals.add("Dog");
	        animals.add("Cat");
	        animals.add("Horse");
	        System.out.println("ArrayList: " + animals);
	        Vector<Integer> vec = new Vector();
	        vec.addElement(152); 
		      vec.addElement(320); 
		      System.out.println("vector:"+vec);
		      HashSet<String> set=new HashSet<String>();  
		      set.add("Harsha");  
		      set.add("Dilip");  
		      set.add("subbu");  
		      set.add("Dinakar");  
		      Iterator<String> itr=set.iterator();  
		      System.out.println("Hashset:");
		      while(itr.hasNext())
		      {   
		      System.out.println(itr.next());  

		      }
	}
}
