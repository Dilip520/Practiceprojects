package stacks;
import java.util.*;
public class Stackinserremve {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.add("10");
        stack.add("20");
        stack.add("30");
        stack.add("60");
        stack.add("50");
  
        System.out.println("Stack: " + stack);
        String rem_ele = stack.remove(4);
        System.out.println("Removed element: "+ rem_ele);
        System.out.println("Final Stack:" + stack);
    }
}