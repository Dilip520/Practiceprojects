package methodpack;

public class myouter
{
	 class myinner
	 {
		 void display()
		 {
			 System.out.println("this is inner class example");
		 }
	 }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		myouter.myinner you = new myouter().new myinner();
          you.display();
	}

}
