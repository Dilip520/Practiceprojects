
public class constructor1
{

 int x,g;
 //passing no arguments
 constructor1()
 {
	x=5;
	System.out.println("the value of :\n"+x);
 }
 //parameterized constructors
 constructor1(int a,int b)
 {
	this.i=a;
	 this.j=b;
	 g=i+j;
	 System.out.println("the sum of i,j is:"+g);
 }
 //default constructor
 void show()
 {
	 System.out.println(+x);
	 System.out.println(+g);
	 
 }
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 constructor1 cn=new  constructor1();
		 cn.show();
		
	}

}
