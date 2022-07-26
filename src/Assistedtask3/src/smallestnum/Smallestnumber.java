package smallestnum;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
public class Smallestnumber 
{
 public static int findKSmallest(List<Integer> input, int k)
    {
        
        if (input == null || input.size() < k) {
            System.exit(-1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(input);
 
     
        while (--k > 0) {
            pq.poll();
        }
 
        return pq.peek();
    }
 
    public static void main(String[] args)
    {
        List<Integer> input = Arrays.asList(10,42,52,40,20,13);
        int k = 4;
 
        System.out.println("4'th smallest array element is " +
                        findKSmallest(input, k));
    }
}