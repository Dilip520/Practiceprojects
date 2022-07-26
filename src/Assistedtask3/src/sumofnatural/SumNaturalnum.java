package sumofnatural;

public class SumNaturalnum 
{
static int sumNatural(int n)
{
    int sum = (n * (n + 1)) / 2;
    return sum;
}
static int sumRange(int left, int right)
{
    return sumNatural(right) - sumNatural(left - 1);
}
public static void main(String[] args)
{
    int left = 2, right = 5;
    System.out.println("Sum of Natural numbers from Left to Right is "+sumRange(left, right));
 
}
}