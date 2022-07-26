package queues;
import java.util.*;

public class queueinserremove 
{
	    public static void main(String args[])
	    {
	  
	       
	        Queue<Integer> Que = new LinkedList <Integer>();
	        Que.add(23);
	        Que.add(3);
	        Que.add(45);
	        Que.add(10);
	        Que.add(20);
	        System.out.println("Queue: " + Que);
	        System.out.println("Removed element: " +Que.remove(45));
	        System.out.println("Final Queue: "+ Que);
	    
	}
}
