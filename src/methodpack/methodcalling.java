package methodpack;

public class methodcalling
{
	public static void swap(int a,int b)
	{
		System.out.println("before swap.  a="+a+"b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("after swap.  a="+a+"b="+b);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=10;
		int b=40;
        swap(a,b);
	}

}
