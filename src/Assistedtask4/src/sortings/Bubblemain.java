package sortings;

import java.util.Arrays;

public class Bubblemain 
{
public static void main(String args[]) 
{   
  int[] data = { -2, 45, 0, 11, -9 };
  Bubble.bubbleSort(data);
  System.out.println("Sorted Array in Ascending Order:");
  System.out.println(Arrays.toString(data));
}
}