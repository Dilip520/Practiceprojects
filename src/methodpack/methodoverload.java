package methodpack;

public class methodoverload 
{
	public void vehicle(int a)
	
	{
		System.out.println("bike has 2 wheels");
	}
	public void vehicle(int b,int c)
	{
		System.out.println("car has 4 wheels");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 methodoverload v=new  methodoverload();
		 v.vehicle(4);
		 v.vehicle(1,4);
		 
         
	}

}
